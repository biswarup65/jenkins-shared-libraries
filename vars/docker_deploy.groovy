def call(){
  sh " docker-compose down"
  sh " docker-compose up -d --build"
  sh " Application deployed successfully and app run on port 8000"
}
