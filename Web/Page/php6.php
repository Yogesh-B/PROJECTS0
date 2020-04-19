<!DOCTYPE html>
<html>

<head>
    <title>PHP Page6</title>
</head>
<!-- if else is same as other languages -->
<!-- while loops are same as other language -->
<!-- for loop same as other language you need not declare var before using in loop -->
<!-- cooments are same as js -->
<body>
    <form action="php6.php" name="form1" method="POST">
        Enter Grade (A, B, C): <input type="text" name="txt_grade" /><br />
        <input type="submit" />
    </form>
    <?php
    $grade1 = $_POST["txt_grade"];

    switch ($grade1) {
        case "A+":
            echo "First class with distiction....";
            break;
        case "A":
            echo "First class...";
            break;
        case "B+":
            echo "Passed with high score...";
            break;
        case "B":
            echo "Passed with good score...";
            break;
        case "C":
            echo "Passed .....";
            break;
        case "D":
            echo "Passed with difficulty....";
            break;
        case "F":
            echo "Failed...!!!";
            break;
        default:
            echo "Invalid Input_Grade...!!!";
            break;
    }
    echo "<br/> for loop example <br/>";
    $arr = array(1,3,4,2,5);
    for($i=0;$i<count($arr);$i++)
    {
        echo $arr[$i]."<br/>";
    }

    include "page1.html";
    $var1=123;
    $var2=234;
    $var3=345;
    include "php5.php";
    ?>

</body>

</html>