<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">

<title>session对象方法</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
 <link rel="stylesheet" type="text/css" href="styles.css">
 -->
</head>

<body>
	<b> <%
 	ArrayList showList = (ArrayList) (getServletContext()
 			.getAttribute("list"));
 	out.print("在线人数 " + showList.size() + "<br>");
 	for (int i = 0; i < showList.size(); i++) {
 		out.print(showList.get(i) + "在线" + "<br>");
 	}
 %>
	</b>
</body>
</html>