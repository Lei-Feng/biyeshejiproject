<%@page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap 101 Template</title>
    <link href="/bootstrap/css/bootstrap.css" rel="stylesheet">
</head>
<body>

    <!--图表组件容器 -->
    <div id="main" style="width: 800px;height:600px;"></div>

    <script src="/jquery/jquery-2.1.1.min.js"></script>
    <script src="/bootstrap/js/bootstrap.js"></script>
    <script src="/jquery/echarts.min.js"></script>
    <script>

        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));



        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
</body>
</html>