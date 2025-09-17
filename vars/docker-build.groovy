def call(String Imagename,String Tag){
  sh " docker build -t ${Imagename}:${Tag} . "
  echo "Docker Image Build!"
}
