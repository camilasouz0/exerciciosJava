<?php

define('SERVER', '10.1.11.152');
define('BANCO', 'dbtwitter');
define('SENHA', 'coyote');
define('USER', 'root');

try {
 
$con = new pdo('mysql:host=' . SERVER . ';dbname=' . BANCO, USER, SENHA);
    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    echo "conexao ok";
} catch(PDOException $e) {
    echo 'ERROR: ' . $e->getMessage();
}

?>