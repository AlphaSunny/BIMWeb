<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>the Info of the Window</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet" href="css/style.css" type="text/css" />

<style>
body {
	margin-top: 20px;
	margin: 0 auto;
}

.carousel-inner .item img {
	width: 100%;
	height: 300px;
}
</style>
</head>

<body>
	<!-- 引入header.jsp -->

	<div class="container">
		<div class="row">
			<div
				style="border: 1px solid #e4e4e4; width: 930px; margin-bottom: 10px; margin: 0 auto; padding: 10px; margin-bottom: 10px;">
				<a href="./index.html">First Page&nbsp;&nbsp;&gt;</a> <a href="${pageContext.request.contextPath}/builderAdminWindowList">Builder&nbsp;&nbsp;&gt;</a>
				<a>Window</a>
			</div>

			<div style="margin: 0 auto; width: 950px;">
				<div class="col-md-6">
					<img style="opacity: 1; width: 400px; height: 350px;" title=""
						class="medium"
						src="${pageContext.request.contextPath }/${window.wimage}">
				</div>

				<div class="col-md-6">
					<div>
						<strong>Window</strong>
					</div>
					<div
						style="border-bottom: 1px dotted #dddddd; width: 350px; margin: 10px 0 10px 0;">
						<div>ID：${window.wid}</div>
					</div>

					<div style="margin: 10px 0 10px 0;">
						Price: <strong style="color: #ef0101;">$：${window.wprice}</strong> 
					</div>

					<div style="margin: 10px 0 10px 0;">
						DeadLine: <a target="_blank" 
							style="background-color: #f07373;">${window.wdeadline }</a>
					</div>

					<div>
						<a href="${pageContext.request.contextPath}/builderAdminWindowList">Return to the list</a>
					</div>
				</div>
			</div>
			<div class="clear"></div>
			<div style="width: 950px; margin: 0 auto;">
				<div
					style="background-color: #d3d3d3; width: 930px; padding: 10px 10px; margin: 10px 0 10px 0;">
					<strong>The image of the window</strong>
				</div>

				<div>
					<img
						src="${pageContext.request.contextPath }/${window.wimage}">
				</div>

				<div
					style="background-color: #d3d3d3; width: 930px; padding: 10px 10px; margin: 10px 0 10px 0;">
					<strong>The parameters of the window</strong>
				</div>
				<div style="margin-top: 10px; width: 900px;">
					<table class="table table-bordered">
						<tbody>
							<tr class="active">
								<th colspan="2">Basic Parameter</th>
							</tr>
							<tr>
								<th width="10%">Level</th>
								<td width="30%">Normal</td>
							</tr>
							<tr>
								<th width="10%">Floor</th>
								<td>${window.wfloor }</td>
							</tr>
							<tr>
								<th width="10%">Width</th>
								<td>${window.wlength }</td>
							</tr>
							<tr>
								<th width="10%">height</th>
								<td>${window.wheight }</td>
							</tr>
						</tbody>
					</table>
				</div>

				<div style="background-color: #d3d3d3; width: 900px;">
					<table class="table table-bordered">
						<tbody>
							<tr class="active">
								<th><strong>The comment of the window</strong></th>
							</tr>
							<tr class="warning">
								<th>${window.wdesc }</th>
							</tr>
						</tbody>
					</table>
				</div>

			</div>

		</div>
	</div>


</body>

</html>