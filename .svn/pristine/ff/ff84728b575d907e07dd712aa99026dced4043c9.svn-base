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
	margin:0;
	padding:0;
	}
	ul{
	list-style:none;
	margin:10px;
	}
	ul>li{
	float:left;
	margin:10px;
	}
	
	.display{
	margin-top:10px;
	
	float:left;
	}
	.detail{
	display:table;
	text-align:center;  
 	width:250px; 
	height:470px;
	border:1px solid gray;
	float:left;
	margin:20px;
	
	}
	.img{
	width:160px; 
	height:200px;
	}
	.detail>li{
	 width:250px;
	}
	.gname{
	color:#bc84a8;
	}
	
	.pageBean{
	margin-top:20px;
	margin-bottom:20px;
	margin-left:32%;
	text-align:center;
	float:left;
	
	}
	a{
	text-decoration:none;
	color:#b7511d;
	}
	a:hover{
	color:#63bbd0;
	}
	.detail:hover{
	 border:1px dashed #bc84a8;
	}
	.price{
	color:red;
	}
	.a{
	border-radius:10px;
	width:30px;
	
	}
	.category>li{
	width:80px;
	text-align:center;
	
	}
	.a:hover{
	background:#66c18c;
	
	}
	.a>a:hover{
	color:white;
	}
	.pageBean{
	width:600px;
	float:left;
	margin-top:50px;
	text-align:center;
	}
	.navigation{
	border-bottom:1px solid #207f4c;
	height:50px;
	}
</style>
<script>
	function confirm1(){
		var result = confirm("是否确认删除？");
		if(result == true){
			
		}else{
		window.event.returnValue = false;
		}
	}
</script>
  </head>
  
  <body>
    <div class="navigation">
    	<ul class="category">
    		<li class="a"><a href="<c:url value='/findAllGoods.action?currentPage=1'/>">全部分类</a></li>
    		<li class="a"><a href="<c:url value='/findHeros.action?currentPage=1'/>">英      雄</a></li>
    		<li class="a"><a href="<c:url value='/findEquipments.action?currentPage=1'/>">装      备</a></li>
    		<li class="a"><a href="<c:url value='/findMonster.action?currentPage=1'/>">怪      物</a></li>
    		<li class="a"><a href="<c:url value='/findArtifact.action?currentPage=1'/>">神      器</a></li>
    		<li class="a"><a href="<c:url value='/findAbyss.action?currentPage=1'/>">深      渊</a></li>
    	</ul>
    </div>
    <div class="display">
    	<c:forEach items="${goodsList }" var="list">
    		<ul class="detail">
    			<li class="gname">${list.gname }</li><br>
    			<li><img src="/images/${list.image }" class="img"></li><br>
    			<li class="category2">类别：${list.category.cname }</li><br>
    			<li>简介：${list.introduction }</li><br>
    			<li class="price">单价：${list.price }元</li><br>
    			
    			<li class="category2">
    				<a href="<c:url value='/goodsDetail.action?gid=${list.gid }'/>">编辑</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    				<a href="<c:url value='/deleteGoodsByGid.action?gid=${list.gid }'/>" onClick="confirm1();">删除</a>
    			</li>
    		</ul>
    	</c:forEach>
    </div>
    
  
     <div class="pageBean">
    <c:if test="${pageBean.currentPage-1 >0 }">
    	<a href="<c:url value='/findGoods1.action?currentPage=${pageBean.currentPage-1 }&findName=${findName }'/>">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </c:if>
    	第${pageBean.currentPage }页/共${pageBean.totalPage }页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <c:if test="${pageBean.currentPage +1 <= pageBean.totalPage }">
    	<a href="<c:url value='/findGoods1.action?currentPage=${pageBean.currentPage+1 }&findName=${findName }'/>">下一页</a>
    </c:if>
    </div>
  </body>
</html>
