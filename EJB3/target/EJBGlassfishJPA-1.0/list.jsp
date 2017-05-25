<%@ page import="com.devcolibri.entity.CurrentValue" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Список оценок и среднего балла</title>
</head>
<body>
    <h1>Search User Information</h1>
    <form action="add" method="post"><!---->
       User's info for nr. <%= request.getParameter("id") %>:<%= request.getParameter("city") %>,
        <%= request.getParameter("code") %>
        <p><label for="id">User's number:
            <input type="text" id="id" value="" name="id" />
        </label></p>

        <input type="submit" value="Select" />
    </form>

</body>
</html>