## To reproduce failure with java 9, run:

```
mill root.test
```

which results in:

```
-------------------------------- Running Tests --------------------------------
X MainTests.one 28ms
  java.lang.SecurityException: Prohibited package name: java.sql
    java.lang.ClassLoader.preDefineClass(ClassLoader.java:889)
    java.lang.ClassLoader.defineClass(ClassLoader.java:1005)
    java.security.SecureClassLoader.defineClass(SecureClassLoader.java:174)
    java.net.URLClassLoader.defineClass(URLClassLoader.java:545)
    java.net.URLClassLoader.access$100(URLClassLoader.java:83)
    java.net.URLClassLoader$1.run(URLClassLoader.java:453)
    java.net.URLClassLoader$1.run(URLClassLoader.java:447)
    java.security.AccessController.doPrivileged(AccessController.java:-2)
    java.net.URLClassLoader.findClass(URLClassLoader.java:446)
    java.lang.ClassLoader.loadClass(ClassLoader.java:563)
    java.lang.ClassLoader.loadClass(ClassLoader.java:550)
    java.lang.ClassLoader.loadClass(ClassLoader.java:496)
    MainTests$.$anonfun$tests$2(MainTests.scala:7)
Tests: 1, Passed: 0, Failed: 1
1 targets failed
root.test.test MainTests MainTests.one
```

or 

```
mill root.runLocal
```

which results in:

```
[33/33] root.runLocal
1 targets failed
root.runLocal java.lang.SecurityException: Prohibited package name: java.sql
    java.base/java.lang.ClassLoader.preDefineClass(ClassLoader.java:889)
    java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1005)
    java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:174)
    java.base/java.net.URLClassLoader.defineClass(URLClassLoader.java:545)
    java.base/java.net.URLClassLoader.access$100(URLClassLoader.java:83)
    java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:453)
    java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:447)
    java.base/java.security.AccessController.doPrivileged(Native Method)
    java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:446)
    java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:563)
    java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:496)
    java.base/java.lang.Class.getDeclaredMethods0(Native Method)
    java.base/java.lang.Class.privateGetDeclaredMethods(Class.java:3139)
    java.base/java.lang.Class.getMethodsRecursive(Class.java:3280)
    java.base/java.lang.Class.getMethod0(Class.java:3266)
    java.base/java.lang.Class.getMethod(Class.java:2063)
    mill.modules.Jvm$.getMainMethod(Jvm.scala:88)
    mill.modules.Jvm$.$anonfun$runLocal$1(Jvm.scala:82)
    mill.modules.Jvm$.inprocess(Jvm.scala:122)
    mill.modules.Jvm$.runLocal(Jvm.scala:81)
    mill.scalalib.ScalaModule.$anonfun$runLocal$2(ScalaModule.scala:265)
    scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:12)
```
