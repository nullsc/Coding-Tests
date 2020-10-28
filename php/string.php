<?php
//test
$test = '  Hello there "John" ';
$test = trim($test);
$test = htmlentities($test);
echo '<h3>'.$test.'</h3>';

function sanitize($str){
	$str = trim($str);
	$str = htmlentities($str, ENT_QUOTES);
	return $str;
}
$title = " harry potter & the dragon";
$id = "xw-324"; //2 chars - digits

$parts = explode('-', $id);
echo '<p>Title: '.ucwords(sanitize($title)).'</p>';
echo '<p>ID: '.$parts[0].'#'.$parts[1].'</p>';

if(ctype_alpha($parts[0]) && ctype_digit($parts[1])){
	echo '<p>The ID is valid!</p>';
}
?>
