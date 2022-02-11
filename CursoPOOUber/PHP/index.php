<?php
    require_once('Car.php');
    require_once('UberX.php');
    require_once('UberVan.php');
    require_once('Account.php');

    
    //$nuevo= new Car("JIMN97", new Account("Nieves Mia", "Hi123"));
    //print_r ($nuevo);

    $uberX= new UberX("CVB12", new Account("Andres Herrera", "AND567"), "Chevrolet", "Spark");
    $uberX->setPassenger(4);
    $uberX->printDataCar();

    $uberVan= new UberVan("OJL342", new Account("Raul Mia", "RMR88"), "Nisaan", "Versa");
    $uberVan->setPassenger(6);
    $uberVan->printDataCar();
?>