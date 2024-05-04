# Drop-shipping App

## Description
This Java application simulates a drop-shipping business model where products are purchased from suppliers and sold to customers without the seller ever physically handling the product. The application handles multiple suppliers and integrates CSV file I/O for product, customer, and sales data management.

## Features
- **Class Definitions**: Includes classes for Customer, Product, Sales, Supplier, and management classes like SalesManagement and SalesQuery.
- **Data Handling**: Utilizes Java I/O to handle data from CSV files, including products, customers, and sales information.
- **Query Functionality**: Implements queries to determine the most profitable product, the most expensive product, the customer with the most purchases, total profit, and the least profitable product for a specific supplier.
- **Array Management**: Manages data storage using arrays and 2-dimensional arrays, with helper methods to dynamically resize arrays when needed.

## How to Run
Ensure Java is installed on your system. Clone the repository and navigate to the project directory. Compile and run the DropshippingApp class which contains the main method.

```bash
javac DropshippingApp.java
java DropshippingApp

## Output
The application outputs the results of the implemented queries directly to the console. Ensure the CSV files are placed in the correct relative path as indicated in the source code to avoid file not found errors.

## Data Files
S1_Products.csv: Contains product details like ID, Title, Rate, Number of Reviews, and Price.
Customers.csv: Contains customer details like ID, Name, Email, Country, and Address.
S1_Sales.csv: Contains sales records linking customer IDs and product IDs with sales details.

## Development Environment
The project should be compatible with Eclipse and other Java IDEs capable of handling Java projects. Ensure the project's text file encoding is set to UTF-8 to support Turkish characters.

Contribution
This project is developed as part of the CENG211 – Programming Fundamentals course.

Contact Information
For inquiries, feedback, or collaboration opportunities, please reach out to the project maintainers:

Project Maintainer: Mustafa Şahin
Email: dantatsus@gmail.com or mustafasahin@std.iyte.edu.tr