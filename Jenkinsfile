node {
   
   stage 'Checkout'
   checkout scm

   stage 'Build'
   // Run the maven build and unit tests
   sh "mvn clean install"
   
}