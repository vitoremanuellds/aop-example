# AOP Example

# Requirements to implement

- Add `implementation 'org.aspectj:aspectjweaver'` on ![`build.gradle`](https://github.com/vitoremanuellds/aop-example/blob/main/build.gradle)
- Create a ![configuration class](https://github.com/vitoremanuellds/aop-example/blob/main/src/main/java/com/example/interceptor/configuration/AspectJConfiguration.java) to configure the `AspectJ` and provide the Aspects (Interceptors).
- Create an ![annotation](https://github.com/vitoremanuellds/aop-example/blob/main/src/main/java/com/example/interceptor/interceptor/Intercept.java) to serve as a PointCut.
- Create the Aspect ![Interceptor](https://github.com/vitoremanuellds/aop-example/blob/main/src/main/java/com/example/interceptor/interceptor/Intercept.java) with a reference to the annotation.
