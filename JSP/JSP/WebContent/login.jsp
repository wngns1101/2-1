<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>shopping malls</title>
</head>

<body>
	<jsp:include page="./includes/loginheader.jsp" />
	
	<div class="container"	style="padding-top: 100px;">
	<div class="jumbotron" >
		<form action="./userLoginAction.jsp" method="post" name="userInfo" class="form-signin" style="text-align: center;">
			<h2 class="form-signin-heading">로그인</h2>
		
			<label class="sr-only">Email address</label> 
			<input type="text" id="inputEmail" class="form-control" name = "id" maxlength="20" placeholder="Email address"> 
		
			<label class="sr-only">Password</label> 
			<input type="password" id="inputPassword" class="form-control" name = "pass" maxlength="20" placeholder="Password">
		
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me">Remember me</label>
			</div>
			<input class="btn btn-lg btn-primary btn-block" type="submit" value="로그인">
		</form>
	</div>
	</div>
	
	
	<jsp:include page="./includes/footer.jsp" />
</body>
</html>