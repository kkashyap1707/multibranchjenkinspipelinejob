pipeline {
    agent {
        label 'master'

    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '5'))
    }

    stages {
        stage('Check stage') {
            steps {
                echo "First Stage : 1"
            }
        }
    }
}