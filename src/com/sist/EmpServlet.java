package com.sist;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by sist on 2016-03-02.
 */
public class EmpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=EUC-KR");
        PrintWriter printWriter=resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<body>");
        printWriter.println("<center>");

        printWriter.println("<h3>구구단</h3>");


        printWriter.println("</center>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
