package sr.unasat.inheritance.abstracts;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Tablet extends Product{
    public Tablet(String name, String serial, LocalDate productionDate) {
        super(name, serial, productionDate);
    }

    @Override
    public void isProductExpired() {
        long daysFromProduction = ChronoUnit.DAYS.between(productionDate, LocalDate.now());

        if (daysFromProduction > 0) {
            System.out.println("The tablet " + name +" was manufactured " + daysFromProduction + " days ago.");
        } else {
            System.out.println("The tablet is scheduled to be manufactured on " + productionDate);
        }
    }

    @Override
    public void alert() {
        System.out.println("recall on defect tablets!");
    }

    public void zoom() {
        System.out.println("Zoooom!!!");
    }

}
