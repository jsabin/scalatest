pipeline {
    agent {
        docker {
            image 'sbtscala/scala-sbt:eclipse-temurin-21.0.5_11_1.10.7_2.13.16'
//             args '-u sbtuser'
        }
    }
    stages {
        stage('build') {
            steps {
                script {
                    sh "sudo -u sbtuser sbt compile test"
                }
            }
        }
    }
}

