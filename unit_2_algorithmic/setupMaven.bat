@echo off
set MAVEN_OPTS=-Xmx2G -Dfile.encoding=UTF-8
set MAVEN_HOME=%~dp0apache-maven-3.6.3
set PATH=%MAVEN_HOME%\bin;%PATH%
set CLASSPATH=
echo Setting ant home to: %MAVEN_HOME%
mvn -v