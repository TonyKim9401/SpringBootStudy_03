<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<img src="intellij.jpg">
<br>
<%
    for(int i = 0; i < 100; i++){
        out.write("hello world<br>");
    }
%>
<a href="hello-servlet">Hello World</a>
</body>
</html>