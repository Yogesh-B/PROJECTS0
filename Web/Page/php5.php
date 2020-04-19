<!DOCTYPE html>
<html>

<head>
    <title>PHP Page5</title>
</head>

<body>
    <form action="php5.php" name="form1" method="POST">
        Name : <input type="text" name="txt_name" /><br/>
        <input type="submit" />
    </form>
    <?php
        $name1=$_POST["txt_name"];

        function hi($name)
        {
            echo "Hi, ".$name;
        }
        hi($name1);
         
        echo "<br/><br/><br/><br/>";
        echo "$var1 <br/> $var2 <br/> $var3";

    ?>

</body>

</html>