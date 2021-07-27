<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title> Create the chauffeur </title>

    <h1> Creation </h1>


    <div>
        <fieldset>
            <legend> Add Chauffeur</legend>
            <form anem="chauffeur" action="" method="POST">
                Surname:<@spring.formInput "form.surname" "" "text"/>
                <br>
                Firstname:<@spring.formInput "form.firstname" "" "text"/>
                <br>
                Patronymic:<@spring.formInput "form.patronymic" "" "text"/>
                <br>
                Experience:<@spring.formInput "form.experience" "" "text"/>
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