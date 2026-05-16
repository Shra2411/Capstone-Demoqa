pipeline {
    agent any

    tools {
        maven 'Maven'   // Jenkins me configured Maven name
        jdk 'JDK11'     // Jenkins me configured JDK name
    }

    environment {
        ALLURE_RESULTS = 'target/allure-results'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Shra2411/Capstone-Demoqa.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean verify'
            }
        }

        stage('Allure Report') {
    steps {
        allure([
            includeProperties: false,
            jdk: '',
            results: [[path: 'target/allure-results']]
        ])
    }
}
    }

    post {
        always {
            archiveArtifacts artifacts: 'target/**/*.log', allowEmptyArchive: true
        }
        success {
            echo 'BUILD SUCCESS 🎉'
        }
        failure {
            echo 'BUILD FAILED ❌'
        }
    }
}