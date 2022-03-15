<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<title>First JSP</title>
</head>
<body>
<h1>Hello zhopa</h1>
<% response.getWriter().write("Самая первая строчка в сервлете"); %>  //скриплет
<br>
<%= request.getRequestURI();%>
</br>
<%=LocalDateTime.now()  %>
<br>
    <% List <User> users = (List) request.getAttribute("users");
    User firstUser = users.get (0);
    out.print(User.getName())
    %>
</br>
</body>
</html>