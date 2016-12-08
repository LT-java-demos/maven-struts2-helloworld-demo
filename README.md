#maven-struts2-hello-world-demo

###run demo

```shell
$ mvn jetty:run
```

访问 ：[http://localhost:8080/index.jsp](http://localhost:8080/index.jsp) 

你会看到 1 + 1 = ？

输入2，跳转到 `main.jsp` ， 显示`Hello world`

非2，跳转到 `false.jsp` , 显示`flase`

###pom.xml

- struts2
```xml
<dependency>
  <groupId>org.apache.struts</groupId>
  <artifactId>struts2-core</artifactId>
  <version>2.3.30</version>
</dependency>
```

- jetty
```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.eclipse.jetty</groupId>
      <artifactId>jetty-maven-plugin</artifactId>
      <version>9.3.14.v20161028</version>
    </plugin>
  </plugins>
</build>
```


- maven阿里云国内镜像（解决maven下载缓慢问题）

>步骤：http://www.jianshu.com/p/47ed6b64844a

```xml
<repositories>
    <repository>
        <id>central</id>
        <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
    </repository>
</repositories>
<pluginRepositories>
    <pluginRepository>
        <id>central</id>
        <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
    </pluginRepository>
</pluginRepositories>
```

###struts.xml

```xml
<struts>
    <package name="default" namespace="/" extends="struts-default">
        <action name="test" class="com.lt.action.Test">
            <result name="success">/main.jsp</result>
            <result name="false">/false.jsp</result>
        </action>
    </package>
</struts>
```

###web.xml
```xml
<filter>
    <filter-name>struts2</filter-name>
    <filter-class>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter</filter-class>
</filter>
<filter-mapping>
    <filter-name>struts2</filter-name>
    <url-pattern>/*</url-pattern>
</filter-mapping>
```
