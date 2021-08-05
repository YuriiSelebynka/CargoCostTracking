<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title> CCT Table of Chauffeurs </title>

    <style>

        body {
            background: no-repeat #cae2f7;
            background-size: 100%;
            color: #00008b;
        }

        .table1 {
            background: #00008b;
            color: #cae2f7;
            width: 100%;
            border-radius: 5pt;
        }

        .table2 {
            font-size: 20px;
            color: #00008b;
            width: 90%;
            border-radius: 5px;
            border-collapse: collapse;
        }

        .createButton {
            font-size: 40px;
            background: #4AE435;
            color: black;
            width: 90%;
            border-radius: 12pt;
        }

        .updateButton {
            font-size: 20px;
            background: #FFFF00;
            color: black;
            width: 75%;
            border-radius: 5pt;
        }

        .deleteButton {
            font-size: 20px;
            background: #FF0000;
            color: black;
            width: 75%;
            border-radius: 5pt;
        }

        .menu {
            position: fixed;
            top: 0;
            margin: 0em;
            min-height: 0em;
            border-radius: 5px;
        }
        .footer {

            bottom: 0;
            right: 0;
            color: black;

        }

    </style>

</head>
<body style="text-align: center">
<div>

    <table width="99%" align="center" style="text-align: center" class="menu">

        <tr >
            <td><a href="/"> <input type="button"
                   class="table1" align="center" style="font-size:40pt"
                   value="main"> </a></td>
            <td><a href="/gui/route/all"> <input type="button"
                   class="table1" align="center" style="font-size:40pt"
                   value="routes"> </a></td>
            <td><a href="/gui/finishedwork/all"> <input type="button"
                   class="table1" align="center" style="font-size:40pt"
                   value="finished work"> </a></td>
            <td><a href="/info.html"> <input type="button"
                   class="table1" align="center" style="font-size:40pt"
                   value="info"> </a></td>
        </tr></table>

</div>

<br>
<br>
<br>

<h1 style="font-size:60pt">  Table of chauffeurs </h1>

<div>

    <td><a href="/gui/chauffeur/create" > <input type="button"
           class="createButton" value="Create"></a></td>

    <br>
    <br>

    <table class="table2"  width="90%" align="center"
           style="text-align: center" border="2px solid #00008b">
        <tr>
            <th>ID</th>
            <th>Surname</th>
            <th>Firstname</th>
            <th>Patronymic</th>
            <th>Experience</th>
            <th>Edit</th>
            <th>Delete</th>

        </tr>

        <#list chauffeurs as chauffeur>
            <tr>
                <td>${chauffeur.id}</td>
                <td>${chauffeur.surname}</td>
                <td>${chauffeur.firstname}</td>
                <td>${chauffeur.patronymic}</td>
                <td>${chauffeur.experience}</td>
                <td> <a href="/gui/chauffeur/update/${chauffeur.id}">
                        <input type="button" class="updateButton"
                               value="Edit"> </a></td>
                <td> <a href="/gui/chauffeur/delete/${chauffeur.id}">
                        <input type="button" class="deleteButton"
                               value="Del"> </a></td>
            </tr>
        </#list>

    </table>

</div>

<br>
<br>

<div class="footer"> © Copyright 2021 Yurii Selebynka (1996)
    <br> All rights reserved <br> Details - in info section</div>

</body>
</html>