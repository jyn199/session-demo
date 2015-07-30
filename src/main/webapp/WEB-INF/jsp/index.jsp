<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>INDEX</title>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
</head>
<body>
	<h2>INDEX</h2>
	<%
		Cookie cookie = new Cookie("cookiename","cookievalue");
	    cookie.setDomain(".");
		response.addCookie(cookie);
	    Cookie[] cookies = request.getCookies();
	    //out.println(cookies[1].getName() + "===" + cookies[1].getValue());
		session = request.getSession(false);
		//session.setAttribute("test", "test");
		out.println(session.getId());
		//out.println(session.getAttribute("test"));
		out.println("<br/>");
		//if (session != null)
		//	session.invalidate();
		out.println(session.getId());
		//java.lang.IllegalStateException
		//out.println(session.getAttribute("test"));
	%>
	<form action="login" method="post">
		用户名： <input type="text" name="uName" />
		<input type="submit" value="上线" />
	</form>
</body>
</html>