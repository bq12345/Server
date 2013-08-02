<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    

<META name="viewport" content="width=device-width, initial-scale=1">
<TITLE>添加</TITLE>		

<BODY>
<DIV data-role="header" data-position="inline"> 
<H1>增加书</H1></DIV>
<DIV data-role="content">
<FORM action="addBook" method="POST">
<s:hidden name="book.id" ></s:hidden>
<label>书名：</label>
<input name="book.name" class="ui-input-text ui-body-null ui-corner-all ui-shadow-inset ui-body-c" />
<br> <label>详情：</label>
<input name="book.detail" class="ui-input-text ui-body-null ui-corner-all ui-shadow-inset ui-body-c" />
<BUTTON type="submit" data-theme="b" data-inline="true">保存</BUTTON>
<HR>
</FORM>
</DIV>
<DIV class="footer-docs" data-role="footer" data-theme="c">
<P>&nbsp;2012~2013  白强</P>
</DIV>
</BODY>
</HTML>
