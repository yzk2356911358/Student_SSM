<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>管理员列表</title>
<link rel="stylesheet" href="./assets/css/layui.css">
<link rel="stylesheet" href="./assets/css/view.css" />
<link rel="stylesheet" href="./assets/css/admin.css" />
</head>
<body class="layui-view-body">
	<div class="layui-content">
		
		<!--面包屑导航-->
		<div class="layui-row">
			<div class="layui-card">
				<div class="table-responsive">
					<table class="layui-table" lay-skin="line" lay-size="lg" id="table">
						<thead>
							<tr>
								<th width="15%">学号</th>
								<th>头像</th>
								<th>姓名</th>
								<th>班级</th>
								<th>性别</th>
								<th>年龄</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="temp" items="${list }">
								<tr>
									<td>${temp.id }</td>
									<td><img style="width: 70px;height: 70px;" alt="" src="./file/${temp.img }">
									</td>
									<td>${temp.name}</td>
									<td>${temp.classs }</td>
									<td>${temp.gender }</td>
									<td>${temp.age }</td>
									<td><a href="./get?id=${temp.id }">修改</a> <a href="./del?id=${temp.id }">删除</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>