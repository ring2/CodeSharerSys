<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="assets/js/jquery.min.js"></script>   
</head>
<body style="margin:auto;width:200px">

	<h3>意见反馈</h3>
	<form   action="insComment" method="post"><br/>
	
	<textarea name = "content" style="width:200px; height:100px;"></textarea><br/>
			<input id="submit" type="submit" value="提交">
	</form>
	<script type="text/javascript">
	$("#submit").click(function(){
		alert("提交成功");
	});
	</script>
</body>
</html>