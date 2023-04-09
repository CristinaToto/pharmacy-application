import java.util.HashMap;
import java.util.List;


public class Brand {

    public static final String NONSTOP = "nonstop";
    public static final String ONLINE = "online";
    public static final String HYBRID = "hybrid";

    private List<Pharmacy> pharmacyList;

    public void setPharmacyList(List<Pharmacy> pharmacyList) {
        this.pharmacyList = pharmacyList;
    }

    public void displayTotalNumberOfEmployees() {
        int totalNrOfEmployees = this.pharmacyList.stream().mapToInt(element -> element.getNumberOfEmployee()).sum();
        System.out.println("\u001B[34mThe total number of employees\u001B[0m: " + totalNrOfEmployees);
    }

    public void showTheMedicineAfterCity(String city) {
        HashMap<String, Integer> map = new HashMap<>();
        for (Pharmacy pharmacy : pharmacyList) {
            if (pharmacy.getCity().equalsIgnoreCase(city)) {
                for (Medicine medicine : pharmacy.getMedicineStock()) {
                    String medicineName = medicine.getMedicineName();
                    int medicineQuantity = medicine.getQuantity();
                    int newQuantity = map.getOrDefault(medicineName, 0) + medicineQuantity;
                    map.put(medicineName, newQuantity);
                }
            }
        }
        System.out.println(map);
    }

    public void acceptsCardPayment() {
        this.pharmacyList.stream()
                .filter(element -> element.getCardPayment())
                .forEach(element -> System.out.println(element.getPharmacyName() + " " + element.getCity()));
    }

    public void displayNonStopPharmacies() {
        this.pharmacyList.stream().
                filter(element -> element.getSchedule().equalsIgnoreCase(NONSTOP))
                .forEach(element -> System.out.println(element.getPharmacyName() + " - " + element.getCity()));
    }

    public void showEmailAndPhone() {
        for (Pharmacy element : this.pharmacyList) {
            if (element.getPharmacyType().equalsIgnoreCase(ONLINE) || element.getPharmacyType().equalsIgnoreCase(HYBRID)) {
                System.out.println(element.getEmail() + "\n" + element.getPhoneNumber());
            } else {
                System.out.println("There are no such type of pharmacies.");
            }
        }
    }
}


