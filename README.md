Fail build:
`mvn -pl :worker clean verify`

TestIT.test:11 NoClassDefFound com/test/utils/ClassWithStaticMethod


Move SomeEmptyClass.java to com.test.utils.tests for success build
