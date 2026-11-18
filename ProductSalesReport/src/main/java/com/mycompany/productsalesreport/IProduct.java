/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author kutum
 */
public interface IProduct {

    //For returning sales
    int GetTotalProductsSold();

    //For returning the average
    double GetAverageProductSold();

    //returns thename of the most popular
    String GetMostPopularProduct();

}