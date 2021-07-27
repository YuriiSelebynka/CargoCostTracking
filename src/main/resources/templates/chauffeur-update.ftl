<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Chauffeur</title>
</head>
<body>

<h1> Updating </h1>

<div>
    <fieldset>
        <legend> Update chauffeur</legend>
        <form anem="chauffeur" action="" method="POST">
<#--            id:<@spring.formInput "form.id" "" "text"/>-->
<#--            <br>-->
            Surname:<@spring.formInput "form.surname" "" "text"/>
            <br>
            Firstname:<@spring.formInput "form.firstname" "" "text"/>
            <br>
            Patronymic:<@spring.formInput "form.patronymic" "" "text"/>
            <br>
            Experience:<@spring.formInput "form.experience" "" "text"/>
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