package com.dzmitry.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class NameServlet extends HttpServlet {
    private NameService nameService;

    @Override
    public void init() throws ServletException {
        nameService = new NameServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        send(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String newName = req.getParameter("newName");
        nameService.add(newName);
        send(req, resp);
    }

    private void send(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> names = nameService.getAll();
        req.setAttribute("names", names);
        req.getRequestDispatcher("WEB-INF/jsp/namelist.jsp").forward(req, resp);
    }
}
