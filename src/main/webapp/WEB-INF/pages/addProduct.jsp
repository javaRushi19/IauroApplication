<%@ page isELIgnored="false"  %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
 <h1 style="color:red;text-align:center"> Add Product </h1>
 <form:form modelAttribute="prod" method="POST" action="/add">
   <table border="1" bgcolor="cyan"  align="center">
   	
   
   
      <tr>
         <td> Product Name  ::  </td>
         <td> <form:input path="pname"/>  </td>
      </tr>
      
       
      <tr>
         <td> Product Price  ::  </td>
         <td> <form:input path="price"/>  </td>
      </tr>
      
   
      
      <tr>
         <td colspan="2" align="center"><input type="submit" value="Add Product"/></td>
      </tr>
   </table>
 </form:form> 
     
