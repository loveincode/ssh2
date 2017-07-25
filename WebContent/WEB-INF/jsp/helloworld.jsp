<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
    #showDiv{
        width:1000px;
        height:70px;
        margin: auto;
    }
</style>
</head>
<body>
<div id="showDiv" align="center">
    <h1>ssh2框架测试</h1>
</div>
<div id="msgDiv" align="center">
   helloworld
   <s:property value="id"/>
</div>
</body>
</html>