/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalesreport;

import java.util.Scanner;
/**
 *
 * @author kutum
 */
public class ProductSalesReport {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Single-dimensional array
        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        // Two-dimensional array
        int[][] sales = new int[3][3];

        // Enter sales for each product
        for (int i = 0; i < products.length; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter number of sales for month "
                        + (j + 1) + " for " + products[i]
                        + " mattress: ");

                sales[i][j] = input.nextInt();
            }

            System.out.println();
        }

        // Create Product object
        Product product = new Product(products, sales);

        // Create PrintProduct object
        PrintProduct printer = new PrintProduct();

        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("***************************************");

        // Print report
        printer.PrintTotalSales(product);
        printer.PrintAverageSales(product);
        printer.PrintPopularProduct(product);

        input.close();
    }
}