<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<% 
	
	
	
   			PreparedStatement pst = null;
			Connection con = null;
			
            String username = request.getParameter("username");
            String email  = request.getParameter("email");
            String password = request.getParameter("password");
            
            
            con = connectDB();
            
            try {
            	
            	
                
                String insert = "INSERT INTO users (user_Name, user_Email, user_Password) VALUES (?,?,?)";

                pst = con.prepareStatement(insert);

                pst.setString(1, username);
                pst.setString(2, email);
                pst.setString(3, password);

                pst.execute();

               

            } catch (Exception e) {

            }
           	
            response.sendRedirect("login.html");
        %>

</body>
</html>