## idea版本

```shell
IntelliJ IDEA 2021.2.2 (Community Edition)
Build #IC-212.5284.40, built on September 14, 2021
Runtime version: 11.0.12+7-b1504.28 amd64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
    Windows 10 10.0
GC: G1 Young Generation, G1 Old Generation
Memory: 2030M
Cores: 16
Non-Bundled Plugins: idea.plugin.protoeditor (212.5080.8), org.jetbrains.kotlin (212-1.5.31-release-546-IJ4638.7), com.haulmont.jpab (2022.1.1-212)
Kotlin: 212-1.5.31-release-546-IJ4638.7
```

## jdk版本

```shell
java version "1.8.0_201"
Java(TM) SE Runtime Environment (build 1.8.0_201-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.201-b09, mixed mode)
```

maven版本

```shell
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: D:\JavaTools\apache-maven-3.6.3\bin\..
Java version: 1.8.0_201, vendor: Oracle Corporation, runtime: C:\Java\jdk1.8.0_201\jre
Default locale: zh_CN, platform encoding: GBK
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows
```

## 构建方法

```
mvn clean install -DskipTests -Pfast
```

## 启动方法

```shell
sample.tomcat.SampleTomcatApplication
```



## 启动日志

```shell
C:\Java\jdk1.8.0_201\bin\java.exe -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:51399,suspend=y,server=n -javaagent:D:\JavaTools\ideaIC-2021.2.2.win\plugins\Groovy\lib\agent\gragent.jar -javaagent:D:\JavaTools\ideaIC-2021.2.2.win\plugins\java\lib\rt\debugger-agent.jar -Dfile.encoding=UTF-8 -classpath C:\Java\jdk1.8.0_201\jre\lib\charsets.jar;C:\Java\jdk1.8.0_201\jre\lib\deploy.jar;C:\Java\jdk1.8.0_201\jre\lib\ext\access-bridge-64.jar;C:\Java\jdk1.8.0_201\jre\lib\ext\cldrdata.jar;C:\Java\jdk1.8.0_201\jre\lib\ext\dnsns.jar;C:\Java\jdk1.8.0_201\jre\lib\ext\jaccess.jar;C:\Java\jdk1.8.0_201\jre\lib\ext\jfxrt.jar;C:\Java\jdk1.8.0_201\jre\lib\ext\localedata.jar;C:\Java\jdk1.8.0_201\jre\lib\ext\nashorn.jar;C:\Java\jdk1.8.0_201\jre\lib\ext\sunec.jar;C:\Java\jdk1.8.0_201\jre\lib\ext\sunjce_provider.jar;C:\Java\jdk1.8.0_201\jre\lib\ext\sunmscapi.jar;C:\Java\jdk1.8.0_201\jre\lib\ext\sunpkcs11.jar;C:\Java\jdk1.8.0_201\jre\lib\ext\zipfs.jar;C:\Java\jdk1.8.0_201\jre\lib\javaws.jar;C:\Java\jdk1.8.0_201\jre\lib\jce.jar;C:\Java\jdk1.8.0_201\jre\lib\jfr.jar;C:\Java\jdk1.8.0_201\jre\lib\jfxswt.jar;C:\Java\jdk1.8.0_201\jre\lib\jsse.jar;C:\Java\jdk1.8.0_201\jre\lib\management-agent.jar;C:\Java\jdk1.8.0_201\jre\lib\plugin.jar;C:\Java\jdk1.8.0_201\jre\lib\resources.jar;C:\Java\jdk1.8.0_201\jre\lib\rt.jar;D:\JavaCode\SrcCode\spring-boot-2.1.x\spring-boot-samples\spring-boot-sample-tomcat\target\classes;D:\JavaCode\SrcCode\spring-boot-2.1.x\spring-boot-project\spring-boot\target\classes;D:\JavaCode\SrcCode\spring-boot-2.1.x\spring-boot-project\spring-boot-autoconfigure\target\classes;D:\JavaTools\localRepository\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;D:\JavaTools\localRepository\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;D:\JavaTools\localRepository\org\apache\logging\log4j\log4j-to-slf4j\2.11.2\log4j-to-slf4j-2.11.2.jar;D:\JavaTools\localRepository\org\apache\logging\log4j\log4j-api\2.11.2\log4j-api-2.11.2.jar;D:\JavaTools\localRepository\org\slf4j\jul-to-slf4j\1.7.30\jul-to-slf4j-1.7.30.jar;D:\JavaTools\localRepository\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar;D:\JavaTools\localRepository\org\springframework\spring-core\5.1.16.RELEASE\spring-core-5.1.16.RELEASE.jar;D:\JavaTools\localRepository\org\springframework\spring-jcl\5.1.16.RELEASE\spring-jcl-5.1.16.RELEASE.jar;D:\JavaTools\localRepository\org\yaml\snakeyaml\1.23\snakeyaml-1.23.jar;D:\JavaTools\localRepository\org\apache\tomcat\embed\tomcat-embed-core\9.0.36\tomcat-embed-core-9.0.36.jar;D:\JavaTools\localRepository\org\apache\tomcat\embed\tomcat-embed-el\9.0.36\tomcat-embed-el-9.0.36.jar;D:\JavaTools\localRepository\org\apache\tomcat\embed\tomcat-embed-websocket\9.0.36\tomcat-embed-websocket-9.0.36.jar;D:\JavaTools\localRepository\org\springframework\spring-webmvc\5.1.16.RELEASE\spring-webmvc-5.1.16.RELEASE.jar;D:\JavaTools\localRepository\org\springframework\spring-aop\5.1.16.RELEASE\spring-aop-5.1.16.RELEASE.jar;D:\JavaTools\localRepository\org\springframework\spring-beans\5.1.16.RELEASE\spring-beans-5.1.16.RELEASE.jar;D:\JavaTools\localRepository\org\springframework\spring-context\5.1.16.RELEASE\spring-context-5.1.16.RELEASE.jar;D:\JavaTools\localRepository\org\springframework\spring-expression\5.1.16.RELEASE\spring-expression-5.1.16.RELEASE.jar;D:\JavaTools\localRepository\org\springframework\spring-web\5.1.16.RELEASE\spring-web-5.1.16.RELEASE.jar;D:\JavaTools\localRepository\org\slf4j\slf4j-api\1.7.30\slf4j-api-1.7.30.jar;D:\JavaTools\ideaIC-2021.2.2.win\lib\idea_rt.jar sample.tomcat.SampleTomcatApplication
Connected to the target VM, address: '127.0.0.1:51399', transport: 'socket'
org.springframework.boot.SpringApplication.SpringApplication(org.springframework.core.io.ResourceLoader, java.lang.Class<?>...)
class [Ljava.lang.StackTraceElement;
org.springframework.boot.SpringApplication.run(java.lang.String...)
Create and configure the environment
org.springframework.boot.SpringApplication.prepareEnvironment

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                        

org.springframework.boot.SpringApplication.createApplicationContext
2022-03-05 20:42:18.976  INFO 45296 --- [           main] sample.tomcat.SampleTomcatApplication    : Starting SampleTomcatApplication on YANG with PID 45296 (D:\JavaCode\SrcCode\spring-boot-2.1.x\spring-boot-samples\spring-boot-sample-tomcat\target\classes started by YANG in D:\JavaCode\SrcCode\spring-boot-2.1.x)
2022-03-05 20:42:18.980  INFO 45296 --- [           main] sample.tomcat.SampleTomcatApplication    : No active profile set, falling back to default profiles: default
refreshContext....................
org.springframework.boot.SpringApplication.refreshContext
123456789
org.springframework.boot.SpringApplication.refresh
org.springframework.boot.web.embedded.tomcat.TomcatWebServer.TomcatWebServer(org.apache.catalina.startup.Tomcat)
org.springframework.boot.web.embedded.tomcat.TomcatWebServer.initialize
2022-03-05 20:42:20.375  INFO 45296 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2022-03-05 20:42:20.400  INFO 45296 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-03-05 20:42:20.401  INFO 45296 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.36]
2022-03-05 20:42:20.499  INFO 45296 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-03-05 20:42:20.500  INFO 45296 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1466 ms
2022-03-05 20:42:20.534  INFO 45296 --- [           main] sample.tomcat.SampleTomcatApplication    : ServletContext initialized
2022-03-05 20:42:20.630  INFO 45296 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
org.springframework.boot.web.embedded.tomcat.TomcatWebServer.start
2022-03-05 20:42:20.783  INFO 45296 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2022-03-05 20:42:20.785  INFO 45296 --- [           main] sample.tomcat.SampleTomcatApplication    : Started SampleTomcatApplication in 2.26 seconds (JVM running for 2.883)

```



