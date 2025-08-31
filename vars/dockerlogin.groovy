def call(String mydockerhubuser , String password){
   echo " Docker login "
   sh " docker login -u ${mydockerhubuser} -p ${password} "
   echo " Docker login Successfully. "
}
