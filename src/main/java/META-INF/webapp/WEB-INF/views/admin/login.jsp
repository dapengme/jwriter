<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>	
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sobey--云平台服务-注册</title>
<!-- Le styles -->
<link href="<c:url value='/admin/css/cmop.css'/>" rel="stylesheet">
<link href="<c:url value='/admin/css/bootstrap.css'/>" rel="stylesheet">
<link href="<c:url value='/admin/css/bootstrap-responsive.css'/>" rel="stylesheet">
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
     <script src="<c:url value='/admin/js/html5.js'/>"></script>
    <![endif]-->
<!-- Placed at the end of the document so the pages load faster -->
<script src="<c:url value='/admin/js/jquery.min.js'/>"></script>
<script src="<c:url value='/admin/js/bootstrap.min.js'/>"></script>

</head>
<body>

	<div class="container">

		<!-- Header -->
		<div class="page-header">
			<h1>
				Sobey<small>--云平台服务</small>
			</h1>
		</div>


		<div class="row">
			<div class="span6 offset3">
				<div class="page-header">
					<p>
						<h1>注册</h1>
						 <a class="pull-right btn btn-success " href="./SignUp.html">	登录→ </a> 
				</div>
				<form action="/admin/login.do" class="form-actions" method="post">

						<div class="control-group">
							<label for="focusedInput" class="control-label">公司邮箱</label>
							<div class="controls">
								<input type="text" id="email" name="email" placeholder="Email" class="">
							</div>
						</div>

						<div class="control-group">
							<label for="focusedInput" class="control-label">密码</label>
							<div class="controls">
								<input type="password" id="password" name="password" placeholder="Password"
									class="">
							</div>
						</div>

						<div class="form-actions">
							<button class="btn btn-primary" type="submit">保存修改</button>
						</div>

				</form>
			</div>
		</div>

		<!-- Footer -->
		<div id="footer" class="span12">Copyright &copy; 2005-2012 Sobey</div>

	</div>

</body>
</html>	