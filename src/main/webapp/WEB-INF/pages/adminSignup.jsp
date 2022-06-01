<%@ page language="java"  isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
</head>
<body>

<frm:form modelAttribute="ad" method="POST" action="">
  <table border="0"  bgcolor="yellow" align="center">
  <tr align="center">
 <h3 align="center"> Admin SignUp Page </h3>
  </tr>
        <tr>
        <td> Name :: </td>
       <td><frm:input path="adminName"/>  </td>
    </tr>
    <tr>
        <td> Address :: </td>
       <td><frm:input path="adminAddress"/>  </td>
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
        <td colspan="1"><input type="submit" value="Sign Up">  </td>
      
    </tr>
 </table>
</frm:form> 
</body>
</html>