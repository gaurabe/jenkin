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
	stage('push image to gcloud registry') {
	sh"sudo gcloud auth configure-docker"
    sh "sudo gcloud docker -- push gcr.io/sandbox-khl/jenkintest:latest"
	}
	stage('run on google Kubernetes') {
    sh "kubectl run jenkintest --replicas=3 --image=gcr.io/sandbox-khl/jenkintest:latest --port=8080"
	sh "kubectl expose deployment jenkintest --type=LoadBalancer --name=jenkintest-service"
	}

}
   
