pipeline {

    agent any
    stages {

        stage('Checkout Codebase'){
            steps{
                cleanWs()
                 git credentialsId: 'github', url: 'https://github.com/sebuxo/Bowling'
            }
        }

        stage('Build'){
            steps{
                sh 'cd src ;' //javac -cp "../lib/junit-platform-console-standalone-1.7.0-all.jar" BowlingGameTest.java BowlingGame.java'
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