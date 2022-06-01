<%@ page isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<c:choose>
   <c:when test="${!empty prodData}">
     <table border="1" bgcolor="cyan"  align="center">
      <tr>
         <th>Product Id  </th>
         <th>Product Name </th>
         <th>Price </th>
          <th>Operations </th>
         
      </tr>
      <c:forEach var="prod" items="${prodData}">
           <tr>
              <td>${prod.pid} </td>
              <td>${prod.pname} </td>
              <td>${prod.price} </td>
              
             <td><a href="edit?no=${prod.pid}">Edit</a>
                   &nbsp;&nbsp;&nbsp; <a onclick="return confirm('Do you want to delete')" href="delete?no=${prod.pid}">Delete</a>  </td>
           </tr>          
      </c:forEach>
      </table>
   </c:when>
      <c:otherwise>
          <h1 style="color:red;text-align:center"> Records not found </h1>
      </c:otherwise>
</c:choose>
                      
                             <c:if test="${!empty resultMsg}">
                                 <h3 style="color:green;text-align:center"> ${resultMsg }</h3>
                             </c:if>
                                     
 <br><br>
 <hr>
          <h1 style="text-align:center"><a href="./home">Home</a> </h1>
 <hr>
  <h1 style="text-align:center"><a  href="./add"> Add Product</a> </h1>
