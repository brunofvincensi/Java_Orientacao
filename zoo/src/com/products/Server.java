package com.products;

import com.products.entities.ImportedProduct;
import com.products.entities.Product;
import com.products.entities.UsedProduct;

import java.text.DateFormat;
import java.util.*;

public class Server {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products: ");
        int N = sc.nextInt();

        List<Product> productsList = new ArrayList<>();


        for(int i = 1; i <= N; i++){


            System.out.println("Common, used or imported (c/u/i)?");
            char cont = sc.next().charAt(0);

            System.out.println("Product #" + i + " data:");
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Price: ");
            double price = sc.nextDouble();


            if(cont == 'c') {
                productsList.add(new Product(name, price));


            }
            else if(cont == 'u'){

                System.out.println("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = sc.next();


                productsList.add(new UsedProduct(name, price, manufactureDate));


            }else if(cont == 'i'){

                System.out.println("Customs fee: ");
                double customsFee = sc.nextDouble();

                productsList.add(new ImportedProduct(name, price, customsFee));
                
            }

        }
        System.out.println("PRICE TAGS: ");


        for (Product product : productsList
             ) {
            System.out.println(product.getName() + " " + product.priceTag());
        }








        sc.close();
    }
}
