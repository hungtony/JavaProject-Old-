<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <title>測試</title>
</head>
<body>
<form action="loginServlet" method="post">
    帳號：<input type="text" id="qqq" name="account">
    密碼：<input type="password" name="password">
    <input type="submit" value="送出" >
    <input type="hidden" value="test" name="status">
</form>
<input type ="button" value="送出" onclick="test()">
</body>
<script>
    function test(){
        var account = $("#qqq").val();
        var password = $("input[name='password']").val();
        $.ajax({
            method: "POST",
            url: "loginServlet",
            data: { account: account,
                password: password,
                status:'test'}
        })
            .done(function( msg ) {
                alert( "Data Saved: " + msg );
            });
    }
</script>
</html>