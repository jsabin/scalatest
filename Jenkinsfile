pipeline {
    agent {
        docker {
            image 'jsabin/sbt'
        }
    }
    stages {
        stage('build') {
            steps {
                script {
                    sh "sbt compile test"
                }
            }
        }
    }
}

