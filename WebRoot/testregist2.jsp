<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
	<meta charset="UTF-8">
	<title>Basic ValidateBox - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="themes/icon.css">
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<script type="text/javascript" src="js/jquery.min.js"></script> 
	
	<script type="text/javascript" src="js/jquery.validate.js"></script>
	<style>
		error{
			color:red;
			margin-left:20px;
			font-size:10px;
		}
	</style>
</head>
<body>
	<h2>Validate On Blur</h2>
	<p>Active validation on first blur event.</p>
	<div style="margin:20px 0;"></div>
	<div class="easyui-panel" title="Register" style="width:800px;padding:10px 60px 20px 60px">
	<form method="post" action="" id="form">
		<table cellpadding="5">
			<tr>
				<td>User Name:</td>
				<td><input type="text" placeholder="请输入用户名" id="username" name="username" required></td>
			</tr><span id="sname"></span>
			<tr>
				<td>Password:</td>
				<td><input type="password" id="password" name="password" required></td>
			</tr>
			<tr>
				<td>Birthday:</td>
				<td><input type="text"></td>
			</tr>
			
			<tr>
				<td>Phone:</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td><input type="submit" value="注册"></td>
				
			</tr>
		</table>
		</form>
	</div>
	<script type="text/javascript">
		$(function(){
			$("#form").validate({
			rules:{
			username:{
			required:true,
			minlength:2
			},
			password:{
			required:true,
			minlength:8
			}
			}
			});
		})
	</script>
	<style scoped="scoped">
		.textbox{
			height:20px;
			margin:0;
			padding:0 2px;
			box-sizing:content-box;
		}
	</style>

</body>
</html>