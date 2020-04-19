<!DOCTYPE html>
<html>

<head>
    <title>PHP Page2</title>
</head>

<body>
    <form action="php2.php" name="form1" method="POST">
        Name : <input type="text" name="txt_name" placeholder="Enter value...." /><br />
        <input type="submit" name="btn_submit" />
    </form>
    <?php
       echo $_POST["txt_name"];

    ?>
</body>

</html>