<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%--<h1><%= "Hello World!" %>--%>
<%--</h1>--%>
<%--<br/>--%>
<%--<a href="hello-servlet">Hello Servlet</a>--%>

<form action="upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
<%--    <input type="file" name="file2" multiple>--%>
    <input type="submit" value="Upload the File">
</form>
</body>
</html>