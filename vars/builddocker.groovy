#!/usr/bin/env groovy 
def call(String repoName){
    withCredentials([usernamePassword(credentialsId: 'docker_hub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "docker build -t $repoName ."
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push $repoName"
    }
}

