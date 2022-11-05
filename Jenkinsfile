pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building code..'
                echo 'Compile project'
                sh "chmod +x gradlew"
                sh './gradlew build' 
                archiveArtifacts artifacts: '**/build/*.jar', fingerprint: true 
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
                sh './gradlew jib'
            }
        }
    }
}