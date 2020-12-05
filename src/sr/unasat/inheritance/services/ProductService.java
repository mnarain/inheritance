package sr.unasat.inheritance.services;

import sr.unasat.inheritance.concrete.Product;
import sr.unasat.inheritance.concrete.Smartphone;
import sr.unasat.inheritance.concrete.Tablet;
import sr.unasat.inheritance.exception.ProductNotFoundexception;

import java.time.LocalDate;

public class ProductService {

    public static Product getProductBySerial(String serial) throws Exception {
        Product foundProduct = null;
        switch (serial){
            case "dfu567o9df": foundProduct = new Product("Galaxy S20", "dfu567o9df", LocalDate.of(2020, 06, 14));
            break;
            case "dfu56789df": foundProduct = new Smartphone("Galaxy S20", "dfu56789df", LocalDate.of(2020, 06, 14));
            break;
            case "dfu59f389df": foundProduct = new Tablet("Galaxy Tab A20", "dfu59f389df", LocalDate.of(2020, 12, 14));
            break;
            default: throw new ProductNotFoundexception("no product exists with that serial number " + serial);
        }
        return foundProduct;
    }


}
