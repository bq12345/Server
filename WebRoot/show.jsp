<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>展示页面</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />	
  </head>
  
  <body>
   <h1 align="center"> 这里是展示页面</h1> <br>
   <div align="center">
   <table id="show" align="center" style="text-align: center">
<tr>
   <td>
          ID
  </td>
<td >
         名称
</td>
<td>
     描述
</td>
<td>
操作
</td>
</tr>
<s:iterator value="list">
<tr>
   <td>
          ${id}
  </td>
<td >
         ${name}
</td>
<td>
         ${detail}
</td>
<td>
         <s:url id="get" action="getBook">
	<s:param name="id">${id}</s:param>
       </s:url>
       <s:a href="%{get}">修改</s:a>
         <s:url id="del" action="delBook">
	<s:param name="id">${id}</s:param>
       </s:url>
       <s:a href="%{del}">删除</s:a>
</td>
</tr>
</s:iterator>
</table>
   </div>
  </body>
 
</html>
