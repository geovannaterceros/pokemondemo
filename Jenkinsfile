pipeline {
    agent any
    parameters { string(name: 'IMAGE_VER', defaultValue: 'latest', description: 'Container tag version') }
    stages {
        stage('Build') {
            steps {
                echo 'Building code..'
                echo 'Compile project'
                sh "chmod +x gradlew"
                sh './gradlew build' 
                archiveArtifacts artifacts: '**/app/build/libs/*.jar', fingerprint: true 
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh './gradlew test'
            }
        }
        stage('Package') {
           environment {
                DOCKERHUB_CREDS = credentials('alsie-test-key-github')
            }
            steps {
                echo 'Building JIB container....'
                sh ('./gradlew jib -Pdockerhub_user=$DOCKERHUB_CREDS_USR -Pdockerhub_token=$DOCKERHUB_CREDS_PSW -Pimage_tag=${IMAGE_VER}')
            }
        }
    }
}