<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>CodeGym JSP Demo</title>
</head>
<body style="font-family: Arial, sans-serif; text-align: center; margin-top: 80px;">
    <h1>Chào mừng tới lớp học Java Web!</h1>
    <p>Ứng dụng JSP/Servlet đang chạy trên Tomcat.</p>

    <%
        java.util.Date currentTime = new java.util.Date();
    %>

    <p>
        Thời gian hiện tại của máy chủ:
        <strong><%= currentTime %></strong>
    </p>

    <p>
        <a href="hello">Đi tới HelloServlet</a>
    </p>
</body>
</html>
