###GENERATE MAVEN PROJECT 

>mvn archetype:generate -DgroupId=nix4 -DartifactId=unit_1_compile -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
----------------------------------------------------------------------------------
###CREATE JAR PROJECT IN THE APP DIRECTORY

>mvn clean install

----------------------------------------------------------------------------------
###RUN PROGRAM FROM JAR IN THE APP DIRECTORY

>java -jar target/unit_1_compile-1.0-SNAPSHOT.jar


----------------------------------------------------------------------------------
