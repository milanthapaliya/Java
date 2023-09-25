package collection.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class streamExample {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1,"HP Laptop",25000f));
        products.add(new Product(2,"Dell Laptop",30000f));
        products.add(new Product(3,"Lenevo Laptop",28000f));
        products.add(new Product(4,"Sony Laptop",28000f));
        products.add(new Product(5,"Apple Laptop",90000f));

        // getting products names where price > 30000

        List<String> productNames = products.stream()
                .filter( p -> p.price > 30000)
                .map(p -> p.name)
                .collect(Collectors.toList());

        // find the max value using collection.stream
        float maxPrice = products.stream().max((p1,p2) -> p1.price > p2.price ? 1 : -1).map(p -> p.price).get();
        System.out.println(maxPrice);

        // find the product information of the product having the least price

        Product productLeastPrice = products.stream().min((p1,p2) -> p1.price > p2.price ? 1 : -1).get();
        System.out.println(productLeastPrice.name + " " + productLeastPrice.price);

        // count the number of products having price less than 30000
        long count = products.stream().filter(p -> p.price < 30000).count();
        System.out.println(count);

        //convert list into Map

        Map<String,Float> productPriceMap = products.stream().
                collect(Collectors.toMap( p -> p.name, p-> p.price));
        System.out.println(productPriceMap);

        // select top 3 products sorted by their price in ascending order
        List<String> sortedProductsPrice = products.stream().sorted(Comparator.comparing(p -> p.price))
                .limit(3)
                .map(p -> p.name)
                .collect(Collectors.toList());
        System.out.println(sortedProductsPrice);

        // select top 3 products sorted by their price in descending order
        List<String> sortedProductsPriceDesc = products.stream().sorted(Comparator.comparing(Product :: getPrice).reversed())
                .limit(3)
                .map(p -> p.name)
                .collect(Collectors.toList());
        System.out.println(sortedProductsPriceDesc);

        // ALL MATCH
        Boolean match = products.stream().allMatch( p -> p.price > 15000);
        System.out.println(match);

        // ANY MATCH
        Boolean anyMatch = products.stream().anyMatch( p -> "Apple Laptop".equals(p.name));
        System.out.println(anyMatch);

    }

}
