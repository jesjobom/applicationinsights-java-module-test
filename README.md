# MS Application Insights as Java Module test

In answer to issue [Exception Provider class xmlpull not found in modularized application #1155](https://github.com/microsoft/ApplicationInsights-Java/issues/1155)

```bash
jesjobom@home:~/Projetos/applicationinsights-java-module$ gradle --version

------------------------------------------------------------
Gradle 6.2.2
------------------------------------------------------------

Build time:   2020-03-04 08:49:31 UTC
Revision:     7d0bf6dcb46c143bcc3b7a0fa40a8e5ca28e5856

Kotlin:       1.3.61
Groovy:       2.5.8
Ant:          Apache Ant(TM) version 1.10.7 compiled on September 1 2019
JVM:          11 (Oracle Corporation 11+28)
OS:           Linux 4.15.0-106-generic amd64

jesjobom@home:~/Projetos/applicationinsights-java-module$ java --version
openjdk 11 2018-09-25
OpenJDK Runtime Environment 18.9 (build 11+28)
OpenJDK 64-Bit Server VM 18.9 (build 11+28, mixed mode)

jesjobom@home:~/Projetos/applicationinsights-java-module$ gradle clean build

> Configure project :
Project : => 'com.jesjobom' Java module

> Task :test FAILED
Error occurred during initialization of boot layer
java.lang.module.FindException: Unable to derive module descriptor for /home/jesjobom/.gradle/caches/modules-2/files-2.1/com.microsoft.azure/applicationinsights-core/2.6.1/c28ef86fb7bd4fe0107f29845e16613f096d697d/applicationinsights-core-2.6.1.jar
Caused by: java.lang.module.InvalidModuleDescriptorException: Provider class com.microsoft.applicationinsights.core.dependencies.xmlpull.mxp1.MXParser,org.xmlpull.mxp1_serializer.MXSerializer not in module

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':test'.
> Process 'Gradle Test Executor 2' finished with non-zero exit value 1

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

Deprecated Gradle features were used in this build, making it incompatible with Gradle 7.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/6.2.2/userguide/command_line_interface.html#sec:command_line_warnings

BUILD FAILED in 1s
5 actionable tasks: 5 executed

jesjobom@home:~/Projetos/applicationinsights-java-module$ 

```