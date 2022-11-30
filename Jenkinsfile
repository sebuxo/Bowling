pipeline {

    agent any
    stages {

        stage('Checkout Codebase'){
            steps{
                cleanWs()
                 git credentialsId: 'github', url: 'https://github.com/sebuxo/Bowling'
            }
        }

        stage('Show Files') {
                environment {
                  MY_FILES = ls -l, returnStdout: true)
                }
                steps {

                    echo "$MY_FILES"

                }
            }

    }
}
