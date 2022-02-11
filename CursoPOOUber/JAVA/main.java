import java.sql.Driver;

class Main{
     
    public static void main(String[] args) {
        System.out.println("Hola Nieves desde Java");
        UberX uberx= new UberX("AMQ123",new Account("Gabriel Martinez", "AND123"), "Chevrolet", "Sonic");
        uberx.setPassenger(4);
        uberx.printDataCar();

        UberVan uberVan= new UberVan("JIM0124", new Account("Mia", "34rgs"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}