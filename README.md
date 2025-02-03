# Healthcare Management System (Hibernate + Java)

Contributors
This project was developed by the following team members:

Jacob Moore - Sailaja P. - Steven Wu - Daniel Noa

## Overview

The **Healthcare Management System** is a Java-based application utilizing **Hibernate ORM** to manage **Patients, Doctors, Appointments, and Offices** efficiently. It implements advanced **Hibernate relationships**, including **One-to-One, One-to-Many, and Many-to-Many** associations. The system supports CRUD operations for each entity, ensuring seamless database interactions.

## Features

- **Patient Management**: Create, Read, Update, Delete (CRUD) operations for Patients.
- **Doctor Management**: Manage Doctors with specialties and assigned offices.
- **Appointment Scheduling**: Link doctors and patients through scheduled appointments.
- **Office Assignment**: Assign doctors to offices (One-to-One relationship).
- **Database Persistence**: Uses MySQL with Hibernate ORM for efficient data handling.

## Tech Stack

- **Java 21**
- **Hibernate ORM**
- **MySQL**
- **Maven**
- **JUnit (for testing)**

## Installation & Setup

### Prerequisites
- Java 21 installed
- MySQL database configured
- Maven installed
- IntelliJ IDEA (Recommended)

### Database Setup
1. Import the **`Healthcare.sql`** file into MySQL:
   ```sql
   source path/to/Healthcare.sql;
