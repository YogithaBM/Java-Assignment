public class Employee {

    private int empId;
    private String name;
    private String department;
    private String email;
    private double salary;
    private String designation;
    private long phone;
    private int experience;
    private String address;

    public int getEmpId(){
        return empId;
    }
    public void setEmpId(int empId){
        this.empId=empId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }
    public String getDesignation(){
        return designation;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }
    public long getPhone(){
        return phone;
    }
    public void setPhone(long phone){
        this.phone=phone;
    }
    public int getExperience(){
        return experience;
    }
    public void setExperience(int experience){
        this.experience=experience;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
}