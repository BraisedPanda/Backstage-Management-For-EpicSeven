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
	
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>
	<h2>Validate On Blur</h2>
	<p>Active validation on first blur event.</p>
	<div style="margin:20px 0;"></div>
	<div class="easyui-panel" title="Register" style="width:400px;padding:10px 60px 20px 60px">
	<form method="post" action="">
		<table cellpadding="5">
			<tr>
				<td>User Name:</td>
				<td><input class="easyui-validatebox textbox" data-options="required:true,validType:'length[3,10]',novalidate:true" placeholder="请输入用户名" id="username"></td>
			</tr><span id="sname"></span>
			<tr>
				<td>Email:</td>
				<td><input class="easyui-validatebox textbox" data-options="required:true,validType:'email',novalidate:true"></td>
			</tr>
			<tr>
				<td>Birthday:</td>
				<td><input class="easyui-datebox textbox" data-options="required:true,novalidate:true"></td>
			</tr>
			<tr>
				<td>URL:</td>
				<td><input class="easyui-validatebox textbox" data-options="required:true,validType:'url',novalidate:true"></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input class="easyui-validatebox textbox" data-options="required:true,novalidate:true"></td>
			</tr>
			<tr>
				<td><input type="submit" value="注册"></td>
				
			</tr>
		</table>
		</form>
	</div>
	<script type="text/javascript">
		$(function(){
			$('.validatebox-text').bind('blur', function(){
				$(this).validatebox('enableValidation').validatebox('validate');
			});
			
			$("#username").on("blur",function(){
				var name = $("#username").val();
				console.log(name);
				
				if(name.length>10 || name.length<=3){
					$("#sname").html("用户名长度在3~10之间");
				}else{
				$("#sname").html("");
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