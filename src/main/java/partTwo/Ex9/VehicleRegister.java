import java.util.*;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner){
        if(owners.get(plate) == null){
            owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate){
        if(owners.get(plate) != null){
            return owners.get(plate);
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate){
        if(owners.get(plate) != null){
            owners.put(plate, null);
            return true;
        }
        return false;
    }
    public void printRegistrationPlates(){
        for (RegistrationPlate p: owners.keySet()) {
            System.out.println(p);
        }
    }

    public void printOwners(){
        ArrayList<String> val = new ArrayList<String>();
        for (String s: owners.values()) {
            if(!val.contains(s)){
                val.add(s);
            }
        }
        for (String s: val) {
            System.out.println(s);
        }
    }
}
