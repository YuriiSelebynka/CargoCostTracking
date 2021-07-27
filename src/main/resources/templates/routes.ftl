<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Routes</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<h1> Table of routes </h1>
<div style="width: 80%">
    <table class="table table-success table-striped">

        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Distance</th>
            <th> Days in route </th>
            <th> Payment </th>
            <th>Delete</th>
            <th>Edit</th>
            <#--        <th>Create</th>-->
        </tr>

        <#list routes as route>
            <tr>
                <td>${route.id}</td>
                <td>${route.name}</td>
                <td>${route.distance}</td>
                <td>${route.daysInRoute}</td>
                <td>${route.payment}</td>
                <td> <a href="/gui/route/delete/${route.id}"> <input type="button" class="btn btn-danger" value="Del"> </a> </td>
                <td> <a href="/gui/route/update/${route.id}"> <input type="button" class="btn btn-dark" value="Edit"> </a> </td>

            </tr>
        </#list>

    </table>

</div>

<td> <a href="/gui/route/create"> <input type="button" class="btn btn-success" value="Create"> </a> </td>

<br>
<br>
<td> <a href="/"> <input type="button" class="btn btn-success" value="Main"> </a> </td>

</body>
</html>