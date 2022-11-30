pipeline {

    agent any
    stages {

        stage('Checkout Codebase'){
            steps{
                cleanWs()
                 git credentialsId: 'github', url: 'https://github.com/sebuxo/Bowling'
            }
        }

    }
}
