node {
	stage ('SCM checkout'){
		git "https://github.com/alekRamoos/jenkins_yaman"
		}
	stage ('Build'){
       	dir("comtest/target") {
	   sh "java -jar treinamentoJenkins-0.0.1-SNAPSHOT.jar"
       }
		}
}