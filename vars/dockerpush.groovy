def call(String imgName, String tag, String userName) {
    withCredentials([usernamePassword(credentialsId: 'DockerCred',
                                      usernameVariable: 'DOCKER_USER',
                                      passwordVariable: 'DOCKER_PASS')]) {
        sh """
            docker login -u "${DOCKER_USER}" -p "${DOCKER_PASS}" 
            docker push "${userName}"/"${imgName}":"${tag}"
        """
    }
}
