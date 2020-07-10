# List of practiced topics

## Configuration
1. Create a Maven web app project
2. Configure POM file 
[[pom.xml]()]
   - ```spring-webmvc``` dependency: support Spring MVC and REST
   - ```com.fasterxml.jackson.core/jackson-databind``` dependency: convert JSON
   - ```javax.servlet/javax.servlet-api``` dependency: support Servlet
   - ```javax.servlet.jsp/javax.servlet.jsp-api``` dependency: support JSP (get rid of Eclipse error)
   - ```maven-war-plugin``` plugin: support Maven war plugin
3. Update Maven project (Alt+F5)  
4. Configure by Java for Spring MVC 
[[Reference]()]
   - Spring Config 
[[AppConfig]()]
   - Spring MVC Initializer 
[[SpringMvcInitializer]()]
5. Create a Rest Controller 
[[DemoRestController]()]
   - @RestController
   - @RequestMapping
   - Add endpoint (method)
6. Test Spring REST by running project on server and access the created endpoint (url)

---

## Notes/Tips
- If ```src/main/java``` and ```src/test/java``` are not availalbe, go to Build Path ->  Order and Export -> Choose JRE and Maven Dependencies.
- Default welcome page: [index.jsp]() inside src/main/webapp 




