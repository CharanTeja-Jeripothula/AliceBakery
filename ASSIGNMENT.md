# Annotations learned in week-1
1) #### @Component 
    Added above a class definition to mark it for bean creation. This is one of a method to create a bean. Another method is to create a @Bean method in a @Configuration class
2) #### @Configuration
    It is a class that contains methods that deal with the creation logic of some specific beans.
3) #### @Service 
    Abstraction over @Component. This will also create a bean. This is added over a class that contains the business logic of a particular functionality of an application.
4) #### @Repository
    Similar to @Service. Added over repository layer class
5) #### @Controller
    Similar to @Service. Added over a controller class that outputs views
6) #### @RestController
    Similar to @Service. Added over a controller class that outputs java objects ( Mostly ResponseEntities)
7) #### @Bean
    Added over a method in @Configuration class. This method performs some user-defined logic, if any, and adds beans to the application context.
8) #### @Primary
    Used to deal with bean conflicts. When multiple beans of same type are present in an application, this annotation is used to specify the bean that needs to be prioritised.
9) #### @Qualifier
   Used to deal with bean conflicts. This is used in specify the specific bean that needs to be created.
10) #### @Autowired
    This annotation over a field of a class helps the IoC container to inject the required field bean into the class
11) #### @ConditionalOnProperty, @ConditionalOnClass, @ConditionalOnProperty
    This annotation is added to beans to add a validation/check that is processed before bean creation. Bean is created only if the condition returns true.
12) #### @PostConstruct, @PreDestroy
    These are lifecycle hook annotations that are added above bean methods which need to run after they are initialised or before destroyed ( just before the application server stops) respectively.

# Scenarios where Spring-boot is more helpful over Spring Framework
- When time spent on the business logic development is prioritized over the time spent on configuration
- When full control over the configuration is not required
- When application requires or works fine with default servers, required almost zero configuration and required production ready features like health checks and metrics with minimal configuration
 