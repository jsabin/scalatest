pipeline {
    agent {
        docker {
//         image 'hseeberger/scala-sbt'
        image 'sbtscala/scala-sbt:eclipse-temurin-21.0.5_11_1.10.7_2.13.16'
        }
    }
    stages {
        stage('build') {
            steps {
                script {
                    sh "whoami; sbt compile test"
                }
            }
        }
    }
}

