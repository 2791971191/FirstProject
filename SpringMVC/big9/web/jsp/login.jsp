<%--
  Created by IntelliJ IDEA.
  User: 27919
  Date: 2020/12/17
  Time: 15:09:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
   <form method="post" action="login">
       <table>
           <tr><td>账户：</td>
               <td><input type="text" name="accountName"></td>
           </tr>
           <tr><td>密码：</td>
               <td><input type="password" name="accountPassword"></td>
           </tr>
           <tr>
               <td><input type="reset" value="重置"></td>
           </tr>
           <tr>
               <td><input type="submit" value="提交"></td>
           </tr>

       </table>
   </form>
</body>
</html>
