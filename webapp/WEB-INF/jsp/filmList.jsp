<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/commons/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>

<title>Insert title here</title>

</head>
<body>
	
	<table>
		<thead></thead>
			<tr>
				<th>film_id</th>
				<th>title</th>
				<th>description</th>
				<th>language</th>
				<th>操作</th>
			</tr>
		<tbody>
			<c:forEach var="fl" items="${filmList}">
             <tr>
                 <td>${fl.film_id}</td>
                 <td>${fl.title}</td>
                 <td>${fl.description}</td>
                 <td>${fl.language.name}</td>
                 <td><a href="${ctp}/film/${fl.film_id}/delete">删除</a></td>
             </tr>
           </c:forEach>
		</tbody>
	</table>
</body>
</html>