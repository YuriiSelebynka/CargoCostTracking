<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title> CCT New finished work </title>

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

        .table3 {
            font-size: 20px;
            color: #00008b;
        }

        .createButton {
            font-size: 40px;
            background: #4AE435;
            color: black;
            width: 7%;
            border-radius: 12pt;
        }

        .cancelButton {
            font-size: 40px;
            background: #FF0034;
            color: black;
            width: 7%;
            border-radius: 12pt;
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
            color: black;
        }

    </style>

</head>
<body style="text-align: center">

<div>

    <table width="99%" align="center" style="text-align: center" class="menu">

        <tr>
            <td><a href="/"> <input type="button"
                   class="table1" align="center" style="font-size:40pt"
                   value="main"> </a></td>
            <td><a href="/gui/chauffeur/all"> <input type="button"
                   class="table1" align="center" style="font-size:40pt"
                   value="chauffeurs"> </a></td>
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

<h1> Create new finished work </h1>


<div>
    <fieldset>
        <legend> Add Finished work </legend>
        <form anem="finishedwork" action="" method="POST" class="table3">
            Route:<br><@spring.formInput "form.route" "" "text"/>
            <br><br>
            Chauffeur:<br><@spring.formInput "form.chauffeur" "" "text"/>
            <br><br>
            CoChauffeur:<br><@spring.formInput "form.coChauffeur" "" "text"/>
            <br><br>
            Departure date<br>(use format YYYY-MM-DD HH:MM:SS):
            <br><@spring.formInput "form.inputDepartureDate" "" "text"/>
            <br><br>
            Return date<br>(use format YYYY-MM-DD HH:MM:SS):
            <br><@spring.formInput "form.inputReturnDate" "" "text"/>
            <br><br>
            <input type="submit" value="create" class="createButton"/>
            <a href="/gui/finishedwork/all"> <input type="button"
               value="cancel" class="cancelButton"></a>
        </form>
    </fieldset>
</div>
<br>
<br>

<div>

    <table class="table2"  width="90%" align="center"
           style="text-align: center" border="2px solid #00008b">

        <tr >
            <th>Route ID</th>
            <th>Route Name</th>
        </tr>

        <#list routes as route>
            <tr>
                <td>${route.id}</td>
                <td>${route.name}</td>
            </tr>
        </#list>

    </table>

    <table class="table2"  width="90%" align="center"
           style="text-align: center" border="2px solid #00008b">

        <tr >
            <th>Chauffeur ID</th>
            <th>Chauffeur Surname</th>
            <th>Chauffeur Firstname</th>
        </tr >

        <#list chauffeurs as chauffeur>
            <tr >
                <td>${chauffeur.id}</td>
                <td>${chauffeur.surname}</td>
                <td>${chauffeur.firstname}</td>
            </tr>
        </#list>

    </table>

</div>

<br>
<br>

<div class="footer"> ?? Copyright 2021 Yurii Selebynka (1996)
    <br> All rights reserved <br> Details - in info section</div>

</body>
</html>