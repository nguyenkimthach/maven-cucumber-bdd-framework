pipeline {
  agent any
  stages {
    stage('Bulid source') {
      steps {
        bat 'mvn clean'
      }
    }

    stage('Run h_Chrome') {
      parallel {
        stage('Run h_Chrome') {
          steps {
            bat 'mvn test -DBROWSER=h_chrome'
          }
        }

        stage('Run Firefox') {
          steps {
            bat 'mvn test -DBROWSER=firefox'
          }
        }

        stage('Run Chrome') {
          steps {
            bat 'mvn test -DBROSER=chrome'
          }
        }

      }
    }

  }
}