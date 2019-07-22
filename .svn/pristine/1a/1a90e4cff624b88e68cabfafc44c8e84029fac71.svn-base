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
	background:#eef7f2;
	border-radius:20px;
	
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
	
</style>
  </head>
  
  <body>
   
    <div class="display">
    	<h1>修改商品界面</h1>
    	<form action="<c:url value='/modifyGoodsInfo.action'/>" method="post" enctype="multipart/form-data">
    		<input type="hidden" name="gid" value="${goods.gid }">
    		<p>
      		<lable>商品名称：</lable>
    		<input type="text" name="gname" value="${goods.gname }"><br>
    		</p>
    		<p>
      		<lable>所属分类：</lable>
			<select name="cid">
    			<option value="${goods.cid }">===请选择分类===</option>
    			<c:forEach items="${categoryList }" var="category">
    			<option value="${category.cid }">${category.cname }</option>
    			
    			</c:forEach>
 	  		</select><br>
 	  		</p>
 	  		
 	  		<p>
      		<lable></lable>
 	  		<img src="/images/${goods.image }"><br>
 	  		</p>
 	  		<p>
      		<lable>修改图片:</lable>
      		
      		<input type="file" name="file"/><br>
      		</p>
      		
 	  		<p>
      		<lable>单价：</lable>
 	  		<input type="text" name="price" value="${goods.price }"><br>
 	  		</p>
 	  		<p>
      		<lable>简介：</lable>
    		<input type="text" name="introduction" value="${goods.introduction }" ><br>
    		</p>
    		<p>
      		<lable>商品详细：</lable>
    		<input type="text" name="detail" value="${goods.detail }" ><br>
    		</p>
    		<p>
      		<lable></lable>
    		<input type="submit" value="修改" class="sub">
    		</p>
    	</form>
    	
    </div>
    
   
  </body>
</html>
