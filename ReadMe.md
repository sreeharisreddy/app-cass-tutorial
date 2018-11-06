#Creating a maven project
mvn archetype:generate -DgroupId=com.cas.app -DartifactId=app-cass-tutorial -DarchtypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

cd app-cass-tutorial
mvn package 
mvn clean
