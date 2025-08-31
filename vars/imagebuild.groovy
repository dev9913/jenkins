def call( String imgName , String tag, String userName) {
  echo 'Building a Docker image...'
  sh "docker build -t ${userName}/${imgName}:${tag} ."
  echo "Docker Image Build Success."
}  
