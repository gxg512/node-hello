job('Node JS'){
   scm {
    git('') { node ->
     node / git ConfigName('DLS User')
     node / gitConfigEmail('jenkis@yahoo.com')
  }
    steps {
     shell("npm start")
}
}
