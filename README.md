# SonarQube

Example of how use SonarQube (Mode Test)

## What is SonarQube?

SonarQube is an automatic code review tool to detect bugs, vulnerabilities and code smells in your code. It can integrate with your existing workflow to enable continuous code inspection across your project branches and pull requests.

https://docs.sonarqube.org/latest/

## SonarQube Architecture

![Screenshot](/prtsc/architecture-scanning.png)

![Screenshot](/prtsc/architecture-scanning-2.png)

![Screenshot](/prtsc/architecture-scanning-3.png)

https://docs.sonarqube.org/latest/architecture/architecture-integration/


### Sonarqube installation with Docker image

jmendoza@jmendoza-ThinkPad-T420:~/Documentos/DevTools$ docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube

![Screenshot](/prtsc/Sonarqube-1.png)

![Screenshot](/prtsc/Sonarqube-2.png)

http://172.17.0.2:9000/about

![Screenshot](/prtsc/Sonarqube-3.png)

### Sonarqube with Maven

Configure file settings.xml in your home, for example: /home/jmendoza/.m2

![Screenshot](/prtsc/Sonarqube-4.png)

Compile project with Maven and Analyzing with Sonarqube

jmendoza@jmendoza-ThinkPad-T420:~/IdeaProjects/SonarQube/TestSonarQube$ mvn clean sonar:sonar install

![Screenshot](/prtsc/Sonarqube-4.1.png)

![Screenshot](/prtsc/Sonarqube-4.2.png)

![Screenshot](/prtsc/Sonarqube-4.3.png)

### Update console Sonarqube 

![Screenshot](/prtsc/Sonarqube-5.png)

![Screenshot](/prtsc/Sonarqube-5.1.png)


## Configure Sonarqube in IntelliJ

IntelliJ Before Sonarqube

![Screenshot](/prtsc/Sonarqube-6.png)


Open IntelliJ go to menu File --> Settings --> Plugins --> Marketplace

Search with the word "sonar". Install SonarLint and RestartIDE.

![Screenshot](/prtsc/Sonarqube-6.1.png)

IntelliJ After Sonarqube

Right click on the directory src the project and select SonarLint -> Analyze with SonarLint

![Screenshot](/prtsc/Sonarqube-6.2.png)

jmendoza@jmendoza-ThinkPad-T420:~/IdeaProjects/SonarQube/TestSonarQube$ mvn clean sonar:sonar install

![Screenshot](/prtsc/Sonarqube-6.3.png)

![Screenshot](/prtsc/Sonarqube-6.4.png)

![Screenshot](/prtsc/Sonarqube-6.5.png)

### Issues resolved

![Screenshot](/prtsc/Sonarqube-7.png)

IntelliJ: sonar-maven-plugin

![Screenshot](/prtsc/Sonarqube-7.1.png)

Update console Sonarqube 

![Screenshot](/prtsc/Sonarqube-7.2.png)






