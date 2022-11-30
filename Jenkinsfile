pipeline {

    agent any
    stages {

        stage('Checkout Codebase'){
            steps{

                 git credentialsId: 'github', url: 'https://github.com/sebuxo/Bowling'
            }
        }

        stage('Show Files') {
                environment {
                  GIT_COMMIT_EMAIL = sh (
                      script: 'ls -l',
                      returnStdout: true
                  ).trim()


                }
                steps {

echo "Git committer email: ${GIT_COMMIT_EMAIL}"
                }
            }

    }
}
