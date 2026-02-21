📄 Project Description  
The Photography Studio Booking Management System is a console-based Java application developed using Hibernate ORM and Oracle Database.  
This project is used to manage photography studio bookings efficiently.  
Users can create a booking, reschedule an existing booking, and cancel a booking.  
The system uses Hibernate to perform database operations and displays confirmation messages in the console.  


🎯 Project Objectives  
To understand Hibernate ORM framework  
To perform CRUD operations using Hibernate  
To integrate Java application with Oracle Database  
To replace JDBC with Hibernate-based persistence  
To generate booking IDs using Oracle Sequence  

🛠️ Technologies Used  
Programming Language : Java  
Framework : Hibernate ORM  
Database : Oracle Database  
IDE : Eclipse / IntelliJ IDEA  
Build Tool : Maven  
JDBC Driver : Oracle JDBC Driver  

🧱 Project Architecture  
The project follows a layered architecture:  
Entity Layer – Contains entity classes mapped to database tables  
DAO Layer – Contains database operations  
Util Layer – Hibernate configuration and SessionFactory  
Main Layer – Application execution and console output  

🗄️ Database Tables Used  

1️⃣ CUSTOMER_TBL  
| Column Name      | Data Type   | Description       |  
| ---------------- | ----------- | ----------------- |  
| CUSTOMER_ID      | NUMBER (PK) | Customer ID       |  
| FULLNAME         | VARCHAR2    | Customer Name     |  
| EMAIL            | VARCHAR2    | Email ID          |  
| MOBILE           | VARCHAR2    | Mobile Number     |  
| PREFERREDPACKAGE | VARCHAR2    | Preferred Package |  


2️⃣ BOOKING_TBL  
| Column Name  | Data Type   | Description    |  
| ------------ | ----------- | -------------- |  
| BOOKING_ID   | NUMBER (PK) | Booking ID     |  
| CUSTOMER_ID  | NUMBER (FK) | Customer ID    |  
| SHOOT_DATE   | DATE        | Date of Shoot  |  
| START_TIME   | VARCHAR2    | Start Time     |  
| END_TIME     | VARCHAR2    | End Time       |  
| PACKAGE_TYPE | VARCHAR2    | Package Type   |  
| STATUS       | VARCHAR2    | Booking Status |  


⚙️ Features Implemented  

Create new photography booking  
Reschedule an existing booking  
Cancel a booking  
Auto ID generation using sequence  
Hibernate annotations mapping  
Console-based output  

![screenshot 1](https://github.com/user-attachments/assets/002993a3-ac27-4d1e-98fe-a66fb27db698)





