pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World from github'
            }}
        stage('hey') {
            steps {
                echo 'hey'
            }
        }
    }
}
