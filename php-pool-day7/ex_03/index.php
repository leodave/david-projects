<?php
session_start();
if(isset($_GET['name'])){
   $_SESSION['name']=$_GET['name'];
   echo "hello ". $_SESSION['name'];
}elseif(isset($_SESSION['name'])){
    echo  "hello " . $_SESSION['name'];


}
else {
    echo "hello platypus";
}
//session_destroy();