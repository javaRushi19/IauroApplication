<%@ page language="java"  isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customers Login</title>
</head>
<body>
<frm:form modelAttribute="cs" enctype="multipart/form-data">
  <table border="0"  bgcolor="cyan" align="center">
   <tr align="center">
 <h3 align="center"> Customer SignUp Page </h3>
  </tr>
  
      <tr>
        <td> Name :: </td>
       <td><frm:input path="custName"/>  </td>
    </tr>
    <tr>
        <td> Address :: </td>
       <td><frm:input path="custAddress"/>  </td>
    </tr>
    <tr>
        <td>User Name :: </td>
       <td><frm:input path="username"/>  </td>
    </tr>
    <tr>
        <td> Password :: </td>
       <td><frm:password path="password"/>  </td>
    </tr>
   <tr>
        <td colspan="2"><input type="submit" value="SignUp_Customer">  </td>
       
    </tr>
 </table>
</frm:form> 
</body>
</html>