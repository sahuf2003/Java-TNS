import com.sahuf.assignment.employees.*;
import com.sahuf.assignment.utilities.*;
public class AssignmentMain {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setName("Sahuf");
		manager.setEmployeeid(200);
		manager.setRole("Senior Manager");
		manager.setSalary(200000);
		EmployeeUtilities.getinfo(manager);
		EmployeeUtilities.getRoleInfo(manager);
		EmployeeUtilities.Bonus(manager);
		EmployeeUtilities.getinfo(manager);
		
		
		Developer dev = new Developer();
		dev.setName("John");
		dev.setEmployeeid(500);
		dev.setSalary(50000);
		dev.setRole("FrontEnd Developer");
		EmployeeUtilities.getinfo(dev);
		EmployeeUtilities.getRoleInfo(dev);
		

	}

}
