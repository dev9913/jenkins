def call(String imgName, String tag, String userName) {
    withCredentials([usernamePassword(
        credentialsId: 'DockerCred',
        usernameVariable: 'DOCKER_USER',
        passwordVariable: 'DOCKER_PASS'
    )]) {
        // Login to DockerHub
        sh '''
            echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin
        '''

        // Push Docker image
        sh """
            docker push ${userName}/${imgName}:${tag}
        """
    }
}
