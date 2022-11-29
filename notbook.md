Assert.notNull(primarySources, "PrimarySources must not be null");


应用程序应作为反应式web应用程序运行，并应启动嵌入式反应式web服务器
The application should run as a reactive web application and should start an embedded reactive web server.

The application should run as a servlet-based web application and should start an embedded servlet web server.
应用程序应作为基于servlet的web应用程序运行，并应启动嵌入式servlet web服务器。

堆栈跟踪中的元素，由Throwable.getStackTrace（）返回。每个元素表示单个堆栈帧。除堆栈顶部的帧外，
所有堆栈帧都表示方法调用。堆栈顶部的帧表示生成堆栈跟踪的执行点。通常，这是创建与堆栈跟踪对应的可丢弃文件的点。


StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();
for (StackTraceElement stackTraceElement : stackTrace) {
    System.out.println(stackTraceElement.getClass().toString());
}