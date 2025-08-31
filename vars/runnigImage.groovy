def call(String imgName , String tag ,int port){
    echo 'Running the container on browser...'
    sh "docker run -d -p ${port}:${port} ${imgName}:${tag}"
    echo "Container Running Success."
}
