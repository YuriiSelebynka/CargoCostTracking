<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title> Finished Work </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>

<h1>  Table of finished work </h1>

<div style="width: 80%" >

    <table class="table table-success table-striped">
        <tr>
            <th>ID</th>
            <th>Route</th>
            <th>Chauffeur</th>
            <th>CoChauffeur</th>
            <th>Departure Date</th>
            <th>Return Date</th>
            <th>Fee</th>

            <th>Delete</th>
            <th>Edit</th>

        </tr>

        <#list finishedworks as finishedwork>
            <tr>
                <td>${finishedwork.id}</td>
                <td>${finishedwork.route.name}</td>
                <td>${finishedwork.chauffeur.getSurname()}</td>
                <td >${finishedwork.coChauffeur.getSurname() }</td>
<#--                <td>${finishedwork.coChauffeur.getSurname().compareToIgnoreCase(null)}</td>-->
<#--                <td #if finishedwork.chauffeur.getSurname() != null??>${finishedwork.coChauffeur.getSurname()}><#else>null</#if></td>-->

<#--                <td><#if finishedwork.chauffeur.getSurname(null)>null<#else>${finishedwork.coChauffeur.getSurname()}</#if></td>-->

<#--                <td  finishedwork.coChauffeur.surname!=null >${finishedwork.coChauffeur.surname }</td>-->
<#--                <td  finishedwork.coChauffeur.surname=null > $null </td>-->

<#--                <#if myOptionalVar??>when-present<#else>when-missing</#if>-->


<#--                <td>-->
<#--                    {}-->
<#--                    ${ % if finishedwork.coChauffeur.surname != null % finishedwork.coChauffeur.surname}-->
<#--                    {%if finishedwork.coChauffeur == null %} null-->
<#--                </td>-->



                <td>${finishedwork.departureDate}</td>
                <td>${finishedwork.returnDate}</td>
                <td>${finishedwork.fee}</td>

                <td>  <a href="/gui/finishedwork/delete/${finishedwork.id}" > <input type="button" class="btn btn-danger" value="Del">  </a>  </td>
                <td>  <a href="/gui/finishedwork/update/${finishedwork.id}" > <input type="button" class="btn btn-dark" value="Edit">  </a>  </td>

            </tr>
        </#list>

    </table>

</div>

<a href="/gui/finishedwork/create" > <input type="button" class="btn btn-success" value="Create"></a>

<br>
<br>
<td> <a href="/"> <input type="button" class="btn btn-success" value="Main"> </a> </td>

</body>
</html>