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
            bat 'cd crud'
            bat 'mvn test'
        }
    }

}
}