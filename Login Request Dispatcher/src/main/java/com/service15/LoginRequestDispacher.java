package com.service15;

import java.io.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginRequestDispacher extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String u = request.getParameter("username");
        String p = request.getParameter("password");

        if(u.equals("monu@mail.com")&& p.equals("password")) {     
        	RequestDispatcher rd = request.getRequestDispatcher("WelcomeRequest");
            rd.forward(request, response);
        } else {
            out.print("Sorry, incorrect username or password!");
            RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
            rd.include(request, response);
        }
    }  
}
