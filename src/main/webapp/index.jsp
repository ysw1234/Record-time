<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/21 0021
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="js/jquery-1.12.2.min.js"></script>
<body>
<form method="post" onsubmit="return false">
    用户名：<input type="text" name="username" id="username"/>
    密码：<input type="password" name="password" id="password" />
    电话：<input type="text" name="phone" id="phone"/>
    邮箱：<input type="text" name="email" id="email"/>
    <input type="button" id="d1" value="注册"/>
</form>
<script type="text/javascript">
    $("#d1").click(function () {
        $.ajax({
            type:"post",
            url:"user/register.do",
            data:$("form").serialize(),
            dataType:"json",
            success:function (data) {
                if(data.code==1){
                    alert(data.info);
                }else{
                    alert(data.info)
                }
            }
        })
    })
</script>
</body>
</html>
