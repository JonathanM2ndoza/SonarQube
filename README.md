# SonarQube

Example of how use SonarQube (Mode Test)

## What is SonarQube?

SonarQube is an automatic code review tool to detect bugs, vulnerabilities and code smells in your code. It can integrate with your existing workflow to enable continuous code inspection across your project branches and pull requests.

https://docs.sonarqube.org/latest/

## SonarQube Architecture

![Screenshot](/prtsc/architecture-scanning.png)

![Screenshot](/prtsc/architecture-scanning-2.png)

https://docs.sonarqube.org/latest/architecture/architecture-integration/


### Sonarqube installation with Docker image

jmendoza@jmendoza-ThinkPad-T420:~/Documentos/DevTools$ docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube

![Screenshot](/prtsc/Sonarqube-1.png)

![Screenshot](/prtsc/Sonarqube-2.png)

![Screenshot](/prtsc/Sonarqube-3.png)