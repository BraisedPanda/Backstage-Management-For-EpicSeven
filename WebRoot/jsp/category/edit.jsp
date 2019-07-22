<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'edit.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
	*{
	margin:0;
	padding:0;
	}
	.top{
	font-size:20px;
	border-bottom:1px solid gray;
	width:1200px;
	margin-top:10px;
	height:30px;
	}
	.add{
	margin-left:20px;
	text-align:center;
	background:#983680;
	color:white;
	border-radius:10px;
	width:150px;
	}
	.form{
	margin-top:20px;
	text-align:center;
	}
	input{
	width:200px;
	height:30px;
	border-radius:13px;
	outline:none;
	padding:10px;
	font-size:15px;
	}
	.submit{
	width:80px;
	height:40px;
	color:white;
	font-size:16px;
	background:#619ac3;
	
	}
	.submit:hover{
	cursor:pointer;
	background:#57c3c2;
	}
</style>
  </head>
  
  <body>
   <div class="top">
  		<p class="add">添加用户</p>
  	</div>
  <div class="form">
    <form method="post" action="modifyCategory.action">
    	<input type="hidden" name="cid" value="${category.cid }">
    	<lable>修改分类名称：</lable><input type="text" name="cname" value="${category.cname }">
    	<input type="submit" value="提交" class="submit">
    	
    </form>
    </div>
  </body>
</html>
