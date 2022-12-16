<%--
  Created by IntelliJ IDEA.
  User: hectorperez
  Date: 12/16/22
  Time: 12:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="pizza-order" method="POST">
    <!-- Crust -->
    <label for="crust">Choose a Crust:</label>
    <select name="crust" id="crust">
        <option value="regular">Regular</option>
        <option value="thin">Thin</option>
        <option value="thick">Thick</option>
        <option value="stuffed">Stuffed</option>
    </select>

    <!-- Sauce -->
    <label for="sauce">Choose a Sauce:</label>
    <select name="sauce" id="sauce">
        <option value="marinara">Marinara</option>
        <option value="pesto">Pesto</option>
        <option value="garlic-ranch">Garlic-ranch</option>
        <option value="white-garlic">White-garlic</option>
    </select>

    <!-- Size -->
    <label for="size">Choose a Size:</label>
    <select name="size" id="size">
        <option value="personal">Personal</option>
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>

    <!-- Toppings -->
    <input type="checkbox" id="pepperoni" name="checkbox" value="pepperoni">
    <label for="pepperoni">Pepperoni</label><br>
    <input type="checkbox" id="sausage" name="checkbox" value="sausage">
    <label for="sausage">Sausage</label><br>
    <input type="checkbox" id="Mushrooms" name="checkbox" value="Mushrooms">
    <label for="Mushrooms">Mushrooms</label><br>

    <!-- Address -->
    <label for="address">Address:</label><br>
    <input type="text" id="address" name="address"><br>
</form>

</body>
</html>
