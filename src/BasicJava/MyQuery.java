package BasicJava;

public class MyQuery {

    //1.Transaction requirenments:
    public static final String getTransactionByZipCode =" select * from CDW_SAPP_CREDITCARD "+
            " inner join CDW_SAPP_CUSTOMER on CDW_SAPP_CUSTOMER.ssn = CDW_SAPP_CREDITCARD.cust_ssn " +
            " where cust_zip= '%s' and month= %d and year = %d and CDW_SAPP_CUSTOMER.ssn = %d "+
            " order by day desc ";

    public static final String getTransactionType  = " select count(*) as Number_of_Transactions, sum(transaction_value) as Total_Value "+
            " from CDW_SAPP_CREDITCARD "+
            " where transaction_type = '%s' ";

    public static final String getTransactionByState = " select count(*) as Number_of_Transactions, sum(transaction_value) as Total_value "+
            " from CDW_SAPP_CREDITCARD inner join CDW_SAPP_BRANCH "+
            " on CDW_SAPP_CREDITCARD.branch_code = CDW_SAPP_BRANCH.branch_code "+
            " where branch_state = '%s' ";


    //Customer requirements:
    public static final String getAccountDetail = " select * from CDW_SAPP_CUSTOMER " +
            "inner join CDW_SAPP_CREDITCARD on CDW_SAPP_CREDITCARD.credit_card_no = CDW_SAPP_CUSTOMER.credit_card_no" +
            " where SSN = %d ";


    public static final String modifyAddress = " update CDW_SAPP_CUSTOMER "+
            " set apt_no = '%s', street_name = '%s', cust_city = '%s',cust_state = '%s',cust_zip = '%s' where ssn = %d ";

    public static final String modifyName = " update CDW_SAPP_CUSTOMER "+
            " set first_name = '%s', middle_name = '%s', last_name = '%s' where ssn = %d ";

    public static final String modifyPhone = " update CDW_SAPP_CUSTOMER "+
            " set cust_phone = %d where ssn = %d ";

    public static final String modifyEmail = " update CDW_SAPP_CUSTOMER "+
            " set cust_email = '%s' where ssn = %d ";

    public static final String ssnResult = " select * from CDW_SAPP_CUSTOMER "+
            " where ssn = %d ";

    public static final String getMonthlyBill = " select month, year, sum(transaction_value) as Total_bill, credit_card_no  from CDW_SAPP_CREDITCARD "+
            " where credit_card_no = '%s' and month = %d and year = %d " + " group by year, month " + " order by month ";

    public static final String getTransactionBetweenTwoDates = " SELECT TRANSACTION_ID ,transaction_type, TRANSACTION_VALUE, FIRST_NAME, LAST_NAME, concat(year, \"-\", LPAD(month,2,'0'), \"-\", LPAD(day,2,'0')) as Dates from cdw_sapp_creditcard inner join cdw_sapp_customer " +
            " on CDW_SAPP_CUSTOMER.SSN = CDW_SAPP_CREDITCARD.CUST_SSN " +
            " where ( concat(year, \"-\", LPAD(month,2,'0'), \"-\", LPAD(day,2,'0')) BETWEEN concat(%d, \"-\", LPAD(%d,2,'0'), \"-\", LPAD(%d,2,'0'))  AND concat(%d, \"-\", LPAD(%d,2,'0'), \"-\", LPAD(%d,2,'0')) ) AND cdw_sapp_customer.SSN = %d "+
            " ORDER BY 6 DESC ";

    //check if the ssn in the database:
    public static final String checkSSN = " select * from CDW_SAPP_CUSTOMER " +
            "inner join CDW_SAPP_CREDITCARD on CDW_SAPP_CREDITCARD.credit_card_no = CDW_SAPP_CUSTOMER.credit_card_no" +
            " where SSN = %d ";

    //check if the input transaction in the database
    public static final String checkType = " select * from CDW_SAPP_CREDITCARD "+
            " where transaction_type = '%s' ";

    //check if the input state in the database
    public static final String checkState = " select * from CDW_SAPP_BRANCH "+
            " where branch_state = '%s' ";
}
