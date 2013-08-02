<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>欢迎</title>
  </head>
  
  <body>
   <h1 align="center"> 欢迎来到SSH整合测试页面</h1> <br>
   <div align="center">
     <a href="query">点击进入</a>&nbsp;&nbsp;<a href="add.jsp">增加书</a>
   </div>
  </body>
 
</html>
