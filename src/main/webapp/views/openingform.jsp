<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightpink">
	<form action="reg" method="post">
		<hr>
		<h1>
			<center>WelCome To Employee Management System</center>
		</h1>
		<br>
		<hr>
		<h3>
			<center>Please Fill The Form To Register Employee In EMS....</center>
		</h3>
		<br>

		<div>
			<label name="ename"> Employee Name : </label> <br>
			<input type="text" name="ename" required placeholder="Enter Emp Name"><br>
		</div>

		<div>
			<label name="eusername">Employee User Name : </label> <br>
			<input type="text" name="eusername" required placeholder="Emp User Name"><br>
		</div>

		<div>
			<label name="euserpass">Employee Password : </label> <br>
			<input type="text" name="euserpass" required placeholder="Emp Password"><br>
		</div>

		<div>
			<label name="edept">Employee Department : </label> <br>
			<span><input type="text" name="edept" required placeholder="Emp Department"><br>
		</div>

		<div>
			<label name="epackage">Employee Package: </label> <br>
			<input type="text" name="epackage" required placeholder="Emp Package"><br>
		</div><br><br>
		<input type="submit" value="click hear to save data">
	</form>
</body>
</html>
