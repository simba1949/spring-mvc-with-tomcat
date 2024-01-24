<!DOCTYPE html>
<html lang="en">
<head>
    <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta charset="UTF-8">
    <title>首页</title>
</head>
<body>
<h1>首页</h1>
<a href="${pageContext.request.contextPath}/gotoPage?pageName=login"> 去登录（String） </a>
<br/>
<a href="${pageContext.request.contextPath}/gotoPage2?pageName=login"> 去登录2（ModelAndView） </a>
</body>
</html>