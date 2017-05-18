
set -x
mvn clean

rm -rf ./target/*.jar

##mvn package
mvn install -DskipTests=true
java -jar ./target/predix-microservice-cf-jsr-1.1.15.jar

