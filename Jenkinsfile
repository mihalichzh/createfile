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
    }

    stage('Run tests') {
        dir('testnamespace') {
            sh "ls"
            build(job: 'tests-job/master')
        }
    }

}