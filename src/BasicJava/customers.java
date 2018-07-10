package BasicJava;

import java.sql.Timestamp;

public class customers {

    private String First_name;
    private String Middle_name;
    private String Last_name;
    private int ssn;
    private String credit_card_no;
    private String apt_no;
    private String street_name;
    private String cust_city;
    private String cust_state;
    private String cust_country;
    private String cust_zip;
    private int cust_phone;
    private String cust_email;
    private Timestamp last_updates;

    public customers(String first_name,
                     String middle_name,
                     String last_name,
                     int ssn,
                     String credit_card_no,
                     String apt_no,
                     String street_name,
                     String cust_city,
                     String cust_state,
                     String cust_country,
                     String cust_zip,
                     int cust_phone,
                     String cust_email,
                     Timestamp last_updates) {
        First_name = first_name;
        Middle_name = middle_name;
        Last_name = last_name;
        this.ssn = ssn;
        this.credit_card_no = credit_card_no;
        this.apt_no = apt_no;
        this.street_name = street_name;
        this.cust_city = cust_city;
        this.cust_state = cust_state;
        this.cust_country = cust_country;
        this.cust_zip = cust_zip;
        this.cust_phone = cust_phone;
        this.cust_email = cust_email;
        this.last_updates = last_updates;
    }

    public customers(int ssn) {
        this.ssn = ssn;
    }

    public String getFirst_name() {
        return First_name;
    }

    public String getMiddle_name() {
        return Middle_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public int getSsn() {
        return ssn;
    }

    public String getCredit_card_no() {
        return credit_card_no;
    }

    public String getApt_no() {
        return apt_no;
    }

    public String getStreet_name() {
        return street_name;
    }

    public String getCust_city() {
        return cust_city;
    }

    public String getCust_state() {
        return cust_state;
    }

    public String getCust_country() {
        return cust_country;
    }

    public String getCust_zip() {
        return cust_zip;
    }

    public int getCust_phone() {
        return cust_phone;
    }

    public String getCust_email() {
        return cust_email;
    }

    public Timestamp getLast_updates() {
        return last_updates;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public void setMiddle_name(String middle_name) {
        Middle_name = middle_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setCredit_card_no(String credit_card_no) {
        this.credit_card_no = credit_card_no;
    }

    public void setApt_no(String apt_no) {
        this.apt_no = apt_no;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public void setCust_city(String cust_city) {
        this.cust_city = cust_city;
    }

    public void setCust_state(String cust_state) {
        this.cust_state = cust_state;
    }

    public void setCust_country(String cust_country) {
        this.cust_country = cust_country;
    }

    public void setCust_zip(String cust_zip) {
        this.cust_zip = cust_zip;
    }

    public void setCust_phone(int cust_phone) {
        this.cust_phone = cust_phone;
    }

    public void setCust_email(String cust_email) {
        this.cust_email = cust_email;
    }

    public void setLast_updates(Timestamp last_updates) {
        this.last_updates = last_updates;
    }
}
