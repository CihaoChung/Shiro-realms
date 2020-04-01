<html>
<body>
<h2>login page</h2>

<form action="shiro/login" method="post">
    username:<input type="text" name="username">
    <br><br>
    password:<input type="password" name="password">
    <br><br>
    <input type="submit" value="submit">
    type
    <select id="realmType" name="realmType">
        <option value ="admin">admin</option>
        <option value ="user">user</option>
    </select>
</form>
</body>
</html>
