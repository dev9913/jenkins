def call(String mydockerhubuser , String password){
   sh " docker login -u ${mydockerhubuser} -p ${password} "
   echo " Docker login Successfully. "
}
