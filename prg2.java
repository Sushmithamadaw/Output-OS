
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Auto web page Refresh</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>
            <h1>Hello World!</h1>
            <b>Welcome to JSP Page</b>
            <center><h2>Customer Account Details</h2></center>
            <form action="refresh" method="get"><br><br>
                Name:<input type="text" name="AccName"><br><br>
                Account number:<input type="text" name="AccNum"><br><br>
                Branch:<input type="text" name="Branch"><br><br>
                Place:<input type="text" name="Place"><br><br>
                Date:<input type="text" name="Date"><br><br>
                <input type="submit" name="submit">
                
            </form>
        </div>
    </body>
</html>


java

import java.util.Date;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mcacnj
 */
@WebServlet(urlPatterns = {"/refresh"})
public class refresh extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void performTask(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("TestServlet Says hii at"+new Date());
  try {
      String AccName=request.getParameter("AccName");
       String AccNum=request.getParameter("AccNum");
        String Branch=request.getParameter("Branch");
         String Place=request.getParameter("Place");
          String Date=request.getParameter("Date");
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet refresh</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Customer Account Details<h2>");
            out.println("<font face=6>Dear User<br>");
            out.println("Your Information<br><br>");
            out.println("Account Name " + AccName + "</br>");
            out.println("Account Number " + AccNum + "</br>");
            out.println("Branch" + Branch + "</br>");
            out.println("Place" + Place + "</br>");
            out.println("Date" + Date+ "</br>");
            out.println("</body>");
            out.println("</html>");
        }
  finally{
      out.close();
  }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        performTask(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       performTask(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}




















Hello World!
Welcome to JSP Page
Customer Account Details


Name:
sushmitha


Account number:
ac12345678


Branch:
puttur


Place:
Puttur


Date:
5/12/2022


submit


TestServlet Says hii atMon Dec 05 15:40:36 IST 2022
Customer Account Details
Dear User
Your Information

Account Name sushmitha
Account Number ac12345678
Branchputtur
PlacePuttur
Date5/12/2022
