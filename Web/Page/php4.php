<!DOCTYPE html>
<html>

<head>
    <title>PHP Page4</title>
</head>

<body>
    <form action="php4.php" name="form1" method="POST">
        <input type="checkbox" name="chk_fruits[]" value="Apple" />Apple<br/>
        <input type="checkbox" name="chk_fruits[]" value="Grapes" />Grapes<br/>
        <input type="checkbox" name="chk_fruits[]" value="Mango" />Mango<br/>
        <input type="submit" />
    </form>
    <?php
        $f1=$_POST["chk_fruits"];
        echo $f1[0];    
        echo "<br/><br/><br/><br/><br/><br/>";

        $abc=array("a1"=>"This is a1","a2"=>"This is a2");
        echo $abc["a1"];

    ?>

</body>

</html>