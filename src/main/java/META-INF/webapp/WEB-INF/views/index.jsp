<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="inc/header.jsp"%>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="description" content="jnote">
	<title>jnote</title>
	<%@include file="inc/import.jsp" %>
</head>
<body>
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container">
				<a class="btn btn-navbar collapsed" data-toggle="collapse" data-target=".nav-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</a>
				<a class="brand" href="/">
					<img alt="Logo" src="images/logo.png"></a>
				<a class="biji" href="/">· 笔记</a>
				<div class="nav-collapse collapse">
					<ul class="nav pull-right">
						<li class="go-preview">
							<a id="preview-mode" class="preview-icon" href="javascript:void(0)" data-toggle="tooltip" data-placement="bottom" title="" data-original-title="预览模式" style=""> <i class="icon-columns"></i>
							</a>
						</li>
						<li class="go-writing">
							<a class="writing-icon" href="javascript:void(0)" data-toggle="tooltip" data-placement="bottom" title="" data-original-title="写作模式"> <i class="icon-resize-full"></i>
							</a>
						</li>
						<li class="go-output">
							<a href="/recommended" target="_blank">
								<i class="icon-home"></i>
								简书・社
							</a>
						</li>
						<li class="go-notebook active">
							<a href="javascript:void(0)">
								<i class="icon-book"></i>
								简书 · 笔记
							</a>
						</li>
						<li class="go-settings">
							<a href="javascript:void(0)" class="dropdown-toggle avatar" data-toggle="dropdown" id="nickname">
								<img alt="100" src="images/100.jpg">
								<i class="icon-caret-down"></i>
							</a>
							<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
								<li>
									<a href="/users/xJgLwX" target="_blank">
										<i class="icon-user"></i>
										我的主页
									</a>
								</li>
								<li>
									<a href="/settings">
										<i class="icon-cogs"></i>
										设置
									</a>
								</li>
								<li class="dropdown-submenu">
									<a tabindex="-1" href="#">
										<i class="icon-question-sign"></i>
										帮助
									</a>
									<ul class="dropdown-menu">
										<li>
											<a href="http://jianshu.io/notebooks/547/list" target="_blank">帮助中心</a>
										</li>
										<li>
											<a href="http://jianshu.io/p/q81RER" target="_blank">Markdown 新手指南</a>
										</li>
										<li>
											<a href="http://jianshu.io/p/ZzzUat" target="_blank">联系我们</a>
										</li>
									</ul>
								</li>
								<li>
									<a href="/sign_out">
										<i class="icon-signout"></i>
										登出
									</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>

	<div id="writer" class="container-fluid">
		<div class="row-fluid">
			<div class="span2 aside" style="height: 91%;">
				<div class="new-notebook">
					<a href="javascript:void(0)" class="create-notebook win-text" data-action="create-notebook">+新建笔记本</a>
					<div class="new-notebook-form hide">
						<form class="create-notebook-form">
							<input placeholder="请输入笔记本名..." type="text" name="name" class="input-medium notebook-input">
							<a href="javascript:void(0)" class="btn cancel" data-action="cancel-create-notebook">取消</a>
							<input class="btn btn-mainRed submit" name="commit" type="submit" value="提交" data-action="submit">
							<!-- input不能另换一行……，否则两个按钮就无法并排 -->
						</form>
					</div>
				</div>
				<ul class="nav nav-list notebooks ui-sortable" style="max-height: 116px; min-height: 116px;">

					<li class="one-notebook item active" data-model="notebook" data-cid="c-0">
						<a href="javascript:void(0)" data-type="active" class="notebook-name">
							<i class="icon icon-notebook"></i>
							<span>Diary</span>
						</a>
						<a href="javascript:void(0)" data-action="rename-notebook" class="edit-notebook" data-toggle="modal">
							<i class="icon-edit"></i>
						</a>
						<a href="javascript:void(0)" data-action="delete-notebook" class="delete-notebook">
							<i class="icon-trash"></i>
						</a>
					</li>

					<li class="one-notebook item" data-model="notebook" data-cid="c-1">
						<a href="javascript:void(0)" data-type="active" class="notebook-name">
							<i class="icon icon-notebook"></i>
							<span>Draft</span>
						</a>
						<a href="javascript:void(0)" data-action="rename-notebook" class="edit-notebook" data-toggle="modal">
							<i class="icon-edit"></i>
						</a>
						<a href="javascript:void(0)" data-action="delete-notebook" class="delete-notebook">
							<i class="icon-trash"></i>
						</a>
					</li>

				</ul>
				<div class="commercial">

					<p>属于写作者的笔记本, 一个简洁而优雅的环境让你专注于书写。</p>

				</div>
			</div>
			<div class="span3 middle" style="height: 91%;">
				<div id="notes-list">
					<div id="new-note">
						<a href="javascript:void(0)" data-action="create-note" class="new-note-link">
							<i class="icon icon-pencil"></i>
							<span class="win-text">+新建笔记</span>
						</a>
					</div>
					<ul class="nav nav-list notes ui-sortable">

						<li class="one-note active" data-model="note" data-cid="c-0">
							<i class="icon icon-note note-icon stop-share"></i>
							<p class="abbreviate">oooo</p>
							<p class="wordage win-text">字数: 1</p>
							<a href="javascript:void(0)" data-type="edit" class="note-link title">无标题笔记</a>
							<a href="javascript:void(0)" data-type="share" class="share-note dropdown-toggle" data-toggle="dropdown">
								<i class="icon-share"></i>
							</a>
						</li>

					</ul>
					<div class="one-note new-note-bottom ">
						<a href="javascript:void(0)" data-action="create-note">+在下方新建笔记</a>
					</div>
				</div>
			</div>
			<div class="span7 main">
				<div class="saving-notice hide"></div>
				<input class="title mousetrap" id="note_title" name="note_name" type="text" value="无标题笔记">
				<div id="epiceditor" class="text mousetrap" style="height: 79%;"></div>
			</div>
		</div>
	</div>
	<!-- /container -->
	  <script src="<c:url value='/js/jquery.min.js'/>"></script>
	  <script src="<c:url value='/js/prettify/prettify.js'/>"></script>
	  <script src="<c:url value='/js/epiceditor/js/epiceditor.js'/>"></script>
	  <script src="<c:url value='/js/main.js'/>"></script>
</body>
</html>	