package sr.unasat.inheritance.app;

import sr.unasat.inheritance.concrete.Product;
import sr.unasat.inheritance.concrete.Smartphone;
import sr.unasat.inheritance.concrete.Tablet;
import sr.unasat.inheritance.services.ProductService;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
/*        Product product = new Product("Galaxy S20", "dfu567o9df", LocalDate.of(2020, 06, 14));
        product.isProductExpired();

        Smartphone smartphone = new Smartphone("Galaxy S20", "dfu56789df", LocalDate.of(2020, 06, 14));
        //Overriding
        smartphone.isProductExpired();

        //polymorfisme
        Product productPoly = new Smartphone("Galaxy S30", "dfu56789df", LocalDate.of(2020, 06, 14));
        productPoly.isProductExpired();
        //wat word geprint? method van product class of smartclass?
        productPoly = new Product("Galaxy S30", "dfu56789df", LocalDate.of(2020, 06, 14));
        productPoly.isProductExpired();

        productPoly = new Tablet("Galaxy Tab A20", "dfu56789df", LocalDate.of(2020, 12, 14));
        productPoly.isProductExpired();*/
        try {

          //  Product pr = (Product) new Smartphone(); //implicit / down casting
         //   Smartphone sm = (Smartphone) new Product(); //explicit / up casting

            Product productFound1 = ProductService.getProductBySerial("dfu59f389df");
            System.out.println(productFound1);
            Tablet tablet = (Tablet) productFound1;
            tablet.zoom();

            Product productFound2 = ProductService.getProductBySerial("dfu56789df");
            System.out.println(productFound2);
            productFound2.isProductExpired();
            Product productFound3 = ProductService.getProductBySerial("dfu567o9df");
            System.out.println(productFound3);
            productFound3.isProductExpired();
            Product productFound4 = ProductService.getProductBySerial("fesf4rt");
            System.out.println(productFound4);
            productFound4.isProductExpired();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
