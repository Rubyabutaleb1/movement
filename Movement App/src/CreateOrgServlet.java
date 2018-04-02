import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;


public class CreateOrgServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String orgName = request.getParameter("orgName");
        String password = request.getParameter("password");
        String orgPurpose = request.getParameter("orgPurpose");

        String sqlInsert = "INSERT INTO MovementApp.Organization (Organization-Name, Password, Role, Organization-Purpose) VALUES (" +
                "'" + orgName + "', '" + password + "', 'authuser', '" + orgPurpose + "')";
        String errMsg;

        try {

            // initialize driver, connection, statement, and executeUpdate
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/MovementApp";
            String dbUsername = "root";
            String dbPassword = "sesame";
            Connection connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(sqlInsert);

            // close all
            statement.close();
            connection.close();

            // redirect to user.jsp
            response.sendRedirect("../web/index.jsp");

        } catch (ClassNotFoundException e) {
            errMsg = "<p>Error loading the databse driver: <br>"
                    + e.getMessage() + "</p>";
            request.setAttribute("errMsg", errMsg);
            getServletContext()
                    .getRequestDispatcher("/errorpage.jsp")
                    .forward(request, response);request.setAttribute("errMsg", errMsg);
        } catch (SQLException e) {
            errMsg = "It appears this user already exists. <a href='../web/index.jsp'>Try logging in.</a>";
            request.setAttribute("errMsg", errMsg);
            getServletContext()
                    .getRequestDispatcher("/index.jsp")
                    .forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
