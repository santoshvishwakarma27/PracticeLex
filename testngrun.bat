set ProjectPath=D:\workspace\GithubJenkins
cd %ProjectPath%
set classpath=%ProjectPath%\bin;D:\Jar\lib\*
java org.testng.TestNG %ProjectPath%\testng2.xml
pause