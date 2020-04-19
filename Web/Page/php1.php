<html>
    <head><title>This is first PHP</title></head>
    <body>
        <?php
            $name="Yogesh";
            $number=-12.2;
            echo "Hello $name...!!!";
            $isMale=true;
            echo $isMale;
            echo " <br/><br/>  ".strtolower($name)." <br/>   ".strtoupper($name)." <br/> Length=    ".strlen($name);
            echo "<br/>2,3:".substr($name,2,3)."  &nbsp&nbsp   if not having second arg, then from 2 to end<br/>";
            echo "absolute value of ".$number." = ".abs($number); 
            echo "<br/>pow(2,3) = ".pow(2,3);
            echo "<br/>round($number) = ".round($number);
            echo "<br/>ceil($number) = ".ceil($number);
            echo "<br/>floor($number) = ".floor($number);





        ?>
    </body>
</html>