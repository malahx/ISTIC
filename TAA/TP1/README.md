### sonarqube

    docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube
    https://hub.docker.com/_/sonarqube/
    http://localhost:9000/

### jenkins

    cd jenkins
    docker build -t jenkins/maven .
    docker run -d --name jenkins -p 8080:8080 -p 50000:50000 jenkins/maven
    https://hub.docker.com/_/jenkins/
    http://localhost:8080/
    
### docker network
    
    docker network create doc
    docker network connect doc jenkins
    docker network connect doc sonarqube
    docker network inspect doc