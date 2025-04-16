# Simpy-Pizza

This is a Java-based console application that simulates a point-of-sale system for a fictional pizza restaurant called *Simply Pizza*. The program lets customers place orders, calculates totals, applies a discount if applicable, and provides a full receipt including tax and change.

## 📋 Description

The user can:
- Enter quantities of small and large pizzas, toppings, and soft drinks.
- Receive a 10% discount on orders over $50.
- Be prompted to add more money if their payment is insufficient.
- Get a full receipt printed with subtotal, discount, tax, total, and change.
- Repeat orders until they choose to stop.

At the end, the system displays:
- The **grand total** earned.
- The **number of customers** served.

## 🛠 Files Included

- `resto.java`: Main application that handles input, calculations, and receipt printing.
- `discount.java`: A helper class to apply a 10% discount for qualifying orders.

## ✅ Features

- Modular design using classes and functions
- Conditional discount for orders over $50
- Repeats until the user exits
- Tracks total revenue and number of customers

## 🚀 How to Run

1. Make sure both `resto.java` and `discount.java` are in the same directory.

2. Compile the files:

    ```bash
    javac resto.java
    ```

3. Run the program:

    ```bash
    java resto
    ```

## 📝 Notes

- You’ll need a Java compiler (JDK 8 or later).
- This program runs entirely in the console.

---
