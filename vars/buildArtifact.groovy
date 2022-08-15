#!/usr/bin/env groovy 
def call(String name){
    echo "builing app artifact $name"
    sh "npm run clean"
    sh "npm pack"
}