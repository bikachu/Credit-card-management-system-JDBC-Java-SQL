package Run;

import module.TransactionDaoImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class TransactionRun {

    public static void main(String[] args)throws SQLException {

        System.out.println("You entered the transaction details system");
        System.out.println("Enter 1 to display the transaction for a month and year");
        System.out.println("Enter 2 to display the number and total value of transactions for a given type");
        System.out.println("Enter 3 to display the number and total value of transactions for branches in a given state");
        System.out.println("Please choose an option");

        Scanner Input = new Scanner(System.in);

        int input_customer = Input.nextInt();
        if (input_customer == 1) {

            TransactionDaoImpl t1 = new TransactionDaoImpl();
            Scanner Trans = new Scanner(System.in);

            System.out.println("Please enter your social security number: ");
            int ssn_1 = Input.nextInt();
            if(!t1.checkSSN(ssn_1).next()){

                System.out.println("The database don't records for you Social Security Number\nPlease check your SSN");

            }
            else{

                System.out.println("Please enter your zipcode: ");
                String zip_code = Trans.nextLine();

                System.out.println("Please enter your month: ");
                int month  = Input.nextInt();

                System.out.println("Please enter your year: ");
                int year = Input.nextInt();

                t1.getTransactionByZipcode(zip_code, month, year,ssn_1);

            }
        }


        if (input_customer == 2) {

            TransactionDaoImpl t2 = new TransactionDaoImpl();
            Scanner Trans2 = new Scanner(System.in);
            System.out.println("Please enter a transaction type: ");
            String transaction_type = Trans2.nextLine();

            if(!t2.checkType(transaction_type).next()){

                System.out.println("The database don't have transaction number and value for the input type "+ "'"+transaction_type+"'");
            }
            else{

                t2.TransactionNumberAndValue(transaction_type);
            }

        }

        if (input_customer == 3) {

            TransactionDaoImpl t3 = new TransactionDaoImpl();
            Scanner Trans3 = new Scanner(System.in);
            System.out.println("Please enter a state name: ");
            String state = Trans3.nextLine();

            if(!t3.checkState(state).next()){

                System.out.println("The database don't have transaction number and value for the input state " + "'"+state.toUpperCase()+"'");
            }
            else{

                t3.getTransactionByState(state);
            }
        }

    }

}
