<!DOCTYPE html>
<html>

<head>
    <title>PHP Page7</title>
</head>

<body>
    
    <?php
       class C1
       {
           private $a1;
           private $a2;
           private $a3;

           function __construct($a1,$a2,$a3)
           {
               $this->a1=$a1;
               $this->a2=$a2;
               $this->a3=$a3;
           }

           function show()
           {
            echo $this->a1."<br/>";
            echo $this->a2."<br/>";
            echo $this->a3."<br/>";
           }
       }     

    //    inheritance uses "extends" keyword
       $var1 = new C1(12,32,4);
       $var1->show();
            

    ?>

</body>

</html>