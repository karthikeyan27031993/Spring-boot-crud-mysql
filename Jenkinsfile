pipeline{
agent any
stages{
    stage('Git Checkout'){
        steps{
            git branch: 'main', url: 'https://github.com/karthikeyan27031993/Spring-boot-crud-mysql.git'
        }
    }
    stage('Unit Testing'){
        steps{
            bat 'mvn test'
        }
    }
    stage('Integration Testing'){
        steps{
            bat 'mvn verify -DskipUnitTests'
        }
    }
     stage('Mvn build'){
            steps{
                 bat 'mvn clean install'
            }
     }

    stage('Static Code analysis'){
        steps{
            withSonarQubeEnv(credentialsId: 'sonar-api-key') {
                    bat 'mvn clean package sonar:sonar'
                     // some block
                 }
        }
    }

}
}