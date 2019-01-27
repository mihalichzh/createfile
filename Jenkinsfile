node {
    checkout scm
    stage('Build Jar') {
        sh "ls"
        sh "chmod 755 ./gradlew"
        sh "./gradlew customFatJar"
        sh "cd build/libs"
        sh "cp build/libs/*.jar ."
        sh "ls"
        sh " java -jar executable*"
        sh "ls"
    }
}