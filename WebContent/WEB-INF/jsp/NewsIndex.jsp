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
    <table border="1" id="#msgTab">
        <tr>        
            <th>序号</th>
            <th>标题</th>
            <th>内容</th>
            <th>办卡日期</th>
            <th>姓名</th>
            <th>操作</th>
        </tr>
        <s:iterator value="allNewList">
            <tr>    
                <td><s:property value="id"/></td>
                <td><s:property value="title"/></td>
                <td><s:property value="content"/></td>
                <td><s:date name="begintime" format="yyyy年MM月dd日"/></td>
                <td><s:property value="username"/></td>
                <td><s:a value="NewsAction_deleteSingleNews?id=%{id}">删除</s:a></td>
            </tr>
        </s:iterator>
        <s:if test="allNewList.size()==0">
            <tr>                    
                <td colspan="6">没有查找到数据</td>
            </tr>
        </s:if>
    </table>
</div>
</body>
</html>