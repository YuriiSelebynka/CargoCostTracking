<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title> CCT Update route</title>
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

        <tr >
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

<h1> Update the route data </h1>

<div>
    <fieldset>
        <legend> Update route</legend>
        <form anem="route" action="" method="POST" class="table3">
            id:<br><@spring.formInput "form.id" "" "text"/>
            <br><br>
            Name:<br><@spring.formInput "form.name" "" "text"/>
            <br><br>
            Distance:<br><@spring.formInput "form.distance" "" "text"/>
            <br><br>
            Days in route:<br><@spring.formInput "form.daysInRoute" "" "text"/>
            <br><br>
            Payment:<br><@spring.formInput "form.payment" "" "text"/>
            <br><br>
            <input type="submit" value="update" class="createButton"/>
            <a href="/gui/route/all"> <input type="button"
               value="cancel" class="cancelButton"></a>
        </form>
    </fieldset>
</div>

<br>
<br>

<div class="footer"> © Copyright 2021 Yurii Selebynka (1996)
    <br> All rights reserved <br> Details - in info section</div>

</body>
</html>