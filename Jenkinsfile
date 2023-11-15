#!groovy
pipeline {
  agent none

  environment {
    NX_BRANCH = "main"
    CHANGE_TARGET = "dev"
  }
  
  tools {nodejs "NodeJS"}

  stages {
    stage('Pipeline') {
      parallel {
        stage('Main') {
          agent any
          
          steps {
            echo "Running npm ci..."
            sh "npm ci"

            echo "git fetch..."
            sh "git fetch origin main:refs/remotes/origin/main"
            sh "chmod +x /var/jenkins_home/workspace/First_Pipeline_for_nx_java/apps/hello-nx-java/mvnw"
            sh "chmod +x /var/jenkins_home/workspace/First_Pipeline_for_nx_java/apps/java-app-2/mvnw"
            sh "chmod +x /var/jenkins_home/workspace/First_Pipeline_for_nx_java/apps/java-app-3/mvnw"
            sh "chmod +x /var/jenkins_home/workspace/First_Pipeline_for_nx_java/libs/java-utils/java-utils/mvnw"
            echo "npx nx affected builds..."
            sh "npx nx affected  --target=build  --base=HEAD~1"
          }
        }
      }
    }
  }
}
