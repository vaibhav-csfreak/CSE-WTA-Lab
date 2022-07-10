<!DOCTYPE html>
<html lang="en">
<head>
<title>Form 3</title>
<style>
table,th,td{
border: 1px solid black;
}
th,td{
padding: 10px;
}
</style>
</head>
<body>
<form action="<?php echo htmlspecialchars($_SERVER['PHP_SELF']);?>" method="POST">
<h1>Search Employee form</h1> 
<label>Employee Number:</label>
<input type="text" name="number" size="10" placeholder="Enter Number"><br><br>
<input type="submit" name="save" value="Submit">
<input type="reset" name="reset" value='Reset'>
</form>
</body>
</html>
<?php
$host="localhost";
$username="root";
$password="";
$dbname="sample";
$conn = new mysqli($host,$username,$password,$dbname, 3306);
if($conn->connect_error){
die("connection failed" .$conn->connect_error);
}
else{
if(isset($_POST["save"])){
$number=$_POST["number"];
$sql="SELECT * FROM employee WHERE `ID`=$number";
$result = $conn->query($sql);
if($result->num_rows > 0){
$row=$result->fetch_assoc();
echo "<br><br><table><tr><th>Employee Number</th><td>".$row['ID'].
"</td></tr><tr><th>Employee Name</th><td>".$row['Name']. "</td></tr><tr><th>Employee
Salary</th><td>".$row['Salary']. "</td></tr></table>";
}else{
echo "Error : Employee number is invalid";
}
$conn->close();
}
}
?>