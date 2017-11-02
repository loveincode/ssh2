<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add new user</title>
</head>
<body>
    <a href="${pageContext.request.contextPath}/user">Back to home</a><hr/>
    <s:form method="POST" action="%{contextPath}/user">
        User Name:<s:textfield name="username"></s:textfield><br/>
        User Age:<s:textfield name="age"></s:textfield><br/>
        <s:submit value="Submit"></s:submit>&nbsp;<s:reset value="Reset"></s:reset>
    </s:form>
</body>
</html>