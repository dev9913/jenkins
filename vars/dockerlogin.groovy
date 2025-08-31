def call(String mydockerhubuser, String password) {
    echo "Docker login ..."
    sh """
        echo '${password}' | docker login -u '${mydockerhubuser}' --password-stdin
    """
    echo "Docker login Successfully."
}
