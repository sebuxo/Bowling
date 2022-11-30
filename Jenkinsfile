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
          MY_FILES = sh(script: 'ls -l', returnStdout: true)
        }
        steps {
          sh '''
            echo "$MY_FILES"
          '''
        }
    }
        stage('Build'){
            steps{
            echo 'zb'
              //  sh 'cd src ;' //javac -cp "../lib/junit-platform-console-standalone-1.7.0-all.jar" BowlingGameTest.java BowlingGame.java'
            }
        }

        stage('Test'){
            steps{
                sh 'cd src/ ; java -jar ../lib/junit-platform-console-standalone-1.7.0-all.jar -cp "." -    -select-class BowlingGameTest --reports-dir="reports"'
                junit 'src/reports/-jupiter.xml'
            }
        }

        stage('Deploy'){
            steps{
                sh 'cd src/ ; java App'
            }
        }
    }

}