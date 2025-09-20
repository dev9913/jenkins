def call( String imgName , String tag, String userName , String contextDir) {
  echo "Building a ${imgName} Docker image..."
  sh "docker build -t ${userName}/${imgName}:${tag} ${contextDir}"
  echo " ${imgName} Docker Image Build Success."
}  
