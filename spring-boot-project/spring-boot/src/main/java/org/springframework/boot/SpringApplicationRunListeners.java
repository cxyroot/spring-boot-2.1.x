/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.logging.Log;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.util.ReflectionUtils;

/**
 * A collection of {@link SpringApplicationRunListener}.
 *
 * @author Phillip Webb
 */
class SpringApplicationRunListeners {

	private final Log log;

	private final List<SpringApplicationRunListener> listeners;

	SpringApplicationRunListeners(Log log, Collection<? extends SpringApplicationRunListener> listeners) {
		this.log = log;
		for (SpringApplicationRunListener listener : listeners) {
			System.out.println(listener);
		}
		this.listeners = new ArrayList<>(listeners);
	}

	public void starting() {
		//组合对象模式
		System.out.println("组合对象模式");
		System.out.println("org.springframework.boot.SpringApplicationRunListeners.starting");
		for (SpringApplicationRunListener listener : this.listeners) {
			System.err.println(listener.toString());
			listener.starting();
		}
	}

	public void environmentPrepared(ConfigurableEnvironment environment) {
		System.out.println("org.springframework.boot.SpringApplicationRunListeners.environmentPrepared");
		for (SpringApplicationRunListener listener : this.listeners) {
			listener.environmentPrepared(environment);
		}
	}

	public void contextPrepared(ConfigurableApplicationContext context) {
		System.out.println("org.springframework.boot.SpringApplicationRunListeners.contextPrepared");
		for (SpringApplicationRunListener listener : this.listeners) {
			listener.contextPrepared(context);
		}
	}

	public void contextLoaded(ConfigurableApplicationContext context) {
		System.out.println("org.springframework.boot.SpringApplicationRunListeners.contextLoaded");
		for (SpringApplicationRunListener listener : this.listeners) {
			listener.contextLoaded(context);
		}
	}

	public void started(ConfigurableApplicationContext context) {
		System.out.println("org.springframework.boot.SpringApplicationRunListeners.started");
		for (SpringApplicationRunListener listener : this.listeners) {
			listener.started(context);
		}
	}

	public void running(ConfigurableApplicationContext context) {
		System.out.println("org.springframework.boot.SpringApplicationRunListeners.running");
		for (SpringApplicationRunListener listener : this.listeners) {
			listener.running(context);
		}
	}

	public void failed(ConfigurableApplicationContext context, Throwable exception) {
		System.out.println("org.springframework.boot.SpringApplicationRunListeners.failed");
		for (SpringApplicationRunListener listener : this.listeners) {
			callFailedListener(listener, context, exception);
		}
	}

	private void callFailedListener(SpringApplicationRunListener listener, ConfigurableApplicationContext context,
			Throwable exception) {
		try {
			listener.failed(context, exception);
		}
		catch (Throwable ex) {
			if (exception == null) {
				ReflectionUtils.rethrowRuntimeException(ex);
			}
			if (this.log.isDebugEnabled()) {
				this.log.error("Error handling failed", ex);
			}
			else {
				String message = ex.getMessage();
				message = (message != null) ? message : "no error message";
				this.log.warn("Error handling failed (" + message + ")");
			}
		}
	}

}
