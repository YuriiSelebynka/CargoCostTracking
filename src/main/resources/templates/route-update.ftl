<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update route</title>
</head>
<body>

<h1> Updating </h1>

<div>
    <fieldset>
        <legend> Update route</legend>
        <form anem="route" action="" method="POST">
            id:<@spring.formInput "form.id" "" "text"/>
            <br>
            Name:<@spring.formInput "form.name" "" "text"/>
            <br>
            Distance:<@spring.formInput "form.distance" "" "text"/>
            <br>
            Days in route:<@spring.formInput "form.daysInRoute" "" "text"/>
            <br>
            Payment:<@spring.formInput "form.payment" "" "text"/>
            <br>
            <input type="submit" value="Update"/>
        </form>
    </fieldset>
</div>

<br>
<br>
<td> <a href="/"> <input type="button" class="btn btn-success" value="Main"> </a> </td>

</body>
</html>