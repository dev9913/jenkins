def  call( String dockerUserName, String imgName,String tag){
   echo "Pushing Docker image: ${dockerUserName}/${imgName}:${tag}"
   sh " docker push ${dockerUserName}/${imgName}:${tag} " 
   echo "Docker image pushed successfully."
}
