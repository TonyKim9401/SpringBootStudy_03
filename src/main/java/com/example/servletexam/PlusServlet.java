package com.example.servletexam;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "plusServlet", value = "/plus")
public class PlusServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        int x = Integer.parseInt(req.getParameter("x"));
        int y = Integer.parseInt(req.getParameter("y"));

        System.out.println(x + " " + y);

        int value = x + y;

//        PrintWriter out = resp.getWriter();
//        out.println("<h1>");
//        out.println(value);
//        out.println("<h1>");
        req.setAttribute("x",x);
        req.setAttribute("y",y);
        req.setAttribute("value",value);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/plus.jsp");
        requestDispatcher.forward(req,resp);
    }

}
