<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<head>
    <title>plus.jsp</title>
</head>
<body>
<%
    System.out.println(request.getAttribute("x"));
    out.write(request.getAttribute("x").toString());
    out.write("+");
    out.write(request.getAttribute("y").toString());
    out.write("=");
    out.write(request.getAttribute("value").toString());
%>
<h1>${x} + ${y} = ${value}</h1>
</body>
</html>