<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Николай
  Date: 17.08.2020
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form:form method="POST" action="${pageContext.request.contextPath}/addTask" modelAttribute="task">
    <table>
      <tr>
        <td><form:label path="words">Words</form:label></td>
        <td><form:input path="words" /></td>
      </tr>
      <tr>
        <td>Тип задачи</td>
      <td>
        <form:radiobuttons path = "type" items = "${typesList}" />
      </td>
      </tr>
      <tr>
        <td><input type="submit" value="Посчитать" /></td>
      </tr>
    </table>
  </form:form>
  ${answer}
  </body>
</html>
