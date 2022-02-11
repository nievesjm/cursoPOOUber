import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car{
    Map<String, Map<String, Integer>> typeCardAccepted;
    ArrayList<String> seatMaterial;
    String model;

    public UberBlack(String license, Account driver, String brand, String model, Map<String, Map<String, Integer>> typeCardAccepted, ArrayList<String> seatMaterial){
        super(license, driver);
        this.typeCardAccepted= typeCardAccepted;
        this.seatMaterial= seatMaterial;
        this.model=model;

    }
}
