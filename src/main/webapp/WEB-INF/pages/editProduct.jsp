<%@ page isELIgnored="false"  %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
 <h1 style="color:red;text-align:center"> Edit Product </h1>
 <form:form modelAttribute="prod" method="POST" action="/edit">
   <table border="1" bgcolor="cyan"  align="center">
   <tr>
         <td> Product no ::  </td>
         <td> <form:input path="pid"  readonly="true"/>  </td>
      </tr>
      
      <tr>
         <td> Product name ::  </td>
         <td> <form:input path="pname"/>  </td>
      </tr>
      
       
      <tr>
         <td> Price ::  </td>
         <td> <form:input path="price"/>  </td>
      </tr>
      
     
      
      <tr>
         <td colspan="2" align="center"><input type="submit" value="Edit Product"/></td>
      </tr>
   </table>
 </form:form> 
     
