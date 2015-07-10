<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<style type="text/css">
#join{
	margin-left: 37%;
	margin-top: 3%;
}
#joinid{
	width: 35%;
	margin-bottom: 1%;
}
#joinname{
	width: 35%;
	margin-bottom: 1%;
}
#joinpass{
	width: 35%;
	margin-bottom: 1%;
}
#joinpassconfirm{
	width: 35%;
	margin-bottom: 1%;
}
#phone{
	width: 35%;
}
#joinsubmit{
 margin-left:28%;
}
</style>
</head>
<body>
<div id="join">
<img id="joinlogo" alt="회원가입로고" src="Image/joinlogo.jpg">
<br><br><br>
<form action="joinmember" method="post" enctype="multipart/form-data">
<input class="form-control" id="joinid" type="text" placeholder="아이디" maxlength="20" name="user_id"/>
<form:errors path="command.user_id" id="errors"/>
<input class="form-control" id="joinname" type="text" placeholder="이름" maxlength="20" name="user_name">
<form:errors path="command.user_name" id="errors"/>
<input class="form-control" id="joinpass" type="text" placeholder="비밀번호" maxlength="20" name="user_pass" >
<form:errors path="command.user_pass" id="errors"/>
<input class="form-control" id="joinpassconfirm" type="text" placeholder="비밀번호확인" maxlength="20" name="user_passconfirm">
<input class="form-control" type="text" id="phone" placeholder="전화번호" class="joinform" name="user_phone" />
<form:errors path="command.user_phone" id="errors"/>
<input type="file" name="uploadFile"  placeholder="사진을 올려주세요">
<br>
<input type="submit" class="btn btn-success" id="joinsubmit" value="가입하기">
</form>
</div>
</body>
</html>