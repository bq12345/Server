<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>��ӭ</title>
  </head>
  
  <body>
   <h1 align="center"> ��ӭ����SSH���ϲ���ҳ��</h1> <br>
   <div align="center">
     <a href="query">�������</a>&nbsp;&nbsp;<a href="add.jsp">������</a>
   </div>
  </body>
 
</html>
