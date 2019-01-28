node{
   stage('SCM Checkout'){
     git 'https://github.com/gaurabe/jenkin'
   }
   stage('Compile-Package'){
      //get mvn home path
      def mvnHome =  tool name: 'Maven', type: 'maven'
      sh "${mvnHome}/bin/mvn package"
   }
}
