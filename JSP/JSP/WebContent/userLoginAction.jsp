<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.DatabaseUtil" %>
<%@ page import="user.User" %>
<%@ page import="user.UserDAO" %>
<%@ page import="java.io.PrintWriter"%>
<%
	//사용자가 보낸 데이터를 한글을 사용할 수 있는 형식으로 변환
	request.setCharacterEncoding("UTF-8");
	
	String userID = null;
	String userPassword = null;
	

	if (request.getParameter("id") != null) {
		userID = (String) request.getParameter("id");
	}

	if (request.getParameter("pass") != null) {
		userPassword = (String) request.getParameter("pass");
	}
		
	if (userID == null || userPassword == null) {
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('입력이 안 된 사항이 있습니다.')");
		script.println("</script>");
		script.close();
		return;
	}

	UserDAO userDAO = new UserDAO();
	int result = userDAO.login(userID, userPassword);
	if (result == 1) {
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('로그인에 성공했습니다.')");
		script.println("location.href='index.jsp';");
		script.println("</script>");
		script.close();
		return;
	} else if(result == 0) {
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('비밀번호가 틀립니다.')");
		script.println("history.back();");
		script.println("</script>");
		script.close();
		return;
	} else if(result == -1) {
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('존재하지 않는 아이디입니다.')");
		script.println("history.back();");
		script.println("</script>");
		script.close();
		return;
	} else if(result == -2) {
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('데이터베이스 오류입니다.')");
		script.println("history.back();");
		script.println("</script>");
		script.close();
		return;
	}
%>
