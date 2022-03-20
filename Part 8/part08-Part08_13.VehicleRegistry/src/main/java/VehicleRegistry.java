import java.util.*;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleRegister;

    public VehicleRegistry() {
        this.vehicleRegister = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (vehicleRegister.containsKey(licensePlate)) return false;
        vehicleRegister.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return vehicleRegister.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (vehicleRegister.containsKey(licensePlate)) {
            vehicleRegister.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate lp : vehicleRegister.keySet()) {
            System.out.println(lp);
        }
    }

    public void printOwners() {
        ArrayList<String> printedOwners = new ArrayList<>();
        for (String owner : vehicleRegister.values()) {
            if (!printedOwners.contains(owner)) {
                System.out.println(owner);
                printedOwners.add(owner);
            }
        }
    }
}
