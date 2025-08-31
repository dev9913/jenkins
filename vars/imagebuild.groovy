def call( String imgName , String tag) {
  echo 'Building a Docker image...'
  sh "docker build -t ${imageName}:${tag} ."
  echo "Docker Image Build Success."
}  
