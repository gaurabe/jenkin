node{
   stage('SCM Checkout'){
     git 'https://github.com/gaurabe/jenkin'  
   }
   stage('Compile-Package'){
    
      def mvnHome =  tool name: 'Maven', type: 'maven'
      sh "${mvnHome}/bin/mvn package"
   }
   
   stage('Build image') {
	sh  "sudo docker build -f Dockerfile -t gcr.io/sandbox-khl/jenkintest ."
	}
	stage('push image gcloud') {
    sh "gcloud docker -- push gcr.io/sandbox-khl/jenkintest ."
	
	}

}
   
  
