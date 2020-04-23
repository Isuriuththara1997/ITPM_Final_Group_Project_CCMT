<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Code Complexity Tool</title>
</head>
<style type="text/css">
#section {
	width: 1000px;
	height: 470px;
	float: left;
	padding: 10px;
}

.button {
	background-color: blue;
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
}
.button1 {
	background-color: blue;
	border: none;
	color: white;
	padding: 12px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
}

#footer {
	background-color: #000099;
	color: white;
	text-align: center;
	padding: 6px;
	clear: both;
}

h1 {
	text-align: center;
}
</style>

<body style="background-color: black;">
	<h1 style="color: blue;">
		<b><i>Code Complexity Measuring Tool</i></b>
	</h1>
	
	<h3 style="color: white;">
		<b><i>Please Upload your Source Code to Measure the Complexity</i></b>
	</h3>
	
	<div id="section">
		<form action="/action_page.php">
			<input type="file" id="myFile" name="filename" class="button1"> 
			<input type="submit" class="button">
		</form>
	</div>

	<div id="footer">Code by ITPM Group 16</div>
	
	

</body>
</html>