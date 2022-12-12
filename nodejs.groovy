job('NodeJSexample'){
   scm {
    git('https://github.com/gxg512/node-hello.git') { 
  }
}
  steps {
     shell("npm start")
}
}
