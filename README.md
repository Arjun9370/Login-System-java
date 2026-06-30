# Java Login & Registration System

## Overview

A console-based Login and Registration System developed in Java for learning Object-Oriented Programming (OOP), Packages, Arrays, Constructors, and User Authentication concepts.

The application allows users to register with personal details, store user information in memory using arrays, and log in using either a username or generated user ID along with a password.

## Features

* User Registration
* Automatic User ID Generation
* Login using Username
* Login using User ID
* Password Validation
* Display Registered Users
* Menu-Driven Interface
* Package-Based Project Structure
* Object-Oriented Design

## Technologies Used

* Java
* OOP (Classes and Objects)
* Arrays
* Packages
* Constructors
* Scanner Class
* Console Class

## Project Structure

```text
PROJECT/
│
├── login.java
│
└── login/
    ├── form/
    │   └── Form.java
    │
    ├── pass/
    │   └── Pass.java
    │
    ├── sign/
    │   └── Sign.java
    │
    ├── menu/
    │   └── Menu.java
    │
    └── signupMenu/
        └── SignupMenu.java
```

## Class Description

### Form.java

Handles:

* User Registration
* User Login
* Displaying User Details
* Managing User and Password Arrays

### Sign.java

Stores user information:

* Username
* Full Name
* User ID
* Email
* Phone Number

### Pass.java

Stores and manages user passwords.

### Menu.java

Displays the application menu and available options.

### login.java

Main entry point of the application and controls program execution.

## How It Works

### Registration Process

1. User enters:

   * Username
   * Full Name
   * Email
   * Phone Number
   * Password

2. System generates a random 4-digit User ID.

3. User information is stored in arrays.

### Login Process

User can log in using:

* Username + Password
  OR
* User ID + Password

If credentials match:

* Login Successful
* Welcome message displayed

Otherwise:

* Invalid Credentials message displayed

## Sample Menu

```text
1. Sign Up
2. Login
3. Show Users
4. Exit
```

## Learning Concepts Covered

* Java Packages
* Encapsulation
* Constructors
* Arrays of Objects
* User Input Handling
* Authentication Logic
* Menu Driven Programming
* Object-Oriented Programming

## Limitations

* Data is stored only in memory.
* User information is lost after program termination.
* Passwords are stored as plain text.
* Maximum 100 users can be registered.

## Future Improvements

* MySQL Database Integration
* JDBC Connectivity
* Password Encryption
* Forgot Password Feature
* File Handling for Data Persistence
* Java Swing / JavaFX GUI
* Validation for Email and Phone Number
* Admin Dashboard

## Author

Arjun Adhav

B.Tech Computer Engineering
Sandip Foundation SITRC

### Career Goal

Aspiring Software Developer focused on Java, DSA, and Full Stack Development.

## Disclaimer

This project was developed for educational and learning purposes to practice Java programming concepts and is not intended for production use..
