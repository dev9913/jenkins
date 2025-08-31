def call(String imgName, String tag) {
    withCredentials([usernamePassword(credentialsId: 'DockerCred',
                                      usernameVariable: 'DOCKER_USER',
                                      passwordVariable: 'DOCKER_PASS')]) {
        sh """
            docker login -u "${DOCKER_USER}" -p "${DOCKER_PASS}" 
            docker push "${DOCKER_USER}"/"${imgName}":"${tag}"
        """
    }
}
