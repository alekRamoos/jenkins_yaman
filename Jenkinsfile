node {
	stage ('SCM checkout'){
		git "https://github.com/alekRamoos/jenkins_yaman"
		}
	stage ('Build'){
	    	dir("treinamentoJenkins") {
	   sh "mvn clean install"
       }
       	dir("treinamentoJenkins/target") {
	   sh "java -jar treinamentoJenkins-0.0.1-SNAPSHOT.jar"
       }
		}
}