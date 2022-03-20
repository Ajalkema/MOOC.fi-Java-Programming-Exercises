import java.util.*;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<>());
        storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String unit) {
        return storage.getOrDefault(unit, new ArrayList<>());
    }

    public void remove(String unit, String item){
        if (storage.get(unit).size() <= 1) storage.remove(unit);
        else storage.get(unit).remove(item);
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> returnedList = new ArrayList<>();
        for (String key : storage.keySet()) {
            if (storage.get(key).size() > 0) returnedList.add(key);
        }
        return returnedList;
    }
}
