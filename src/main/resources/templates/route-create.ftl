<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title> CCT New route </title>

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
            /*width: 90%;*/
            /*border-radius: 5px;*/
            /*border-collapse: collapse;*/
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
            position: absolute;
            bottom: 0;
            right: 0;
            color: black;
        }

    </style>



</head>
<body style="text-align: center">


<div>

    <table width="99%" align="center" style="text-align: center" class="menu" >

        <tr >
            <td><a  href="/"> <input type="button" class="table1" align="center" style="font-size:40pt" value="main"> </a></td>
            <td><a href="/gui/chauffeur/all"> <input type="button" class="table1" align="center" style="font-size:40pt" value="chauffeurs"> </a></td>
            <td><a href="/gui/finishedwork/all"> <input type="button" class="table1" align="center" style="font-size:40pt" value="finished work"> </a></td>
            <td><a href="/info.html"> <input type="button" class="table1" align="center" style="font-size:40pt" value="info"> </a></td>

        </tr></table>

</div>

<br>
<br>
<br>

<h1> Create the new route </h1>


<div>
    <fieldset>
        <legend> Add Route</legend>
        <form anem="route" action="" method="POST" class="table3">
            Name (enter point of departure and destination):
            <br><@spring.formInput "form.name" "" "text"/>
            <br><br>
            Distance (in km):
            <br><@spring.formInput "form.distance" "" "text"/>
            <br><br>
            Days in route:
            <br><@spring.formInput "form.daysInRoute" "" "text"/>
            <br><br>
            Payment (in euro):
            <br><@spring.formInput "form.payment" "" "text"/>
            <br><br>
            <input type="submit" value="create" class="createButton"/>
            <a href="/gui/routes/all"> <input type="button" value="cancel" class="cancelButton" > </a>
        </form>
    </fieldset>
</div>

<br>
<br>

<div class="footer"> © Copyright Yurii Selebynka 2021 <br> All rights reserved <br> Details - in about section</div>

</body>
</html>