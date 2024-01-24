<!DOCTYPE html>
<html lang="en">
<head>
    <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta charset="UTF-8">
    <title>登录页</title>
</head>
<body>
<H1>登录页</H1>
<a href="${pageContext.request.contextPath}/gotoPage?pageName=index">回到首页（String）</a>
<br/>
<a href="${pageContext.request.contextPath}/gotoPage2?pageName=index">回到首页（ModelAndView）</a>
</body>
</html>