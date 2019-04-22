<%--
  Created by IntelliJ IDEA.
  User: Nazariy_Kulyan
  Date: 4/15/2019
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>home</h1>
<p>visited:${requestScope.get("visitedBase")}</p>
<a href="/page">some page</a>
</body>
</html>
