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
    
    <title>首页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<style>
	*{
	margin:0;
	padding:0;
	
	}
	ul{
	list-style:none;
	}
	.sub{
	display:none;
	}
	.menu{
	
	 width:auto;
	
	
	}
	.menu>li{
  	border:1px solid gray;
  	line-height:45px;
  	border-bottom:none;
  	border-right:none;
  	text-indent:1.5em;
  	}
  	.menu>li:last-child{
  	border-bottom:1px solid gray;
  	border-bottom-left-radius:10px;
  	border-bottom-right-radius:10px;
  	}
  	.menu>li:first-child{
  	border-top-left-radius:10px;
  	border-top-right-radius:10px;
  	}
  	.sub>li{
  	border-top:0.5px solid gray;
  	
  	text-indent:3em;
  	
  	}
  
  	
  	.menu>li>span{
  		background:url("<c:url value='/images/menu/jiantou1.jpg'/>");
  		float:right;
  		margin-right:20px;
  		margin-top:10px;
  		display:inline-block;
  		width:24px;
  		height:24px;
  	}
  	a{
  	text-decoration:none;
  	}
  	a:hover{
  	cursor:pointer;
  	}
  	#shangping{
  	background:url("<c:url value='/images/menu/1.png'/>") no-repeat;
  	background-size:22%;
  	background-position:0 2px ;
  	padding-left:28px;
  	font-size:18;
  	}
  	#user{
  	background:url("<c:url value='/images/menu/5.png'/>") no-repeat;
  	background-size:22%;
  	background-position:0 2px ;
  	padding-left:28px;
  	font-size:18;
  	}
  	#category{
  	background:url("<c:url value='/images/menu/3.png'/>") no-repeat;
  	background-size:22%;
  	background-position:0 2px ;
  	padding-left:25px;
  	font-size:18;
  	}
  	#other{
  	background:url("<c:url value='/images/menu/4.png'/>") no-repeat;
  	background-size:22%;
  	background-position:0 2px ;
  	padding-left:25px;
  	font-size:18;
  	}
  	.s1{
  		background:url("<c:url value='/images/menu/jiantou1.png'/>") no-repeat;
  		background-size:50%;
  		background-position:0 10px;
  		float:right;
  	    display:inline-block;
  		width:40px;
  		height:40px;
  		transition:0.2s;
  	}
  	.s2{
  		background:url("<c:url value='/images/menu/jiantou2.png'/>") no-repeat;
  		background-size:50%;
  		background-position:0 10px;
  		float:right;
  	    display:inline-block;
  		width:40px;
  		height:40px;
  		transition:0.2s;
  	}
  	.sub>li:hover{
  	background:url("<c:url value='/images/menu/point1.png'/>") no-repeat;
  	background-size:2%;
  	background-position:20px 12px;
  	
  	}
</style>
<script>	
	
	$(function(){
		$(".one").click(function(){
			$(this).next().slideToggle(700);
			$(this).parent().siblings().children("ul").stop();
			$(this).parent().siblings().children("ul").slideUp(700);	
			 
	  		$(this).children(".s1").addClass("s2");
	  		$(this).parent().siblings().children("a").children(".s1").removeClass("s2");
  			
   });
	});
</script>
  </head>
  
  <body>
  	<p class="ppp"></p>
    	<ul class="menu">
    		<li class="l1">
    		<a class="one" id="shangping">
    		
    		用户管理<span class="s1"></span>
    		</a>
    			<ul class="sub">
    				<li><a href="<c:url value='/findAllUser.action?currentPage=1'/>" target="body">所有用户</a></li>
    				<li><a href="<c:url value='/jsp/user/finduser.jsp'/>" target="body">查找用户</a></li>
    				<li><a href="<c:url value='/jsp/user/adduser.jsp'/>" target="body">添加用户</a></li>
    				
    			</ul>
    		</li>
    		<li>
    		<a class="one" id="user">
    		商品管理<span class="s1"></span>
    		</a>
    			<ul class="sub">
    				<li><a href="<c:url value='/findAllGoods.action?currentPage=1'/>" target="body">所有商品</a></li>
    				<li><a href="<c:url value='/jsp/goods/findgoods.jsp'/>" target="body">查找商品</a></li>
    				<li><a href="<c:url value='/jsp/goods/addgoods.jsp'/>" target="body">添加商品</a></li>
    				<li><a href="<c:url value='/jsp/goods/piechart.jsp'/>" target="body">数据分析</a></li>
    			</ul>
    		</li>
    		<li>
    		<a class="one" id="category">
    		分类管理<span class="s1"></span>
    		</a>
    			<ul class="sub">
    				<li><a href="<c:url value='/findAllCategory.action'/>" target="body">所有分类</a></li>
    				<li><a href="${pageContext.request.contextPath }/jsp/category/add.jsp" target="body">添加分类</a></li>
    				
    			</ul>
    		</li>
    		<li>
    		<a class="one" id="other">
    		其他管理<span class="s1"></span>
    		</a>
    			
    		</li>
    		
    	</ul>
  </body>
</html>
