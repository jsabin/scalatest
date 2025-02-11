pipeline {
    agent none
//     agent {
//         docker {
//             image 'jsabin/sbt'
//         }
//     }
    stages {
        stage('Clone Repository') {
            steps {
                git(url: 'https://github.com/jsabin/scalatest.git', branch: 'main')
            }
        }
        stage('build') {
            steps {
                script {
                    sh "sbt compile test"
                }
            }
        }
    }
}

