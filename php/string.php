<?php

$test = '  Hello there "John"> ';
$test = trim($test);
$test = htmlentities($test);
echo '<h3>'.$test.'</h3>';

function sanitize($str){
	$str = trim($str);
	$str = htmlentities($str, ENT_QUOTES);
	return $str;
}

$title = " harry potter & the dragon";
$id = "xw-324";

$parts = explode('-', $id);
echo '<p>Title: '.ucwords(sanitize($title)).'</p>';
echo '<p>ID: '.$parts[0].'#'.$parts[1].'</p>';

if(ctype_alpha($parts[0]) && ctype_digit($parts[1])){
	echo '<p>The ID is valid!</p>';
}

function times($number){
	return $number * 10;
}

function make_heading($string, $number){
	if($number > 0 && $number < 7){
		$string = trim($string);
		if($number == 1 || $number == 2){
			$string = ucwords($string);
		}
		else{
			$string = ucfirst($string);
		}
		
		$header = "<h$number>$string</h$number>";
		return $header;
	}
	else
		return $string;
}

echo make_heading('test heading', 6);

?>
