# Web Serivce
> JAX-WS Web service on JBoss AS 7

JBoss AS 7 ships with Apache CXF web services implementation.

## Web Service implementation
```java
@WebService(endpointInterface = "kyun.webservice.Math", serviceName = "MathWS")
public class MathWS implements Math {

	public long sum(long a, long b) {
		System.out.println("Summing " + a + " + " + b);
		return a + b;
	}
}
```

## Web Service registeration
As this Web service is implemented as a Servlet, we need registering the Servlet into the web.xml as usual:  
`web.xml`
```xml
  <servlet>
    <servlet-name>MathWS</servlet-name>
    <servlet-class>kyun.webservice.MathWS</servlet-class>
  </servlet>

  <servlet-mapping>
    <servlet-name>MathWS</servlet-name>
    <url-pattern>/*</url-pattern>
  </servlet-mapping> 
```
