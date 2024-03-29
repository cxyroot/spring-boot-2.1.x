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

package sample.tomcat;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ContextResource;
import org.springframework.core.io.support.SpringFactoriesLoader;

@SpringBootApplication
public class SampleTomcatApplication {

	private static Log logger = LogFactory.getLog(SampleTomcatApplication.class);

	@Bean
	protected ServletContextListener listener() {
		return new ServletContextListener() {

			@Override
			public void contextInitialized(ServletContextEvent sce) {
				logger.info("ServletContext initialized");
			}

			@Override
			public void contextDestroyed(ServletContextEvent sce) {
				logger.info("ServletContext destroyed");
			}

		};
	}

	/**
	 * 配置
	 * @param args
	 */
	public static void main(String[] args) {
		//String
		//AnnotationConfigServletWebServerApplicationContext
		SpringApplication application = new SpringApplication(SampleTomcatApplication.class);

		//推断 Web 应用类型
		//application.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext run = application.run();
		String[] beanDefinitionNames = run.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.err.println(beanDefinitionName);
		}
		//观察者设计模式

		//SpringFactoriesLoader.loadSpringFactories()
		//org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent
		//(org.springframework.context.ApplicationEvent, org.springframework.core.ResolvableType)

		/*
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();
		for (StackTraceElement stackTraceElement : stackTrace) {
			System.out.println(stackTraceElement.getClass().toString());
		}
		*/
	}

}
