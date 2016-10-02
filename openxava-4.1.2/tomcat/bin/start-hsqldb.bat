@echo off

if "%2" == "" goto argumentsError

rem Make sure prerequisite environment variables are set
if not "%JAVA_HOME%" == "" goto gotJavaHome
echo The JAVA_HOME environment variable is not defined
echo This environment variable is needed to run this program
goto exit
:gotJavaHome
if not exist "%JAVA_HOME%\bin\java.exe" goto noJavaHome
if not exist "%JAVA_HOME%\bin\javaw.exe" goto noJavaHome
if not exist "%JAVA_HOME%\bin\jdb.exe" goto noJavaHome
if not exist "%JAVA_HOME%\bin\javac.exe" goto noJavaHome
goto okJavaHome
:noJavaHome
echo The JAVA_HOME environment variable is not defined correctly
echo This environment variable is needed to run this program
echo NB: JAVA_HOME should point to a JDK not a JRE
goto exit
:okJavaHome


rem Guess TOMCAT_HOME if not defined
set CURRENT_DIR=%cd%
if not "%TOMCAT_HOME%" == "" goto gotHome
set TOMCAT_HOME=%CURRENT_DIR%
if exist "%TOMCAT_HOME%\bin\catalina.bat" goto okHome
cd ..
set TOMCAT_HOME=%cd%
cd %CURRENT_DIR%
:gotHome
if exist "%TOMCAT_HOME%\bin\catalina.bat" goto okHome
echo The TOMCAT_HOME environment variable is not defined correctly
echo This environment variable is needed to run this program
goto end
:okHome


"%JAVA_HOME%\bin\java" -classpath "%TOMCAT_HOME%\lib\hsqldb.jar" org.hsqldb.Server -database "%TOMCAT_HOME%\data\%1" -port %2 -silent true -trace false

goto end

:argumentsError
echo "You have to specify the database name and the port to use, in this way:"
echo "	C:\> start-hsqldb mydatabase-db 1777"

:exit
exit /b 1

:end
