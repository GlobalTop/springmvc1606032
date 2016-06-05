<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/6/5
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../common/bootstrap/css/bootstrap.min.css">
    <script src="<%=path%>/common/jquery/jquery.min.js"></script>
    <script src="<%=path%>/common/bootstrap/js/bootstrap.min.js"></script>
    <script src="<%=path%>/common/angular/angular.min.js"></script>
    <link href="/blog/images/favicon.ico" mce_href="/blog/images/favicon.ico" rel="bookmark" type="image/x-icon" />
    <link href="/blog/images/favicon.ico" mce_href="/blog/images/favicon.ico" rel="icon" type="image/x-icon" />
    <link href="/blog/images/favicon.ico" mce_href="/blog/images/favicon.ico" rel="shortcut icon" type="image/x-icon" />
    <title>首页</title>
</head>
<body>

<div class="alert-danger" ng-app="myApp" ng-controller="myCtrl">

    <p>选择网站:</p>

    <select ng-model="selectedSite">
        <option ng-repeat="x in sites" value="{{x.url}}">{{x.site}}</option>
    </select>

    <h1>你选择的是: {{selectedSite}}</h1>

</div>

<script>
    var app = angular.module('myApp', []);
    app.controller('myCtrl', function($scope) {
        $scope.sites = [
            {site : "Google", url : "http://www.google.com"},
            {site : "Runoob", url : "http://www.runoob.com"},
            {site : "Taobao", url : "http://www.taobao.com"}
        ];
    });
</script>

<p>该实例演示了使用 ng-repeat 指令来创建下拉列表，选中的值是一个字符串。</p>
</body>
</html>
