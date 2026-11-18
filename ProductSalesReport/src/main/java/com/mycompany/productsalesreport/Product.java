/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author kutum
 */

public class Product implements IProduct {

    private String[] products;
    private int[][] sales;

    // Constructor
    public Product(String[] products, int[][] sales) {

        this.products = products;
        this.sales = sales;
    }

    // Calculate total products sold
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int i = 0; i < sales.length; i++) {

            for (int j = 0; j < sales[i].length; j++) {

                total = total + sales[i][j];
            }
        }

        return total;
    }

    // Calculate average products sold
    @Override
    public double GetAverageProductSold() {

        int total = GetTotalProductsSold();

        int numberOfSales = 0;

        for (int i = 0; i < sales.length; i++) {

            numberOfSales = numberOfSales + sales[i].length;
        }

        return (double) total / numberOfSales;
    }

    // Find the most popular product
    @Override
    public String GetMostPopularProduct() {

        int highestSales = 0;
        String popularProduct = "";

        for (int i = 0; i < sales.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {

                productTotal = productTotal + sales[i][j];
            }

            if (productTotal > highestSales) {

                highestSales = productTotal;
                popularProduct = products[i];
            }
        }

        return popularProduct + " (" + highestSales + ")";
    }
}