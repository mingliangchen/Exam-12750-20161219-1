<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/commons/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
</script>
</head>
<body>
<form action="${ctp}/film/insert" method="get">
	title:<input type="text" name="title">
	description:<input type="text" name="description">
	language:<select id="language" name="language">
				<c:forEach items="${lans}" var="lan">
					<option  value="${lan.name}">${lan.name}</option>
				</c:forEach>
			 </select>
	<input type="submit" value="insert">
</form>
</body>
</html>