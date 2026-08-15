# Java Banking Program

A comprehensive banking system application built with Java that simulates core banking operations.

## Overview

This project is a Java-based banking system that provides essential banking functionalities in an interactive console application. The system allows users to perform various banking operations through a user-friendly menu-driven interface.

## Features

- **Customer Creation**: Register new customers with personal details
- **Withdraw Funds**: Withdraw money from customer accounts with transaction tracking
- **Deposit Funds**: Deposit money into customer accounts with transaction tracking
- **Customer Details Display**: View customer information and account details
- **Transaction History**: Track all transactions with timestamps for audit purposes
- **Input Validation**: Robust error handling for invalid user inputs

## Project Structure

```
BankingSystem/
├── BankingScreen.java          # Main entry point with menu-driven interface
├── Customer.java               # Customer class for storing customer information
├── CreateCustomer.java         # Customer creation module
├── Deposit.java                # Deposit transaction handling
├── Withdraw.java               # Withdraw transaction handling
├── SeeCustomerDetails.java     # Customer details retrieval
└── NormalProgram.java          # Additional program logic
```

## Technologies Used

- **Java 11**: Programming language
- **Java Collections**: HashMap for transaction history management
- **Java Time API**: LocalDateTime for timestamp management and formatting
- **Java Streams**: Functional programming approach for data processing
- **Scanner**: User input handling
- **Regex**: Input validation using pattern matching

## Core Classes

### BankingScreen
- Main entry point of the application
- Implements menu-driven user interface
- Handles user selection for banking operations
- Input validation with exception handling

### Customer
- Represents a customer with personal information
- Fields: name, fatherName, accountNumber
- Custom toString() method for displaying customer details

### Withdraw
- Handles withdrawal operations
- Tracks transaction history with timestamps
- Updates account balance after withdrawal

### Deposit
- Handles deposit operations
- Maintains transaction history with date-time stamps
- Updates account balance after deposit

### CreateCustomer
- Manages new customer registration
- Collects customer information
- Creates new Customer objects

### SeeCustomerDetails
- Retrieves and displays customer information
- Shows account details and transaction history

## How to Run

1. Compile all Java files:
   ```bash
   javac BankingSystem/*.java
   ```

2. Run the main program:
   ```bash
   java BankingSystem.BankingScreen
   ```

3. Follow the on-screen menu:
   - Enter `1` for Withdraw
   - Enter `2` for Deposit
   - Enter `3` for Customer Creation
   - Enter `4` for Customer Details Display

## Usage Example

```
Welcome to SBI banking. Please Enter the card.

Please select from the below
1. For withdraw
2. For deposit
3. For Customer Creation
4. For customer details display
```

## Features Highlight

- **Transaction Tracking**: All transactions are logged with precise timestamps
- **Input Validation**: Comprehensive error handling for user inputs
- **String Manipulation**: Advanced string operations for display formatting
- **Collection Management**: HashMap-based transaction history
- **Date-Time Formatting**: Custom date-time formatting for transaction logs

## Future Enhancements

- Database integration for persistent data storage
- User authentication and security features
- Account balance management
- Interest calculation on deposits
- Loan management system
- Advanced reporting features
- File-based backup system

## Notes

- This is a console-based application for educational purposes
- Currently uses in-memory storage (data is lost after program termination)
- Input validation prevents invalid entries from being processed
- Transaction history uses HashMap for efficient storage and retrieval

## Author

Created as a Java programming project for banking system demonstration.
