<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>shopping malls</title>
</head>

<body>
	<jsp:include page="./includes/joinheader.jsp" />
	
	<div class="container"	style="padding-top: 100px;">
	<div class="jumbotron" >
		<form action="./userJoinAction.jsp" method="post" name="userInfo" class="form-signin" style="text-align: center;">
			<h2 class="form-signin-heading">회원가입</h2>
		
			<label class="sr-only">Id</label> 
			<input type="text" name="userID" class="form-control" maxlength="20" placeholder="ID"> 
		
			<label class="sr-only">Password</label> 
			<input type="password" name="userPassword" class="form-control" maxlength="20" placeholder="Password">
			
			<label class="sr-only">Name</label> 
			<input type="text" name="userName" class="form-control" maxlength="20" placeholder="Name">
			
			<label class="sr-only">Gender</label> 
			<input type="text" name="userGender" class="form-control" maxlength="20" placeholder="Gender">
			
			<label class="sr-only">Email</label> 
			<input type="text" name="userEmail" class="form-control" maxlength="20" placeholder="Email">
		
			
			<input class="btn btn-lg btn-primary btn-block" type="submit" value="회원가입">
		</form>
	</div>
	</div>
	
	
	<jsp:include page="./includes/footer.jsp" />
</body>
</html>