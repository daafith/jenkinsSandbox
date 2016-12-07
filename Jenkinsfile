node {
  def mvnHome
  stage('Preparation') { // for display purposes
    // Get the Maven tool.
    // ** NOTE: This 'M3' Maven tool must be configured
    // **       in the global configuration.
    mvnHome = tool 'M3'
  }
  echo 'I fetched the Maven tool'
  
  stage('CheckOut') {
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/daafith/jenkinsSandbox.git']]])
  }
  echo 'I checked stuff out'

 stage('Build') {
  if (isUnix()) {
    sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
  } else {
    bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
  }
}
}