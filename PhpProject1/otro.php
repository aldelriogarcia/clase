<?php
session_start();
$username = $_REQUEST["user"];
$cant = $_REQUEST["cant"];
$min = $_REQUEST["min"];
$max = $_REQUEST["max"];

    if ($username=="") {
        $username= $_SESSION["username"];
    }
    else{
    $_SESSION["username"]=$username;
    }
    
    if ($cant=="") {
        $cant= $_SESSION["cant"];
    }
    else{
     $_SESSION["cant"]=$cant;
    }
    
    if ($max=="") {
        $max= $_SESSION["max"];
    }
    else{
     $_SESSION["max"]=$max;
    }
    
    if ($min=="") {
        $min= $_SESSION["min"];
    }
    else{
     $_SESSION["min"]=$min;
    }

print "$username " ;
for ($i = 0; $i < $cant; $i++) {
    echo "numero" . ($i). " " . rand($min, $max);
}
echo "<br>";
include "index.php";