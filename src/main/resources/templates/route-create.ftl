<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title> Create the route </title>

    <h1> Creation </h1>


    <div>
        <fieldset>
            <legend> Add Route</legend>
            <form anem="route" action="" method="POST">
                Name:<@spring.formInput "form.name" "" "text"/>
                <br>
                Distance:<@spring.formInput "form.distance" "" "text"/>
                <br>
                Days in route:<@spring.formInput "form.daysInRoute" "" "text"/>
                <br>
                Payment:<@spring.formInput "form.payment" "" "text"/>
                <br>
                <input type="submit" value="Create"/>
            </form>
        </fieldset>
    </div>
    <br>
    <br>
    <td> <a href="/"> <input type="button" class="btn btn-success" value="Main"> </a> </td>
</head>
<body>

</body>
</html>