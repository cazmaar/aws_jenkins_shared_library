#!/usr/bin/env groovy 
def call(){
    withCredentials([sshUserPrivateKey(credentialsId: 'token-github', passwordVariable: 'token', usernameVariable: 'User')]) {
// sh "git remote set-url origin https://$token@github.com/cazmaar/aws_jenkins_drinks_project.git"
// sh "git add ."
// sh 'git commit -m "commiting version bump"'
// sh "git push origin HEAD:main"
echo $token
    }
}

