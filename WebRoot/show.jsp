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
    
    <title>չʾҳ��</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />	
  </head>
  
  <body>
   <h1 align="center"> ������չʾҳ��</h1> <br>
   <div align="center">
   <table id="show" align="center" style="text-align: center">
<tr>
   <td>
          ID
  </td>
<td >
         ����
</td>
<td>
     ����
</td>
<td>
����
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
       <s:a href="%{get}">�޸�</s:a>
         <s:url id="del" action="delBook">
	<s:param name="id">${id}</s:param>
       </s:url>
       <s:a href="%{del}">ɾ��</s:a>
</td>
</tr>
</s:iterator>
</table>
   </div>
  </body>
 
</html>
