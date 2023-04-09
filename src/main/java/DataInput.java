import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataInput {
    public static void main(String[] args) {
        Medicine tm1 = new Medicine("Paracetamol", 10.60, 1, 60,
                "Pfizer", false, "2022-08-06", "100");
        Medicine bm1 = new Medicine("Paracetamol", 11.70, 1, 40,
                "Pfizer", true, "2022-08-06", "100");
        Medicine bm2 = new Medicine("Paracetamol", 11.00, 1, 50,
                "Pfizer", true, "2022-08-06", "100");

        Medicine tm2 = new Medicine("Algocalmin", 12.52, 1, 50,
                "Moderna", false, "2023-08-16", "50");
        Medicine bm3 = new Medicine("Algocalmin", 13.72, 1, 20,
                "Moderna", true, "2023-08-16", "50");
        Medicine bm4 = new Medicine("Algocalmin", 15.72, 1, 30,
                "Moderna", false, "2023-08-16", "50");

        Medicine tm3 = new Medicine("Eurespal Sirop", 22.88, 2, 30,
                "Moderna", true, "2024-05-28", "50");
        Medicine bm5 = new Medicine("Eurespal Sirop", 22.88, 2, 30,
                "Moderna", true, "2024-05-28", "50");
        Medicine bm6 = new Medicine("Eurespal Sirop", 23.21, 2, 50,
                "Moderna", true, "2024-05-28", "50");

        Medicine tm4 = new Medicine("Stodal Sirop", 20.68, 2, 60,
                "AstraZeneca", false, "2024-07-23", "0");
        Medicine bm7 = new Medicine("Stodal Sirop", 24.65, 2, 35,
                "AstraZeneca", false, "2024-07-23", "0");
        Medicine bm8 = new Medicine("Stodal Sirop", 21.50, 2, 45,
                "AstraZeneca", false, "2024-07-23", "0");

        Medicine tm5 = new Medicine("Ketorol", 15.68, 3, 60,
                "Moderna", false, "2024-08-11", "50");
        Medicine bm9 = new Medicine("Ketorol", 17.68, 3, 45,
                "Moderna", false, "2024-08-11", "50");
        Medicine bm10 = new Medicine("Ketorol", 17.44, 3, 40,
                "Moderna", false, "2024-08-11", "50");

        Medicine tm6 = new Medicine("Ketonal", 26.88, 3, 40,
                "AstraZeneca", true, "2024-12-12", "0");
        Medicine bm11 = new Medicine("Ketonal", 29.68, 3, 50,
                "AstraZeneca", true, "2024-12-12", "0");
        Medicine bm12 = new Medicine("Ketonal", 31.55, 3, 20,
                "AstraZeneca", true, "2024-12-12", "0");


        Pharmacy pharmacy1 = new Pharmacy("Catena");
        System.out.println(pharmacy1.getPharmacyName());
        pharmacy1.setCity("Timisoara");
        System.out.println(pharmacy1.getCity());
        pharmacy1.setNumberOfEmployee(8);
        System.out.println("Pharmacy has " + pharmacy1.getNumberOfEmployee() + " employees.");
        pharmacy1.setCasContract(true);
        System.out.println("\nCAS contract : " + pharmacy1.hasCasContract());
        pharmacy1.setCardPayment(true);
        System.out.println("Card payment : " + pharmacy1.getCardPayment());
        pharmacy1.setSchedule("1");
        System.out.println("Schedule     : " + pharmacy1.getSchedule());
        pharmacy1.setPharmacyType("online");
        System.out.println("Pharmacy type: " + pharmacy1.getPharmacyType());
        pharmacy1.setDiscountWithPurchasingCard(true);
        System.out.println("Discount card: " + pharmacy1.getDiscountWithPurchasingCard());
        pharmacy1.setPhoneNumber("0738184674");
        System.out.println(pharmacy1.getPhoneNumber());
        pharmacy1.setEmailAddress("catena@timisoara.com");
        System.out.println(pharmacy1.getEmail());

        Set<Medicine> setPharmacy1 = new HashSet<>();
        setPharmacy1.add(tm1);
        setPharmacy1.add(tm2);
        setPharmacy1.add(tm3);
        pharmacy1.setMedicineStock(setPharmacy1);

        System.out.println("\n\u001B[34mMedicine stock for Catena Timisoara \u001B[0m\n " + pharmacy1.getMedicineStock());

        List<Medicine> listPharmacy1 = new ArrayList<>();

        listPharmacy1.add(tm4);
        listPharmacy1.add(tm5);
        listPharmacy1.add(tm6);
        listPharmacy1.add(tm1);

        pharmacy1.addMedicine(listPharmacy1);

        System.out.println("\n\u001B[34mMedicine stock after adding medicines --> \u001B[0m");
        System.out.println(" " + pharmacy1.getMedicineStock());

        System.out.println("-----------------------------------------------------------------------------------------");
        Pharmacy pharmacy2 = new Pharmacy("Catena");
        System.out.println(pharmacy2.getPharmacyName());
        pharmacy2.setCity("Bucuresti");
        System.out.println(pharmacy2.getCity());
        pharmacy2.setNumberOfEmployee(6);
        System.out.println("Pharmacy has " + pharmacy2.getNumberOfEmployee() + " employees.");
        pharmacy2.setCasContract(true);
        System.out.println("\nCAS contract : " + pharmacy2.hasCasContract());
        pharmacy2.setCardPayment(true);
        System.out.println("Card payment : " + pharmacy2.getCardPayment());
        pharmacy2.setSchedule("2");
        System.out.println("Schedule     : " + pharmacy2.getSchedule());
        pharmacy2.setPharmacyType("hybrid");
        System.out.println("Pharmacy type: " + pharmacy2.getPharmacyType());
        pharmacy2.setDiscountWithPurchasingCard(false);
        System.out.println("Discount card: " + pharmacy2.getDiscountWithPurchasingCard());
        pharmacy2.setPhoneNumber("0758173469");
        System.out.println(pharmacy2.getPhoneNumber());
        pharmacy2.setEmailAddress("catena@bucuresti.com");
        System.out.println(pharmacy2.getEmail());

        Set<Medicine> setPharmacy2 = new HashSet<>();
        setPharmacy2.add(bm1);
        setPharmacy2.add(bm3);
        setPharmacy2.add(bm5);
        setPharmacy2.add(bm7);

        pharmacy2.setMedicineStock(setPharmacy2);
        System.out.println("\n\u001B[34mMedicine stock for Catena Bucuresti \u001B[0m\n " + pharmacy2.getMedicineStock());
        List<Medicine> listPharmacy2 = new ArrayList<>();
        listPharmacy2.add(bm7);
        listPharmacy2.add(bm9);
        listPharmacy2.add(bm11);

        System.out.println("\n\u001B[34mMedicine stock after adding medicines --> \u001B[0m");
        pharmacy2.addMedicine(listPharmacy2);
        System.out.println(" " + pharmacy2.getMedicineStock());


        System.out.println("------------------");
        Pharmacy pharmacy3 = new Pharmacy("Dona");
        System.out.println(pharmacy3.getPharmacyName());
        pharmacy3.setCity("Bucuresti");
        System.out.println(pharmacy3.getCity());
        pharmacy3.setNumberOfEmployee(5);
        System.out.println("Pharmacy has " + pharmacy3.getNumberOfEmployee() + " employees.");
        pharmacy3.setCasContract(false);
        System.out.println("\nCAS contract : " + pharmacy3.hasCasContract());
        pharmacy3.setCardPayment(true);
        System.out.println("Card payment : " + pharmacy3.getCardPayment());
        pharmacy3.setSchedule("1");
        System.out.println("Schedule     : " + pharmacy3.getSchedule());
        pharmacy3.setPharmacyType("online");
        System.out.println("Pharmacy type: " + pharmacy3.getPharmacyType());
        pharmacy3.setDiscountWithPurchasingCard(true);
        System.out.println("Discount card: " + pharmacy3.getDiscountWithPurchasingCard());
        pharmacy3.setPhoneNumber("0748203464");
        System.out.println(pharmacy3.getPhoneNumber());
        pharmacy3.setEmailAddress("dona@bucuresti.com");
        System.out.println(pharmacy3.getEmail());
        Set<Medicine> setPharmacy3 = new HashSet<>();
        setPharmacy3.add(bm2);
        setPharmacy3.add(bm6);
        setPharmacy3.add(bm8);
        pharmacy3.setMedicineStock(setPharmacy3);
        System.out.println("\n\u001B[34mMedicine stock for Dona Bucuresti\u001B[0m\n " + pharmacy3.getMedicineStock());

        List<Medicine> listPharmacy3 = new ArrayList<>();
        listPharmacy3.add(bm2);
        listPharmacy3.add(bm4);
        listPharmacy3.add(bm10);
        listPharmacy3.add(bm12);

        System.out.println("\n\u001B[34mMedicine stock after adding medicines --> \u001B[0m");
        pharmacy3.addMedicine(listPharmacy3);
        System.out.println(" " + pharmacy3.getMedicineStock());


        System.out.println("------------------");
        Medicine orderMedicine = new Medicine("Algocalmin", 100);
        Medicine orderMedicine1 = new Medicine("Paracetamol", 1);
        Medicine orderMedicine2 = new Medicine("Ketonal", 3);
        Medicine orderMedicine3 = new Medicine("Eurespal Sirop", 10);
        Medicine orderMedicine4 = new Medicine("Ketorol", 50);
        Medicine orderMedicine5 = new Medicine("Stodal Sirop", 14);

        List<Medicine> order = new ArrayList<>();
        order.add(orderMedicine);
        order.add(orderMedicine1);
        order.add(orderMedicine2);
        System.out.println("\u001B[34mOrder Pharmacy1 --> \u001B[0m");
        pharmacy1.placeOrder(order, true);

        System.out.println("------------------");
        List<Medicine> order1 = new ArrayList<>();
        order1.add(orderMedicine4);
        order1.add(orderMedicine3);
        order1.add(orderMedicine5);
        System.out.println("\u001B[34mOrder Pharmacy2 --> \u001B[0m");
        pharmacy2.placeOrder(order1, false);

        System.out.println("------------------");
        System.out.println("\u001B[34mThe medicine stock for " + pharmacy1.getPharmacyName() + " from "
                + pharmacy1.getCity() + " is\u001B[0m: " + pharmacy1.totalStockOfMedicine());
        System.out.println("\u001B[34mThe medicine stock for " + pharmacy2.getPharmacyName() + " from "
                + pharmacy2.getCity() + " is\u001B[0m: " + pharmacy2.totalStockOfMedicine());
        System.out.println("\u001B[34mThe medicine stock for " + pharmacy3.getPharmacyName() + "   from "
                + pharmacy3.getCity() + " is\u001B[0m: " + pharmacy3.totalStockOfMedicine());

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("\u001B[34mExpired medicines --->\u001B[0m");
        pharmacy1.removeMedicineIsExpired();
        pharmacy2.removeMedicineIsExpired();
        pharmacy3.removeMedicineIsExpired();

        System.out.println("-----------------------------------------------------------------------------------------");
        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(pharmacy1);
        pharmacyList.add(pharmacy2);
        pharmacyList.add(pharmacy3);

        Brand pharmacyBrand = new Brand();
        pharmacyBrand.setPharmacyList(pharmacyList);
        System.out.println("\u001B[34mThe list of pharmacies\nthat accept card payment:\u001B[0m");
        pharmacyBrand.acceptsCardPayment();

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("\u001B[34mSettlement - Decontare\u001B[0m");
        pharmacy1.categorizeMedicineBySettlementType(setPharmacy1);
        pharmacy2.categorizeMedicineBySettlementType(setPharmacy2);
        pharmacy3.categorizeMedicineBySettlementType(setPharmacy3);

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("\u001B[34mNon stop pharmacies: \u001B[0m");
        pharmacyBrand.displayNonStopPharmacies();

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("\u001B[34mEmail and phone number \u001B[0m");
        pharmacyBrand.showEmailAndPhone();

        System.out.println("----------------------------------------------------------------------------------------");
        pharmacyBrand.displayTotalNumberOfEmployees();

        System.out.println("----------------------------------------------------------------------------------------");
        pharmacy1.searchMedicine("NoSpa");
        pharmacy1.searchMedicine("Paracetamol");
        pharmacy1.searchMedicine("Algocalmin");

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("\u001B[34mProduction companies: \u001B[0m");
        pharmacy1.showProductionCompany();

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("\u001B[34mShow medicine after unit type : \u001B[0m");
        pharmacy1.showMedicineAfterUnitType(1);
        pharmacy2.showMedicineAfterUnitType(2);
        pharmacy3.showMedicineAfterUnitType(3);

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("\u001B[34mTotal stock of medicines in the same city : \u001B[0m");
        pharmacyBrand.showTheMedicineAfterCity("Bucuresti");

    }


}
