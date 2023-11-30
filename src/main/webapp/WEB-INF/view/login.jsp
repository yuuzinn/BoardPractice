<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
</head>
<body>

<h2>로그인 양식</h2>

<form action="/login" method="post">
    <label for="username">아이디:</label>
    <input type="text" id="username" name="userId" required>

    <br>

    <label for="password">비밀번호:</label>
    <input type="password" id="password" name="password" required>

    <input type="submit" value="로그인">
</form>

</body>
</html>
