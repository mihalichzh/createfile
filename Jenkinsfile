node {
    checkout scm
    stage('Build Jar') {
        sh "chmod 755 ./gradlew"
        sh "./gradlew customFatJar"
        sh "cd build/libs"
        sh "ls"
    }
}