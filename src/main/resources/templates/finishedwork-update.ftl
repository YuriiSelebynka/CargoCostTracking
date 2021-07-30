<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Finished work </title>
</head>
<body>

<h1> Updating </h1>

<div>
    <fieldset>
        <legend> Update finished work </legend>
        <form anem="finishedwork" action="" method="POST">
<#--            id:<@spring.formInput "form.id" "" "text"/>-->
<#--            <br>-->
            Route:<@spring.formInput "form.route" "" "text"/>
            <br>
            Chauffeur:<@spring.formInput "form.chauffeur" "" "text"/>
            <br>
            CoChauffeur:<@spring.formInput "form.coChauffeur" "" "text"/>
            <br>
            Departure date:<@spring.formInput "form.departureDate" "" "text"/>
            <br>
            Return date:<@spring.formInput "form.returnDate" "" "text"/>
            <br>
<#--            Return date:<input type="date"  name="returnDate"/>-->
<#--            <br>-->
<#--            Fee:<@spring.formInput "form.fee" "" "text"/>-->
<#--            <br>-->
            <input type="submit" value="Update"/>
        </form>
    </fieldset>
</div>

<br>
<br>
<td> <a href="/"> <input type="button" class="btn btn-success" value="Main"> </a> </td>

</body>
</html>