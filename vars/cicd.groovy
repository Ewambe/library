def newGit(repo)
{
  git "${repo}"
}

def newMaven()
{
  sh 'mvn package'
}
def newDeploy(ip,appname)
{
deploy adapters: [tomcat9(credentialsId: '24c93484-c125-4361-aa30-fcfe38f0264b', path: '', url: "${ip}")], contextPath: "{appname}", war: '**/*.war'    
} 
