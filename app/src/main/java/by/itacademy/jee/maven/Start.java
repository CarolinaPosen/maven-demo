package by.itacademy.jee.maven;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Hello world!
 *
 */
public class Start extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.write("<h1>HELLO, LIZA, YOU ARE MIRMISHKA:)</h1>");
    }
}
