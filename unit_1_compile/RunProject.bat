cd ant
call antStart.bat
cd ../
echo \\\\\\\\\\\\\\\\\\///////////////
cd compile
call compileStart.bat
cd ../
echo \\\\\\\\\\\\\\\\\\///////////////
cd maven
call mavenStart.bat
call runMaven.bat
cd ../../