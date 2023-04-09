import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static Pharmacy.THIS_OPTION_IS_NOT_VALID;

public class Medicine {


    public static final String TABLETS = "Tablets";
    public static final String SYRUP = "Syrup";
    public static final String VIAL = "Vial";

    private String medicineName;
    private double medicinePrice;
    private String unit;
    private int unitCode;
    private String productionCompany;
    private boolean hasPrescription;
    private String expirationDate;
    private int quantity;
    private String settlementType;

    public Medicine(String medicineName, double medicinePrice, int unitCode, int quantity,
                    String productionCompany, boolean hasPrescription, String expirationDate, String settlementType) {
        this.medicineName = medicineName;
        this.medicinePrice = medicinePrice;
        this.unitCode = unitCode;
        this.unit = setUnit();
        this.productionCompany = productionCompany;
        this.hasPrescription = hasPrescription;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.settlementType = settlementType;

    }

    public Medicine(String medicineName, int quantity) {
        this.medicineName = medicineName;
        this.quantity = quantity;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getUnit() {
        return unit;
    }

    public int getUnitCode() {
        return unitCode;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setMedicinePrice(double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }

    public String setUnit() {
        return switch (unitCode) {
            case 1 -> TABLETS;
            case 2 -> SYRUP;
            case 3 -> VIAL;
            default -> THIS_OPTION_IS_NOT_VALID;
        };
    }

    public double getMedicinePrice() {
        return medicinePrice;
    }

    public String getSettlementType() {
        return settlementType;
    }

    public boolean verifyExpirationDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate today = LocalDate.now();
        return formatter.format(today).compareTo(this.expirationDate) < 0 && formatter.format(today).compareTo(this.expirationDate) != 0;
    }

    @Override
    public String toString() {
        return String.format("%-16s= %17s %-32s=  %7s %-21s= %10s %-16s= %17s",
                "{medicineName ", medicineName, "  •   medicinePrice ", medicinePrice,
                "  •   unitCode ", unitCode, "  •   unit ", unit + "\n") +
                String.format("%-16s= %17s %-26s=  %7s %-13s= %10s %-16s= %17s",
                        "productionCompany ", productionCompany, "  •   withOrWithoutPrescription ", hasPrescription,
                        "  •   expirationDate ", expirationDate, "  •   quantity ", quantity + "}\n");

    }
}
