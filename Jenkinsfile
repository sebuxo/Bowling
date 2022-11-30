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
                  GIT_COMMIT_EMAIL = bat (
                      script: 'git --no-pager show -s --format=\'%ae\'',
                      returnStdout: true
                  ).trim()


                }
                steps {

echo "Git committer email: ${GIT_COMMIT_EMAIL}"
                }
            }

    }
}
