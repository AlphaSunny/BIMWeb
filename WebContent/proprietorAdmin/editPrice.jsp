<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  -->
	<form id="userAction_save_do" name="Form1" action="${pageContext.request.contextPath}/proprietorEditPrice" method="post">
		
		<input type="hidden" name="wid" value="${wid}">
		
		<table cellSpacing="1" cellPadding="5" width="100%" align="center" bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
					
				</td>
				<td class="ta_01" bgColor="#ffffff" colspan="3">
					<textarea name="wprice" rows="5" cols="50"></textarea>
				</td>
			</tr>
			<tr>
				<td class="ta_01" style="WIDTH: 100%" align="center"
					bgColor="#f5fafe" colSpan="4">
					<button type="submit" id="userAction_save_do_submit" value="submit" class="button_ok">
						submit
					</button>

					<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
					<button type="reset" value="reset" class="button_cancel">
						reset
					</button>

					<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
					<INPUT class="button_ok" type="button" onclick="history.go(-1)" value="return"/>
					<span id="Label1"></span>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>