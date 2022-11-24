package com.axis.app

import com.axis.module.Product
import com.axis.service.ProductService
import java.util.*

fun main(){
    var ProductService=ProductService()

    var scan  = Scanner(System.`in`)
    println("Enter product_id")
    var productId:Int=scan.nextInt()
    println("Enter product_name")
    var productName:String=scan.next()
    println("Enter product_price")
    var productPrice:Double=scan.nextDouble()
    println("Enter product_10quantity")
    var productQuantity:Int =scan.nextInt()

    var product= Product(productId,productName,productPrice,productQuantity)

    // productService.insertProduct()

    ProductService.insertUserProduct(product)


    ProductService.displayAllProducts()



}
