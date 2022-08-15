#!/usr/bin/env groovy 
def call(){
    withCredentials([usernamePassword(credentialsId: 'token-github', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
sh "git remote set-url origin https://$PASS@github.com/cazmaar/aws_jenkins_drinks_project.git"
sh "git add ."
sh 'git commit -m "commiting version bump"'
sh "git push origin HEAD:main"
    // sh "echo $PASS"
    }
}

