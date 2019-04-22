package com.nazar.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/page")
public class SomePageServlet extends HttpServlet {
    static int countVisitedSome;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("visitedPage",countVisitedSome++);
        req.getRequestDispatcher("views/page.jsp").forward(req,resp);
    }
}
