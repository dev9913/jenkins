def call(String imgName, String tag, String credId) {
    withCredentials([usernamePassword(credentialsId: ${credId},
                                      usernameVariable: 'DOCKER_USER',
                                      passwordVariable: 'DOCKER_PASS')]) {
        sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}" 
        sh "docker push ${userName}/${imgName}:${tag}"
    }
}
