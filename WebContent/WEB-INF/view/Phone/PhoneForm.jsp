<html>
<script>
document.getElementById("adduser").onclick = function() {
    var form = document.getElementById("myForm");
    var input = document.createElement("input");
    input.type = "text";
    var br = document.createElement("br");
    form.appendChild(input);
    form.appendChild(br);
}
</script>
<body>
	<h1>Create Phone</h1>
 
	<form action="/lab2/phone/phoneId" >
	   number <input type="text" name="number" /><br /> <br /> 
	   description <input type="text" name="description" /><br /> <br /> 
	   street <input type="text" name="street" /><br /><br />  
	   city <input type="text" name="city" /><br /> <br /> 
	   state <input type="text" name="state" /><br /> <br /> 
	   zip <input type="text" name="zip" /><br /> <br /> 
	   user <input type="text" name="users[]" /><br /> <br /> 
		<input type="submit" value="Create" />
	</form>
	
</body>
</html>