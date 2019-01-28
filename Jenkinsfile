node{
   stage('SCM Checkout'){
     git 'https://github.com/gaurabe/jenkin'
   }
   stage('Compile-Package'){
      sh "${mvnHome}/bin/mvn package"
   }
