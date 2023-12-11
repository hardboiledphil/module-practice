# module-practice


The question is...

Can we reuse a package name in another module where we are expecting to override
or implement a class from the initial module
``` 
moduleA -> dev.phil.MyInterface 
moduleB -> dev.phil.MyService (implements MyInterface)
```
I'm seeing that it's not expected to be able to do this - examples show the implementation in a different "impl" package
  
