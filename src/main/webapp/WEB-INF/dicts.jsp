<%--
  Created by IntelliJ IDEA.
  User: tomas
  Date: 2019-01-30
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
    pageEncoding="UTF-8" %>
<%@ page taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
                      "http://www.3c.org/TR/html4/loose.dtd">

<html>
<head>
    <c:set var ="path" value=" ${pageContext.request.contextPath}"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>字典信息</title>
    <script src="${path}/static/query-3.1.1.min.js"></script>
</head>
<body>
<table>
    <tr>
        <th colspan="4">字典管理</th>
    </tr>
    <tr>类别名</tr>
    <tr>字典名</tr>
    <tr>字典值</tr>
    <tr>操作[<a href="${path}/dicts/add">新增</a> ]
    </tr>
    <c:forEach items="${dicts} var="dict">
       <tr id= "dict-${dict.id}">
    <td>${dict.code}</td>
       <td>${dict.name}</td>
       <td>${dict.value}</td>
       <td>
           [<a href="${path}/dicts/add?id=${dict.id}">编辑</a>]
           [<a href="javascript:;"
               onclick="deleteById(${dict.id},'${dict.name}')">删除</a>]
       </td>
       </tr>
    </c:forEach>
</table>

<script>
    function deleteById(id,label) {
        var r = confirm('确定要删除"'+)

    }
</script>

</body>
</html>
