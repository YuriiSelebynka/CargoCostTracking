<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title> Create the finished work </title>

    <h1> Creation </h1>


    <div>
        <fieldset>
            <legend> Add Finished work </legend>
            <form anem="finishedwork" action="" method="POST">
                Route:<@spring.formInput "form.route" "" "text"/>
                <br>
                Chauffeur:<@spring.formInput "form.chauffeur" "" "text"/>
                <br>
                CoChauffeur:<@spring.formInput "form.coChauffeur" "" "text"/>
                <br>
<#--                Departure date:<@spring.formInput "form.departureDate.now" "" "text"/>-->
<#--                <br>-->
<#--                Return date:<@spring.formInput "form.returnDate.now" "" "text"/>-->
<#--                <br>-->
<#--                Fee:<@spring.formInput "form.fee" "" "text"/>-->
<#--                <br>-->

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