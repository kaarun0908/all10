pipeline {
    agent any

    tools {
        // Configured in Manage Jenkins -> Tools -> Maven installations -> Maven-3.9.16
        maven 'Maven-3.9.16'
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out source code from Git...'
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling all 10 Java programs with Maven...'
                script {
                    if (isUnix()) {
                        sh 'mvn clean compile'
                    } else {
                        bat 'mvn clean compile'
                    }
                }
            }
        }

        stage('Run Tests') {
            steps {
                echo 'Executing all 10 JUnit 5 test suites...'
                script {
                    if (isUnix()) {
                        sh 'mvn test'
                    } else {
                        bat 'mvn test'
                    }
                }
            }
            post {
                always {
                    junit testResults: '**/target/surefire-reports/*.xml', allowEmptyResults: true
                }
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging application into JAR...'
                script {
                    if (isUnix()) {
                        sh 'mvn package -DskipTests'
                    } else {
                        bat 'mvn package -DskipTests'
                    }
                }
            }
            post {
                success {
                    archiveArtifacts artifacts: 'target/*.jar', fingerprint: true, allowEmptyArchive: true
                }
            }
        }

        stage('Execute Application') {
            steps {
                echo 'Executing all 10 Java programs and displaying outputs in Jenkins:'
                script {
                    if (isUnix()) {
                        sh 'java -jar target/all10-1.0-SNAPSHOT.jar'
                    } else {
                        bat 'java -jar target/all10-1.0-SNAPSHOT.jar'
                    }
                }
            }
        }
    }

    post {
        success {
            echo '=================================================='
            echo 'Jenkins Pipeline build, test, and execution completed successfully!'
            echo '=================================================='
        }
        failure {
            echo '=================================================='
            echo 'Pipeline failed. Check stage logs for details.'
            echo '=================================================='
        }
    }
}
