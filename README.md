# jsp-servlet-demo

Dự án Maven Webapp Java JSP/Servlet dành cho Tomcat 10.1+.

## Cấu trúc

jsp-servlet-demo/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/codegym/HelloServlet.java
        └── webapp/
            ├── index.jsp
            └── WEB-INF/web.xml

## Chạy

1. Mở Terminal tại thư mục dự án.
2. Chạy:
   mvn clean package
3. File WAR được tạo tại:
   target/jsp-servlet-demo.war
4. Deploy WAR vào Tomcat 10.1+.

## Kiểm tra

http://localhost:8080/jsp-servlet-demo/
http://localhost:8080/jsp-servlet-demo/hello
