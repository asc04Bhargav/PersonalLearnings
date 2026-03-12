package com.telusko;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//if we are using external tomcat we can use this.
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("Hi Service");

//        it will know we are using html tags also
        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        out.println("<h2><b>Hello World</b></h2>");
    }
}
