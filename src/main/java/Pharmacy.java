import java.util.*;
import java.util.stream.Collectors;

public class Pharmacy {
    public static final String NON_STOP = "NonStop";
    public static final String MONDAY_TILL_FRIDAY = "Monday till Friday";
    public static final String EVERYDAY = "Everyday";
    public static final String THIS_OPTION_IS_NOT_VALID = "This option is not valid";


    private String pharmacyName;
    private int numberOfEmployee;
    private Set<Medicine> medicineStock;
    private String city;
    private boolean casContract;
    private boolean cardPayment;
    private String schedule;
    private String pharmacyType;
    private boolean discountWithPurchasingCard;
    private String phoneNumber;
    private String email;


    public Pharmacy(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }


    public void setMedicineStock(Set<Medicine> medicineStock) {
        this.medicineStock = medicineStock;
    }

    public Set<Medicine> getMedicineStock() {
        return medicineStock;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }


    public boolean hasCasContract() {
        return casContract;
    }

    public void setCasContract(boolean casContract) {
        this.casContract = casContract;
    }


    public boolean getCardPayment() {
        return cardPayment;
    }

    public void setCardPayment(boolean cardPayment) {
        this.cardPayment = cardPayment;
    }

    public String getSchedule() {
        return this.schedule;
    }

    public void getCity(String city) {
        this.city = city;
    }


    public void setSchedule(String option) {
        switch (option) {
            case "1" -> this.schedule = NON_STOP;
            case "2" -> this.schedule = MONDAY_TILL_FRIDAY;
            case "3" -> this.schedule = EVERYDAY;
            default -> System.out.println(THIS_OPTION_IS_NOT_VALID);
        }
    }

    public String getPharmacyType() {
        return pharmacyType;
    }

    public void setPharmacyType(String pharmacyType) {
        if (pharmacyType.equalsIgnoreCase("online")) {
            this.pharmacyType = pharmacyType;
        } else if (pharmacyType.equalsIgnoreCase("in-store")) {
            this.pharmacyType = pharmacyType;
        } else if (pharmacyType.equalsIgnoreCase("hybrid")) {
            this.pharmacyType = pharmacyType;
        } else {
            System.out.println(THIS_OPTION_IS_NOT_VALID);
        }
    }

    public boolean getDiscountWithPurchasingCard() {
        return discountWithPurchasingCard;
    }

    public void setDiscountWithPurchasingCard(boolean discountWithPurchasingCard) {
        this.discountWithPurchasingCard = discountWithPurchasingCard;
    }

    public String getPhoneNumber() {
        return String.format("Phone number : " + phoneNumber);
    }

    public void setPhoneNumber(String phoneNumber) {
        if (checkHasOnlyDigits(phoneNumber) && phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber.substring(0, 3)
                    + "-"
                    + phoneNumber.substring(3, 6)
                    + "-"
                    + phoneNumber.substring(6);
        } else {
            System.out.println(THIS_OPTION_IS_NOT_VALID);
        }
    }


    public String getEmail() {
        return String.format("Email address: " + email);
    }

    public void setEmailAddress(String emailAddress) {
        if (isValidEmail(emailAddress)) {
            this.email = emailAddress;
        } else {
            throw new IllegalArgumentException("Email format not valid");
        }
    }

    private boolean isValidEmail(String emailAddress) {
        String regex = "^[^@]+@[^@]+\\.(com|ro)$";
        return emailAddress.matches(regex);
    }

    public boolean checkHasOnlyDigits(String value) {
        return value.chars().allMatch(Character::isDigit);
    }

    public void placeOrder(List<Medicine> orderList, boolean discountWithPurchasingCard) {
        orderList.forEach(order -> {
            Optional<Medicine> medicineOpt = findMedicineByName(order.getMedicineName());
            if (medicineOpt.isPresent()) {
                Medicine medicine = medicineOpt.get();
                if (order.getQuantity() <= medicine.getQuantity()) {
                    fulfillOrder(order, medicine, discountWithPurchasingCard);
                } else {
                    printOutOfStockMessage(medicine);
                }
            }
        });
    }


    private void fulfillOrder(Medicine order, Medicine medicine, boolean discountWithPurchasingCard) {
        medicine.setQuantity(medicine.getQuantity() - order.getQuantity());
        if (discountWithPurchasingCard) {
            applyDiscount(medicine);
        }
        printFulfilledOrder(medicine);
    }

    private void applyDiscount(Medicine medicine) {
        medicine.setMedicinePrice(medicine.getMedicinePrice() * 0.9);
    }

    private void printFulfilledOrder(Medicine medicine) {
        System.out.println("  " + medicine);
    }

    private void printOutOfStockMessage(Medicine medicine) {
        System.out.println(medicine.getMedicineName() + " is out of stock");
    }


    public void addMedicine(List<Medicine> medicineList) {
        for (Medicine medicine : medicineList) {
            Optional<Medicine> existingMedicineOpt = findMedicineByName(medicine.getMedicineName());
            if (existingMedicineOpt.isPresent()) {
                Medicine existingMedicine = existingMedicineOpt.get();
                existingMedicine.setQuantity(existingMedicine.getQuantity() + medicine.getQuantity());
            } else {
                medicineStock.add(medicine);
            }
        }
    }

    private Optional<Medicine> findMedicineByName(String name) {
        return medicineStock.stream()
                .filter(medicine -> medicine.getMedicineName().equalsIgnoreCase(name))
                .findFirst();
    }

    public int totalStockOfMedicine() {
        return medicineStock.stream()
                .mapToInt(Medicine::getQuantity)
                .sum();
    }


    public void removeMedicineIsExpired() {
        List<Medicine> expiredMedicine = medicineStock.stream()
                .filter(medicine -> !medicine.verifyExpirationDate())
                .collect(Collectors.toList());
        medicineStock.removeAll(expiredMedicine);
        System.out.println(expiredMedicine);
    }

    public void categorizeMedicineBySettlementType(Set<Medicine> medicineStock) {
        Map<String, List<Medicine>> medicineBySettlementType = medicineStock.stream()
                .collect(Collectors.groupingBy(Medicine::getSettlementType));
        System.out.println("\n" + getPharmacyName() + "\n" + getCity());
        System.out.println("Medicine with settlement: \n " + medicineBySettlementType.getOrDefault("100", Collections.emptyList()));
        System.out.println("\nMedicine with 50% settlement: \n " + medicineBySettlementType.getOrDefault("50", Collections.emptyList()));
        System.out.println("\nMedicine without settlement: \n " + medicineBySettlementType.getOrDefault("0", Collections.emptyList()));
    }


    public void searchMedicine(String name) {
        boolean found = false;
        for (Medicine medicine : medicineStock) {
            if (medicine.getMedicineName().equalsIgnoreCase(name)) {
                System.out.println(medicine);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The medicine " + name + " was not found");
        }
    }


    public void showMedicineAfterUnitType(int unit) {
        List<String> unitList = new ArrayList<>();
        for (Medicine element : this.medicineStock) {
            if (element.getUnitCode() == unit) {
                unitList.add(element.getMedicineName() + "-" + element.getUnit());
            }
        }
        System.out.println(unitList);
    }

    public void showProductionCompany() {
        for (Medicine element : this.medicineStock) {
            System.out.println(element.getMedicineName() + "-" + element.getProductionCompany());
        }
    }

    @Override
    public String toString() {
        return "Pharmacy" + pharmacyName;
    }
}
