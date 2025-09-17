def call(String giturl,String gitbranch){
  git url: "${giturl}" , branch: "${gitbranch}"
  echo " Code Cloned Successfully!"
  
}
