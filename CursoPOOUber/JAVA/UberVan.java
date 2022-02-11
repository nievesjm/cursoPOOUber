import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car{
    Map<String, Map<String, Integer>> typeCardAccepted;
    ArrayList<String> seatMaterial;
    String model;
    private Integer passenger;

    public UberVan(String license, Account driver, String brand, String model, Map<String, Map<String, Integer>> typeCardAccepted, ArrayList<String> seatMaterial){
        super(license, driver);
        this.typeCardAccepted= typeCardAccepted;
        this.seatMaterial= seatMaterial;
        this.model=model;

    }

    public UberVan(String license, Account driver){
        super(license, driver);

    }
    @Override
    public void setPassenger(Integer passenger) {
        // TODO Auto-generated method stub
        if(passenger==6){
            this.passenger=passenger;
        }else{
            System.out.println("Necesitas 6 pasajeros");
        }
    }
}