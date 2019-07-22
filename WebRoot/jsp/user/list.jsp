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
    
    <title>My JSP 'message.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
	td{
	width:300px;
	}
	.pageBean{
	margin-top:50px;
	text-align:center;
	}
	a{
	text-decoration:none;
	color:#b7511d;
	}
	a:hover{
	color:#f8ebe6;
	}
	.firsttr{
	background:#93b5cf;
	height:30px;
	
	}
	.othertr:hover{
	background:#92b3a5;
	}
	
	
	
</style>
<script>
	function test(){
		var result = confirm("是否确认删除");
		if(result==true){
			alert("删除成功");
		}else{
		window.event.returnValue=false;
		}
	}
</script>
  </head>

  <body>
    	 <h1>用户信息界面</h1><span class="total">总记录数：${pageBean.totalCount }</span><br>
    	<table border="1">
    		<tr class="firsttr">
    			<td >用户ID</td>
    			<td>用户名</td>
    			<td>邮箱</td>
    			<td>手机号码</td>
    			<td>操作</td>
    		</tr>
    		<c:forEach items="${userList }" var="list">
    		<tr class="othertr">
    			<td> ${list.uid }</td>
    			<td>${list.username }</td>
    			<td>${list.email }</td>
    			<td>${list.phonenumber }</td>
    			<td width="100px"><a href="<c:url value='/findUserByUid.action?uid=${list.uid }'/>">修改</a>&nbsp;
    			<a href="<c:url value='/deleteUserByUid.action?uid=${list.uid }'/>" onclick="test();">删除</a>&nbsp;
    			<a href="<c:url value='/findOrderByUid.action?uid=${list.uid }'/>">订单</a>
    			</td>
    		</tr>
    		</c:forEach>
    	</table>
    <div class="pageBean">
    <a href="<c:url value='/findAllUser.action?currentPage=1'/>">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <c:if test="${pageBean.currentPage-1 >0 }">
    	<a href="<c:url value='/findAllUser.action?currentPage=${pageBean.currentPage-1 }'/>">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </c:if>
    	第${pageBean.currentPage }页/共${pageBean.totalPage }页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <c:if test="${pageBean.currentPage +1 <= pageBean.totalPage }">
    	<a href="<c:url value='/findAllUser.action?currentPage=${pageBean.currentPage+1 }'/>">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </c:if>
    <a href="<c:url value='/findAllUser.action?currentPage=${pageBean.totalPage }'/>">尾页</a>
    </div>
  </body>
</html>
