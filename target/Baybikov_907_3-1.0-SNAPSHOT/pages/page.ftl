<!DOCTYPE html>
<html  lang="en">
<#include "base.ftl">
<#macro title>All users</#macro>
<#macro content>
<head>
    <title>All Users</title>
</head>
<body>
<table>
    <tr>
        <th>FirstName</th> <th>LastName</th>
    </tr>
    <#if users??>
        <#list users as user>
            <tr>
                <td>${user.login}</td>
                <td>${user.name}</td>
                <td>${user.lastName}</td>
            </tr>
        </#list>
    </#if>
</table>
</#macro>
</body>
</html>