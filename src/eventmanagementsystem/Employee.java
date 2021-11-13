package eventmanagementsystem;

/**
 *
 * @author zahid
 */
public class Employee {
    private int Emp_ID;
    private String Emp_Name;
    private String Emp_Phone;
    private String Category;
    private int Salary;

    public Employee(int Emp_ID, String Emp_Name, String Emp_Phone, String Category, int Salary) {
        this.Emp_ID = Emp_ID;
        this.Emp_Name = Emp_Name;
        this.Emp_Phone = Emp_Phone;
        this.Category = Category;
        this.Salary = Salary;
    }

    public int getEmp_ID() {
        return Emp_ID;
    }

    public void setEmp_ID(int Emp_ID) {
        this.Emp_ID = Emp_ID;
    }

    public String getEmp_Name() {
        return Emp_Name;
    }

    public void setEmp_Name(String Emp_Name) {
        this.Emp_Name = Emp_Name;
    }

    public String getEmp_Phone() {
        return Emp_Phone;
    }

    public void setEmp_Phone(String Emp_Phone) {
        this.Emp_Phone = Emp_Phone;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
    
   

   
    
    
}
