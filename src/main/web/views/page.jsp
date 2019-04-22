<%--
  Created by IntelliJ IDEA.
  User: Nazariy_Kulyan
  Date: 4/22/2019
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Some page</h1>
<p>visited: ${requestScope.get("visitedPage")}</p>
<a href="/home"> <- back</a>
</body>
</html>
