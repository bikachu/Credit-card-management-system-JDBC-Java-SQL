package BasicJava;

public class Transaction {

    private int transaction_id;
    private int day;
    private int month;
    private int year;
    private String credit_card_no;
    private int cust_ssn;
    private int branch_code;
    private String transaction_type;
    private long transaction_value;

    public Transaction(int transaction_id, int day, int month, int year, String credit_card_no, int cust_ssn, int branch_code, String transaction_type, long transaction_value) {
        this.transaction_id = transaction_id;
        this.day = day;
        this.month = month;
        this.year = year;
        this.credit_card_no = credit_card_no;
        this.cust_ssn = cust_ssn;
        this.branch_code = branch_code;
        this.transaction_type = transaction_type;
        this.transaction_value = transaction_value;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getCredit_card_no() {
        return credit_card_no;
    }

    public int getCust_ssn() {
        return cust_ssn;
    }

    public int getBranch_code() {
        return branch_code;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public long getTransaction_value() {
        return transaction_value;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCredit_card_no(String credit_card_no) {
        this.credit_card_no = credit_card_no;
    }

    public void setCust_ssn(int cust_ssn) {
        this.cust_ssn = cust_ssn;
    }

    public void setBranch_code(int branch_code) {
        this.branch_code = branch_code;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public void setTransaction_value(long transaction_value) {
        this.transaction_value = transaction_value;
    }
}
