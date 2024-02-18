# prequisites
  1. Check the `maven` is installed in your local machine  - prefered Apache Maven 3.9.1 
  2. Check the `java` is installed in machinw - prefered java version "17.0.6"
## Dependecies 
  - <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
        <scope>test</scope>
    </dependency>

# Getting Started

1. Unzip file to your local machine:
2. redirect to the project folder i.e -> *magicalarena*
4. check the java and maven versions
   - `java -version`
   -  `mvn -v`

# Game Magical Arena Unit Tests

 - This project contains unit tests for the `Arena` class in the Game module.

## Getting Started

1. Unzip file to your local machine:
2. redirect to the project folder i.e -> *magicalarena*
4. run the `mvn test`
After test build completed, build gets success.
if Build failed try to change the JUnit version in dependecies in *pom.xml* file 

# Running Game Magical Arena
- This project contains *Player* object and one abstract class - Game 

## Getting Started
 - run $ mvn clean compile package
 - run $ java -jar target/magicalarena-0.0.1-SNAPSHOT.jar 
   Then follow the prompt to paly the game.

Happy Gamaming ....!