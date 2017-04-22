<%--
  Created by IntelliJ IDEA.
  User: xzx
  Date: 17/4/22
  Time: 下午8:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传测试</title>
</head>
<body>
     <form action="/file/upload" method="post" enctype="multipart/form-data">

         <input type="file" id="fileName" name="tableName"/>
         <input type="text" id="tableName" name="tableName"/>
         <input type="submit" value="提交">
     </form>
</body>
</html>
