package com.example.servletexam;

import java.io.*;
import java.util.Enumeration;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        // servlet 첫 시작떄만 딱 한번
        System.out.println("init() 호출");
        message = "Hello World!";
    }

    // http protocol method와 상관 없이 실행, get,post,put,delete 의 부모 메소드
    protected  void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>service method 호출</h1>");
        out.println("</body></html");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String s = headerNames.nextElement();
            System.out.println(s + ": " + request.getHeader(s));
        }

        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}