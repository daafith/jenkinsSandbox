node('master'){
  def mvnHome
  stage('Preparation') {
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
      sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean test"
    } else {
      bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean test/)
    }
  }
  echo 'I built and unit tested stuff'

  stage('Analyze') {
  	 if (isUnix()) {
      sh "'${mvnHome}/bin/mvn' -DwithHistory org.pitest:pitest-maven:mutationCoverage"
    } else {
      bat(/"${mvnHome}\bin\mvn" -DwithHistory org.pitest:pitest-maven:mutationCoverage/)
    }
  }
  
  echo 'I checked the mutation coverage'

  stage('Results') {
    junit '**/target/surefire-reports/TEST-*.xml'
    junit '**/target/pit-reports/**/index.html'
  }
}