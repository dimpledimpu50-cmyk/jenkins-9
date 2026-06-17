pipeline {
agent any

parameters {
    string(
        name: 'BRANCH_NAME',
        defaultValue: 'main',
        description: 'Git branch to build'
    )
}

stages {

    stage('Checkout') {
        steps {
            git branch: params.BRANCH_NAME,
                url: 'https://github.com/dimpledimpu50-cmyk/jenkins-9.git'
        }
    }

    stage('Build') {
        steps {
            sh 'mvn clean package'
        }
    }

    stage('Test') {
        steps {
            sh 'mvn test'
        }
    }
}
}
