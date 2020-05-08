<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
	
	
	
   			PreparedStatement pst = null;
			Connection con = null;
			
            String username = request.getParameter("username");
            
            String password = request.getParameter("password");
            
            
            
            try {
            	
            	
                
                if(username.equals("Admin") && password.equals("Admin@123")){
                	 response.sendRedirect("Home.jsp");
                }
                else{
                	response.sendRedirect("login.html");
                }
               

            } catch (Exception e) {

            }
           	
           
        %>
</body>
</html>