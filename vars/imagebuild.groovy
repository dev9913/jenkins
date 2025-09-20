def call( String imgName , String tag, String userName , String contextDir) {
  echo 'Building a Docker image...'
  sh "docker build -t ${userName}/${imgName}:${tag} ${contextDir}"
  echo "Docker Image Build Success."
}  
