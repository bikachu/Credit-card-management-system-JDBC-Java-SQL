# Credit-card-management-system-JDBC-Java-SQL
----------------------------------------------------------------
This project use JDBC(Java and MySQL) to implement credit card system management requirements.

* The sql database create file is not included due to privacy.
* In order to successfully run this project, You need:

        1. The SQL database file( contact me if you need validate this project)
        2. change the password in connection.java for MySQL server.


------------------------

Transaction Details Module:

    1) To display the transactions made by customers living in a given zipcode for a given month and year. Order by day in descending order.
    
    2) To display the number and total values of transactions for a given type.
    
    3) To display the number and total values of transactions for branches in a given state.
    
    

------------------------    
Customer Details Module:

    1) To check the existing account details of a customer.
    
    2) To modify the existing account details of a customer
    
    3) To generate monthly bill for a credit card number for a given month and year.
    
    4) To display the transactions made by a customer between two dates. Order by year, month, and day in descending order.



---------------------
The project contains 4 packages:

1. BasicJava: Including connection,customers,MyQuery, Transaction
2. Dao : Including customersDao, TransactionDao
3. Module: customersDaoImpl, TransactionDaoImpl
4. Run: Main, customersRun. TransactionRun.
