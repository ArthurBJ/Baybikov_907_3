<!DOCTYPE html>
<html  lang="en">
<#include "base.ftl">
<#macro title>Exception details</#macro>
<#macro content>
    <h2> Exception details</h2>
    <strong> Status code:</strong>${statusCode}
    <strong> Request uri:</strong>${uri}
    <#if message??><strong> Message:</strong>${message} </#if> <br>
</#macro>
</html>