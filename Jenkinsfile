node {
    cleanWs()
    checkout scm

    stage('Build Jar') {
        sh "ls"
        sh "chmod 755 ./gradlew"
        sh "./gradlew customFatJar"
        sh "cd build/libs"
        sh "cp build/libs/*.jar ."
        sh "ls"
        sh "java -jar executable*"
        sh "ls"
    }

    stage('Prepare test environment') {
        sh "mkdir testnamespace"
        sh "cp test.txt testnamespace"
        dir('testnamespace') {
            sh "ls"
        }
    }

    stage('Run tests') {
        build(job: 'tests-job/master')
    }

}