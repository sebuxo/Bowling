pipeline {

    agent any
    stages {

        stage('Checkout Codebase'){
            steps{

                 git credentialsId: 'github', url: 'https://github.com/sebuxo/Bowling'
            }
        }

        stage('Build'){
            steps{
                sh 'cd src ; javac -cp "../lib/junit-platform-console-standalone-1.7.0-all.jar" BowlingGameTest.java BowlingGame.java'
            }
        }
    }
}
