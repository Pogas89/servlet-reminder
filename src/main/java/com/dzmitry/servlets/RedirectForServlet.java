package com.dzmitry.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RedirectForServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("sessionCreationTime", req.getSession().getCreationTime());
        req.getRequestDispatcher("WEB-INF/jsp/hello.jsp").forward(req,resp);
    }
}
