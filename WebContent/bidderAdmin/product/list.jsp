<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/Style1.css"
	rel="stylesheet" type="text/css" />
<script language="javascript"
	src="${pageContext.request.contextPath}/js/public.js"></script>
<script type="text/javascript">
			function addProduct(){
				window.location.href = "${pageContext.request.contextPath}/bid.jsp";
			}
			
			function delProduct(pid){
				var isDel = confirm("您确认要删除吗？");
				if(isDel){
					//要删除
					location.href = "${pageContext.request.contextPath}/adminDelProduct?pid="+pid;
				}
			}
			
		</script>
</HEAD>
<body>
	<br>
	<form id="Form1" name="Form1" action="${pageContext.request.contextPath}/bidder?method=searchWindow" method="post">
		&nbsp;&nbsp;&nbsp;&nbsp; floor: <select id = "wfloor" name = "wfloor">
			<option value="">--- ---</option>
			<option value="G">G floor</option>
			<option value="1">1 floor</option>
			<option value="2">2 floor</option>
			<option value="3">3 floor</option>
			<option value="4">4 floor</option>
			<option value="5">5 floor</option>
		</select>&nbsp;&nbsp;
		is_finished：<select id="isFinished" name="isFinished">
			<option value="">--   --</option>
			<option value="0">no</option>
			<option value="1">yes</option>
		</select>&nbsp;&nbsp;
		From：<input type="text" id="wdate" name="wdateFrom">&nbsp;&nbsp;
		To:<input type="text" id="wdate" name="wdateTo">&nbsp;&nbsp;
		<input type="submit" value="search">
	</form>

		<table cellSpacing="1" cellPadding="0" width="100%" align="center"
			bgColor="#f5fafe" border="0">
			<TBODY>
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3"><strong>Material List</strong>
					</TD>
 				</tr>
				<tr>
					<td class="ta_01" align="right">
							<button type="button" id="add" name="add" value="bid" class="button_add" onclick="addProduct()">
								BID
							</button>
					</td>
				</tr> 
				<tr>
					<td class="ta_01" align="center" bgColor="#f5fafe">
						<table cellspacing="0" cellpadding="1" rules="all"
							bordercolor="gray" border="1" id="DataGrid1"
							style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
							<tr
								style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">
								
								<td align="center" width="8%">ID</td>
								<td align="center" width="8%">Floor</td>
								<td align="center" width="12%">Image</td>
								<td align="center" width="8%">Length</td>
								<td align="center" width="8%">Height</td>
								<td width="7%" align="center">Price</td>
								<td width="7%" align="center">Deadline</td>
								<td width="7%" align="center">State</td>
								<td width="20%" align="center">Description</td>
							</tr>
							
							<c:forEach items="${windowList }" var="win" varStatus="vs">
								
									<tr onmouseover="this.style.backgroundColor = 'white'"
										onmouseout="this.style.backgroundColor = '#F5FAFE';">
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="8%">${vs.count }</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="8%">${win.wfloor }</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="12%">
											<a href="${pageContext.request.contextPath }/windowInfo?wid=${win.wid } ">
											<img width="40" height="45" src="${pageContext.request.contextPath }/${win.wimage }">
											</a>
										</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="8%">${win.wlength }</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="8%">${win.wheight }</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="7%">${win.wprice }</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="7%">${win.wdeadline }</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="7%">${win.wstate==1?"yes":"no" }</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="20%">${win.wdesc }</td>
									</tr>
								
							</c:forEach>
							
							
						</table>
					</td>
				</tr>

			</TBODY>
		</table>
	</form>
</body>
</HTML>

