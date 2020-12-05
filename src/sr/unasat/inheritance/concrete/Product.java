package sr.unasat.inheritance.concrete;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Product {
    public String name;
    public String serial;
    public LocalDate productionDate;

    public Product(String name, String serial, LocalDate productionDate) {
        this.name = name;
        this.serial = serial;
        this.productionDate = productionDate;
    }

    public void isProductExpired(){
        long daysFromProduction = ChronoUnit.DAYS.between(productionDate, LocalDate.now());
        if (daysFromProduction > 0) {
            System.out.println("The product was manufactured " + daysFromProduction + " days ago.");
        } else {
            System.out.println("The product is scheduled to be manufactured on " + productionDate);
        }
    }
}
