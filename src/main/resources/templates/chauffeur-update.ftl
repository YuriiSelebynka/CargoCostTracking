<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Chauffeur</title>

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

        .table3 {
            font-size: 20px;
            color: #00008b;
        }

        .createButton {
            font-size: 40px;
            background: #4AE435;
            color: black;
            width: 12%;
            border-radius: 12pt;
        }

        .cancelButton {
            font-size: 40px;
            background: #FF0034;
            color: black;
            width: 12%;
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

<h1> Update the chauffeur data </h1>

<div>
    <fieldset>
        <legend> Update chauffeur</legend>
        <form anem="chauffeur" action="" method="POST" class="table3">
            id:<br><@spring.formInput "form.id" "" "text"/>
            <br><br>
            Surname:<br><@spring.formInput "form.surname" "" "text"/>
            <br><br>
            Firstname:<br><@spring.formInput "form.firstname" "" "text"/>
            <br><br>
            Patronymic:<br><@spring.formInput "form.patronymic" "" "text"/>
            <br><br>
            Experience (in years):<br>
            <@spring.formInput "form.experience" "" "text"/>
            <br><br>
            <input type="submit" value="Update" class="createButton"/>
            <a href="/gui/chauffeur/all"> <input type="button"
               value="cancel" class="cancelButton"> </a>
        </form>
    </fieldset>
</div>

<br>
<br>

<div class="footer"> © Copyright 2021 Yurii Selebynka (1996)
    <br> All rights reserved <br> Details - in info section</div>

</body>
</html>