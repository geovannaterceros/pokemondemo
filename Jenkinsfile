pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building code..'
                sh ./gradlew build
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Package') {
            steps {
                echo 'Building container....'
                sh ./gradlew jib
            }
        }
    }
}