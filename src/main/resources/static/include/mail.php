<?php

$name = $_POST['name'];
$email = $_POST['email'];
$phone = $_POST['phone'];
$revenue = $_POST['revenue'];
$message = $_POST['message'];


$content = 'Naam: '. $name . ' Email: ' . $email . ' Phone: ' . $phone . ' Revenue: ' . $revenue . ' Message: ' . $message;

$subject = 'Nieuwe aanvraag';
$to = 'tom.sluizeman@minbzk.nl';
$from = $email;

$headers   = array();
$headers[] = "MIME-Version: 1.0";
$headers[] = "Content-type: text/plain; charset=iso-8859-1";
$headers[] = "From: Noorderzon <{$from}>";
$headers[] = "Reply-To: Noorderzon <{$from}>";
//$headers[] = "Subject: {$subject}";
$headers[] = "X-Mailer: PHP/".phpversion();

mail($to, $subject, $content, implode("\r\n", $headers), "-f".$from );

//header('Location: http://localhost:8888/src/main/resources/static/index.html);
?>