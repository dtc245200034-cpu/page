package com.codegym;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='vi'>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<title>Hello Servlet</title>");
            out.println("</head>");
            out.println("<body style='font-family: Arial; text-align: center; margin-top: 80px;'>");
            out.println("<h1>Chào mừng bạn đến với Servlet đầu tiên!</h1>");
            out.println("<p>Thời gian hiện tại của máy chủ:</p>");
            out.println("<p><strong>" + new Date() + "</strong></p>");
            out.println("<p><a href='index.jsp'>Quay lại trang chủ JSP</a></p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
