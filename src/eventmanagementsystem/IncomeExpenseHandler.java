package eventmanagementsystem;

/**
 *
 * @author zahid
 */
public class IncomeExpenseHandler {
    private int Entry_No;
    private String Entry_type;
    private String Entry_category;
    private String Entry_description;
    private int Emp_ID;
    private int Bill_No;
    private String Entry_date;
    private int totalCash;

    public IncomeExpenseHandler(int Entry_No, String Entry_type, String Entry_category, String Entry_description, int Emp_ID, int Bill_No, String Entry_date, int totalCash) {
        this.Entry_No = Entry_No;
        this.Entry_type = Entry_type;
        this.Entry_category = Entry_category;
        this.Entry_description = Entry_description;
        this.Emp_ID = Emp_ID;
        this.Bill_No = Bill_No;
        this.Entry_date = Entry_date;
        this.totalCash = totalCash;
    }

    public int getEntry_No() {
        return Entry_No;
    }

    public void setEntry_No(int Entry_No) {
        this.Entry_No = Entry_No;
    }

    public String getEntry_type() {
        return Entry_type;
    }

    public void setEntry_type(String Entry_type) {
        this.Entry_type = Entry_type;
    }

    public String getEntry_category() {
        return Entry_category;
    }

    public void setEntry_category(String Entry_category) {
        this.Entry_category = Entry_category;
    }

    public String getEntry_description() {
        return Entry_description;
    }

    public void setEntry_description(String Entry_description) {
        this.Entry_description = Entry_description;
    }

    public int getEmp_ID() {
        return Emp_ID;
    }

    public void setEmp_ID(int Emp_ID) {
        this.Emp_ID = Emp_ID;
    }

    public int getBill_No() {
        return Bill_No;
    }

    public void setBill_No(int Bill_No) {
        this.Bill_No = Bill_No;
    }

    public String getEntry_date() {
        return Entry_date;
    }

    public void setEntry_date(String Entry_date) {
        this.Entry_date = Entry_date;
    }

    public int getTotalCash() {
        return totalCash;
    }

    public void setTotalCash(int totalCash) {
        this.totalCash = totalCash;
    }
    
    
    
}
