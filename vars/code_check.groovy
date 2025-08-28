def call( String url1 , String b) {
  echo " This step Check code is WORKING or NOT "
  git url: "${url1}" , branch: "${b}"
  echo "Suceess !"
}  
