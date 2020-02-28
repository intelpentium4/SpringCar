# SpringCar

The purpose of this project is to build an html table using thymeleaf and bootstrap with vehicles in a database using hibernate.

### Important: To run
- This program is written to work with MySQL. You can use the following sql scripts to test the code:
    - employee.sql: Creates the employee table and loads sample data
    - setup-spring-security-bcrypt-demo-database.sql: Creates login accounts with encrypted passwords
        |**user id**|**password**|          **roles**          |
        |-----------|------------|-----------------------------|
        | john      | fun123     | ROLE_EMPLOYEE               |
        | mary      | fun123     | ROLE_EMPLOYEE, ROLE_MANAGER |
        | susan     | fun123     | ROLE_EMPLOYEE, ROLE_ADMIN   |
- In src/main/resources/application.properties change the following fields so that the profiles matches with your database.
    - spring.datasource.username=hbstudent
    - spring.datasource.password=hbstudent
- in /src/main/java/com/luv2code/springboot/thymeleafdemo run the following:
    - CardemoApplication.java

###  To access the webpage
- Go to http://localhost:8080
