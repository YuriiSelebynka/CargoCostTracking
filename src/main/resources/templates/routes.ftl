<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CCT Table of Routes</title>
    <style>
        body {
            /*background: #c7b39b ;*/
            background: no-repeat #cae2f7;
            background-size: 100%; /* Цвет фона и путь к файлу */
            color: #00008b; /* Цвет текста */
        }
        .b1 {
            background: #00008b; /*  цвет фона */
            color: #cae2f7; /*  буквы */
            width: 100%;
            border-radius: 5pt;

        }

        .b2 {
            font-size: 20px;
            color: #00008b; /*  буквы */
            width: 90%;
            border-radius: 5px;

            /*position: center;*/
            border-collapse: collapse;



        }

        .b3 {
            font-size: 40px;
            background: #4AE435;
            color: black;
            width: 90%;
            border-radius: 12pt;
        }

        .b4 {
            font-size: 20px;
            background: #FFFF00;
            color: black;
            width: 75%;
            border-radius: 5pt;
        }

        .b5 {
            font-size: 20px;
            background: #FF0000;
            color: black;
            width: 75%;
            border-radius: 5pt;
        }

        .sticky {
            position: fixed;
            top: 0;
            margin: 0em;
            min-height: 0em;
            border-radius: 5px;

        }
        .footer {
            /*position: absolute;*/
            bottom: 0;
            right: 0;
            color: black;
        }






    </style>

</head>
<body style="text-align: center" >

<div >


    <table width="100%" align="center" style="text-align: center" class="sticky" >

        <tr >
            <td><a  href="/"> <input type="button" class="b1" align="center" style="font-size:40pt" value="main"> </a></td>
            <td><a href="/gui/chauffeur/all"> <input type="button" class="b1" align="center" style="font-size:40pt" value="chauffeurs"> </a></td>
            <td><a href="/gui/finishedwork/all"> <input type="button" class="b1" align="center" style="font-size:40pt" value="finished work"> </a></td>
            <td><a href="/gui/finishedwork/all"> <input type="button" class="b1" align="center" style="font-size:40pt" value="about"> </a></td>

        </tr></table>



</div>

<br>
<br>
<br>

<h1 style="font-size:60pt"> Table of routes </h1>
<div  >
    <td> <a href="/gui/route/create"> <input type="button" class="b3" value="Create"> </a> </td>
    <br>
    <br>

    <table class="b2"  width="90%" align="center" style="text-align: center" border="2px solid #00008b" >



        <tr >
            <th>ID</th>
            <th>Name</th>
            <th>Distance</th>
            <th> Days in route </th>
            <th> Payment </th>
            <th>Edit</th>
            <th>Delete</th>

        </tr>

        <#list routes as route>
        <tr>
            <td>${route.id}</td>
            <td>${route.name}</td>
            <td>${route.distance}</td>
            <td>${route.daysInRoute}</td>
            <td>${route.payment}</td>
            <td > <a href="/gui/route/update/${route.id}"> <input type="button" align="center" class="b4" value="Edit"> </a> </td>
            <td > <a href="/gui/route/delete/${route.id}"> <input type="button" align="center" class="b5" value="Del"> </a> </td>

        </tr>
        </#list>

    </table>

</div>


<br>
<#--<img src="{% static '1.jpg' %}" alt="My image">-->

<#--<img src="resources/templates/media/1.jpg" alt="..." />-->
<#--url ("media/1.jpg")-->

<#--<img src= "1.jpg" />-->

<#--<img src=${'media/1.jpg'} alt=${"..."} />-->
<#--<img src=${'1.jpg'} alt=${"..."} />-->
<#--<img src=${'templates/media/1.jpg'} alt=${"..."} />-->
<#--<img src=${'templates/1.jpg'} alt=${"..."} />-->
<#--<img src=${'resources/templates/1.jpg'} alt=${"..."} />-->
<#--<img src='templates/1.jpg' alt="...">-->

<br>
<br>

<div class="footer"> © Copyright Yurii Selebynka 2021 <br> All rights reserved <br> Details - in about section</div>
</body>
</html>