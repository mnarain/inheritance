package sr.unasat.inheritance.interfaces;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Tablet implements Product {

    @Override
    public void isProductExpired() {

    }

    @Override
    public void nowYouSeeMe() {

    }

    public void zoom() {
        System.out.println("Zoooom!!!");
    }

}
