job('Node JS'){
   scm {
    git('https://github.com/gxg512/node-hello.git') { node ->
     node / git ConfigName('DLS User')
     node / gitConfigEmail('jenkis@yahoo.com')
  }
    steps {
     shell("npm start")
}
}
