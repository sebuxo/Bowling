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
                  GIT_COMMIT_EMAIL = sh (
                      script: 'git --no-pager show -s',
                      returnStdout: true
                  ).trim()

                }
                steps {

echo "Git committer email: ${GIT_COMMIT_EMAIL}"
                }
            }

    }
}
