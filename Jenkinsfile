node {
  stage('CheckOut') {
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/daafith/jenkinsSandbox.git']]])
  }
  echo 'I checked stuff out'

}