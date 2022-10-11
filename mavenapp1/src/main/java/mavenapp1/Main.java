package mavenapp1;

public class Main {
public static void main(String[] args) {
	EmployeeDAO empo=new EmployeeImpl();
	//empo.save(new Employee(20, "Shameem", "inchivila", 200));
    //System.out.println(empo.getAddressOfEmployee(20));
	//System.out.println(empo.giveBonusToEmployee(20, 3000));
	System.out.println(empo.deleteEmployee(20));
}
}
