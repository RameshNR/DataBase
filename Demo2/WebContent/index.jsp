<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="MyService" method="post">

Name :
<input type="text" name="name" placeholder="Enter UserName" required>

</br></br>

Password :
<input type="password" name="pw" placeholder="Enter PassWord" required>

</br></br>

G-mail :
<input type="text" name="mailID" placeholder="Enter Email ID" required>

</br></br>

Native :
<input type="text" name="native" placeholder="Enter Native" required>

</br></br>

<input type="submit" value="Submit" />
<input type="RESET" value="Reset" />

</form>

</body>
</html>