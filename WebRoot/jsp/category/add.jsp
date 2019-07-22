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
    
    <title>My JSP 'allgoods.jsp' starting page</title>
    
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
	padding:0;
	margin:0;
	}
	.form{
	text-align:center;
	margin-top:30px;
	}
	input{
	width:300px;
	height:40px;
	margin:10px;
	border-radius:10px;	
	outline:none;
	float:left;
	font-size:15px;
	}
	select{
	width:300px;
	height:40px;
	margin:10px;
	border-radius:10px;	
	outline:none;
	float:left;
	}
	p{
	overflow:hidden;
	
	}
	lable{
	float:left;
	width:80px;
	margin-left:40%;
    text-align:center;
    line-height:50px;
	}
	.sub{
	margin-left:50%;
	width:200px;
	background:#57c3c2;
	border-radius:20px;
	border:none;
	}
	.sub:hover{
	background:#5dbe8a;
	}
	img{
	margin-left:50%;
	width:160px;
	height:200px;
	}
	h1{
	margin-left:50%;
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
	background:#57c3c2;
	color:white;
	border-radius:10px;
	width:150px;
	}
</style>
  </head>
  
  <body>
    <div class="top">
  		<p class="add">添加分类</p>
  	</div>
    <div class="display">
    
    	<h1>添加分类界面</h1>
    	<form action="<c:url value='/addCategory.action'/>" method="post" >
    		
    		<p>
      		<lable>分类名称：</lable>
    		<input type="text" name="cname"><br>
    		</p>
 	  		<p>
      		<lable></lable>
    		<input type="submit" value="添加" class="sub">
    		</p>
    	</form>
    	
    </div>
    
   
  </body>
</html>
