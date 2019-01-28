node{
   stage('SCM Checkout'){
     git 'https://github.com/gaurabe/jenkin'  
   }
   stage('Compile-Package'){
    
      def mvnHome =  tool name: 'Maven', type: 'maven'
      sh "${mvnHome}/bin/mvn package"
   }
   
   stage('Build image') {
	app = docker.build("sandbox-khl/jenkintest-0.0.1-SNAPSHOT")
}

stage('Push image') {
	credentialsId:'gcr:sandbox-khl',toolName: 'docker') {
    app.push("${env.BUILD_NUMBER}")
    app.push("latest")
  }
   }
}
   
      
   
