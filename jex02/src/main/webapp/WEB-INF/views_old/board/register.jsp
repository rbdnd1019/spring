<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2022. 4. 18.오전 9:40:21</title>
</head>
<body>
	<h1>Board Register Page</h1>
	<form method="post">
		<h4><label for="title">title</label></h4>
		<input name="title" id="title"> 

		<h4><label for="content">content</label></h4>
		<textarea rows="20" cols="40" name="content" id="content"></textarea>
		
		<h4><label for="writer">writer</label></h4>
		<input name="writer" id="writer"> 
		<hr>
		<button type="submit">작성</button>
		<button type="reset">취소</button>
	</form>
</body>
</html>