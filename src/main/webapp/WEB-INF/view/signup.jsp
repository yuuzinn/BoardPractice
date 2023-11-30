<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
</head>
<body>

<h2>회원가입 양식</h2>

<form action="/signup" method="post">
    <label for="username">아이디:</label>
    <input type="text" id="username" name="userId" required>

    <br>

    <label for="password">비밀번호:</label>
    <input type="password" id="password" name="password" required>

    <br>

    <label for="nickname">닉네임:</label>
    <input type="text" id="nickname" name="nickname" required>

    <input type="submit" value="가입하기">
</form>

</body>
</html>
