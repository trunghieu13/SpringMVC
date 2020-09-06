<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/31/2020
  Time: 9:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
<h1>HELOOOO</h1>
<a href="hi">secondpage</a> <br/>

<a href="testpathvariable/1/Hieu" >TestPathVariable</a>


<fieldset>
    <legend>name&id</legend>
    <form:form method="get" action="testrequestparam">
        Id: <input type="number" name="id" /> <br />
        Name: <input type="text" name="name" /> <br />
        <input type="submit" value="submit" />
    </form:form>
</fieldset>

<fieldset>
    <legend>name</legend>
    <form:form method="get" action="redirect">
        Name: <input type="text" name="name" /> <br />
        <input type="submit" value="Redirect" />
    </form:form>
</fieldset>





</body>
</html>
