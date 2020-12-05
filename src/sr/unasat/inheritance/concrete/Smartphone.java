package sr.unasat.inheritance.concrete;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Smartphone extends Product{
    public Smartphone(String name, String serial, LocalDate productionDate) {
        super(name, serial, productionDate);
    }

    @Override
    public void isProductExpired() {
        long daysFromProduction = ChronoUnit.DAYS.between(productionDate, LocalDate.now());

        if (daysFromProduction > 0) {
            System.out.println("The smartphone " + name +" was manufactured " + daysFromProduction + " days ago.");
        } else {
            System.out.println("The smartphone is scheduled to be manufactured on " + productionDate);
        }
    }

    public void test() {}

}