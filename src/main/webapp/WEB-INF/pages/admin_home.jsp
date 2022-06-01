<%@ page language="java"  isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
</head>
<body>

<frm:form method="POST" action="/SignIn_admin" modelAttribute="ad"  >
  <table border="0"  bgcolor="yellow" align="center">
  <tr align="center">
 <h3 align="center"> Admin Signin Page </h3>
  </tr>
    <tr>
        <td>User Name :: </td>
       <td><frm:input path="username"/>  </td>
    </tr>
    <tr>
        <td> Password :: </td>
       <td><frm:password path="password"/>  </td>
    </tr>
   <tr align="center">
        
        <td colspan="1"><input type="submit" value="submit">  </td>
        <td colspan="1"><a href="./signup_admin" style="color: red">Sign Up</a>  </td>
    </tr>
 </table>
</frm:form> 
</body>

 <br><br>
 <hr>
          <h1 style="text-align:center"><a href="./home">Home</a> </h1>
 <hr>
</html>