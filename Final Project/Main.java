package com.demo;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductDAO ProductDao = new ProductDAO();
        int choice;

        do {
            System.out.println("\n------Product Management System -----");
            System.out.println("1. Add new Product");
            System.out.println("2. View All Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. View Product by ID");
            System.out.println("6. Search Products by Product Name");
            System.out.println("7. Display Total Number of Products ");
            System.out.println("8. Delete All Products");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Create Contact
                    System.out.print("Enter Product Name: ");
                    String name = scanner.next();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    int price = scanner.nextInt();

                    Product newProduct = new Product();
                    newProduct.setPname(name);
                    newProduct.setQuantity(quantity);
                    newProduct.setPrice(price);

                    ProductDao.saveProduct(newProduct);
                    System.out.println("Product added successfully.");
                    break;

                case 2: // View All Products
                    List<Product> products = ProductDao.getAllProducts();
                    for (Product product : products) {
                        System.out.println("Product ID: " + product.getPid() + ",  Product Name: " + product.getPname() +
                                ", quantity " + product.getQuantity() + " , Price: " + product.getPrice());
                    }
                    break;

                case 3: // Update Product
                    System.out.print("Enter Product ID to Update: ");
                    int updateId = scanner.nextInt();
                    Product ProductToUpdate = ProductDao.getProductById(updateId);

                    if (ProductToUpdate != null) {
                        System.out.print("Enter New Product name : ");
                        ProductToUpdate.setPname(scanner.next());
                        ProductDao.updateProduct(ProductToUpdate);
                        System.out.println("Product updated successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 4: // Delete Product
                    System.out.print("Enter Product ID to Delete: ");
                    int deleteId = scanner.nextInt();
                    ProductDao.deleteProduct(deleteId);
                    System.out.println("Product deleted successfully.");
                    break;

                case 5: // View Product by ID
                    System.out.print("Enter Product ID to View: ");
                    int viewId = scanner.nextInt();
                    Product product = ProductDao.getProductById(viewId);
                    if (product != null) {
                        System.out.println("Product ID: " + product.getPid() + ", Product Name: "+ product.getPname() +
                                ", quantity: " + product.getQuantity() + " , Price : " + product.getPrice());
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 6: // Search Products by Name
                    System.out.print("Enter Name to Search: ");
                    String searchName = scanner.next();
                    List<Product> nameMatches = ProductDao.getProductsByName(searchName);
                    if (!nameMatches.isEmpty()) {
                        for (Product c : nameMatches) {
                            System.out.println(" Product ID: " + c.getPid() + ", Product Name: " + c.getPname() +
                                     ", Quantity: " + c.getQuantity() + " , Price : " + c.getPrice());
                        }
                    } else {
                        System.out.println("No Products found with that name.");
                    }
                    break;

                case 7: // Display Total Number of Products
                    long count = ProductDao.getTotalProducts();
                    System.out.println("Total Product: " + count);
                    break;

                case 8: // Delete All Products
                	ProductDao.deleteAllProducts();
                    System.out.println("All Products deleted successfully.");
                    break;

                case 9: // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);

        scanner.close();
    }
 }