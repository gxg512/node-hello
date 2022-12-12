job('NodeJSexample'){
  scm {
     git('https://github.com/gxg512/node-hello.git') { node ->
       node / gitConfigName('DLS User')
       node / gitConfigEmail('jenkis@yahoo.com')
                                                     }
      }
  steps {
     shell("npm start")
}
}
