package Run;
//author: Peter Li
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException{

        System.out.println("Welcome to Credit Management System: ");
        System.out.println("Enter 1 for customer details");
        System.out.println("Enter 2 for transaction details");
        System.out.println("Please choose an option");

        Scanner Input = new Scanner(System.in);
        int userInput = Input.nextInt();


        if( userInput ==1){

            customersRun.main(null);

        }

        if( userInput ==2){

            TransactionRun.main(null);
        }
    }
}




