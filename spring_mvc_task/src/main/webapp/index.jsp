<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
.containerform
{
 width:1080px;

}

</style>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h2 style="color:green" align="center">Welcome to MyShop</h2>

<div >

</div>
 <div class="containerform"> 
 <div class="reqpform">
 <h3 align="center">Select item</h3>
 
<form action="itemsubmit" >
	<table align="center">
	 <tr>
	   <td>Enter item name</td>
	   <td><input type="text" name="item"></td>	   
	 </tr>
	<tr>
	   <td>enter price</td>
	   <td><input type="price" name="price"></td>	   
	 </tr>
	 <tr>
	 <td>Enter qty</td>
	 <td><input type="qty" name="qty"></td>
	 </tr>
	 <tr>
	 <td>Enter Discount</td>
	 <td><input type="disc" name="disc"></td>
	 </tr>
	 <tr>	    
	   <td colspan="2"><input type="submit" value="submit"></td>	   
	 </tr>
	</table>


</form>
</div>
</body>
</html>