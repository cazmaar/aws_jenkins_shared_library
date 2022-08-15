#!/usr/bin/env groovy 
def call(String version){
sh 'git config --global user.email "jenkins@example.com"'
sh 'git config --global user.name "jenkins"'
sh "npm version $version"
def packageJson = readJSON file: 'package.json'
env.version = packageJson.version
}