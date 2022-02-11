<?php
    class Account{
        private $id;
        public $name;
        public $document;
        private $email;
        private $password;

        public function __construct($name, $document){
            $this->name=$name;
            $this->document=$document;
        }
    }
?>