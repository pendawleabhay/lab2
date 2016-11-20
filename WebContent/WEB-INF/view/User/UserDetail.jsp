<html>
	<head>
		<title>User Details</title>
	</head>
	
	<form action="/lab2/user/userId" >
	   User ID <input type="text" name="userId" value=${user.userId} readonly/><br /> <br /> 
	   firstname <input type="text" name="firstname" value=${user.firstname} /><br /> <br /> 
	   lastname <input type="text" name="lastname" value=${user.lastname} /><br /> <br /> 
	   title <input type="text" name="title" value=${user.title} /><br /> <br /> 
	   street <input type="text" name="street" value=${user.address.street} /><br /><br />  
	   city <input type="text" name="city" value=${user.address.city} /><br /> <br /> 
	   state <input type="text" name="state" value=${user.address.state} /><br /> <br /> 
	   zip <input type="text" name="zip" value=${user.address.zip} /><br /> <br /> 
		<input type="submit" value="Update" />
	</form>
</html>