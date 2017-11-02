<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User list</title>
</head>
<body>
    <a href="${pageContext.request.contextPath}/user/new">Add new user</a>
    <hr/>
    <s:actionmessage/><br/>
    <table>
        <thead>
            <th>ID</th>
            <th>User name</th>
            <th>Age</th>
            <th>View</th>
            <th>Edit</th>
            <th>Remove</th>
        </thead>
        <tbody>
            <s:iterator value="model">
                <tr>
                    <td><s:property value="id"/></td>
                    <td><s:property value="username"/></td>
                    <td><s:property value="age"/></td>
                    <td><s:a href="user/%{id}">View</s:a></td>
                    <td><s:a href="user/%{id}/edit">Edit</s:a></td>
                    <td><s:a href="user/%{id}/destroy">Remove</s:a></td>
                </tr>
            </s:iterator>
        </tbody>
    </table>
</body>
</html>