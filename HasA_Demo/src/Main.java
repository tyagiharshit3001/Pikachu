import com.har.model.Employee;
import com.har.model.Address;
import com.har.model.Department;
import com.har.model.Company;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		
		
		
		
		
		Employee[] eList1 = new Employee[5];
		Employee[] eList2 = new Employee[5];
		Employee[] eList3 = new Employee[5];
		
		
		
		eList1[0] = new Employee(7001, "Ajay Saxena", 62500, new Address("02", "Swarg Ashram", "Hapur", "Uttar Pradesh"));
		eList1[1] = new Employee(7002, "Mohan Saxena", 63500, new Address("20", "Swarg Ashram", "Rampur", "Uttar Pradesh"));
		eList1[2] = new Employee(7003, "Sohan Saxena", 64500, new Address("25", "Swarg Ashram", "Lucknow", "Uttar Pradesh"));
		eList1[3] = new Employee(7004, "Chinku Saxena", 65500, new Address("33", "Swarg Ashram", "Agra", "Uttar Pradesh"));
		eList1[4] = new Employee(7005, "Pinku Saxena", 66500, new Address("39", "Swarg Ashram", "Mirzapur", "Uttar Pradesh"));
		
		eList2[0] = new Employee(7006, "Reshampal Saxena", 67500, new Address("02", "Swarg Ashram", "Darbhanga", "Bihar"));
		eList2[1] = new Employee(7007, "Manmohan Saxena", 68500, new Address("20", "Swarg Ashram", "Samastipur", "Bihar"));
		eList2[2] = new Employee(7008, "Vibhuti Saxena", 69500, new Address("25", "Swarg Ashram", "Mujaffarpur", "Bihar"));
		eList2[3] = new Employee(7009, "Prem Saxena", 70500, new Address("33", "Swarg Ashram", "Patna", "Bihar"));
		eList2[4] = new Employee(7010, "Anokhelal Saxena", 71500, new Address("39", "Swarg Ashram", "Siwan", "Bihar"));
		
		eList3[0] = new Employee(7011, "Devid Saxena", 72500, new Address("02", "Swarg Ashram", "Guntoor", "Hyderabad"));
		eList3[1] = new Employee(7012, "Jethalal Saxena", 73500, new Address("20", "Swarg Ashram", "Vijyanagram", "Andhra Pradesh"));
		eList3[2] = new Employee(7013, "Tarak Saxena", 74500, new Address("25", "Swarg Ashram", "Kakinada", "Telangna"));
		eList3[3] = new Employee(7014, "Iyer Saxena", 75500, new Address("33", "Swarg Ashram", "Madhapur", "Hyderabad"));
		eList3[4] = new Employee(7015, "Popatlal Saxena", 71500, new Address("39", "Swarg Ashram", "Hi-tech City", "Hyderabad"));
		
		Department[] d = new Department[3];
		
		d[1] = new Department(102, "Engineering", "Bengalore", eList2);
		d[0] = new Department(101, "Sales & Marketing", "Meerut", eList1);
		d[2] = new Department(103, "Production", "Vadodra", eList3);
		
		
		Company c = new Company("Prolifics", "Hyderabad", d);
		
		System.out.println("----------------------Company Details----------------------");
		System.out.println("Company Name: "+ c.getCompanyName());
		System.out.println("Company Location: "+ c.getCompanyLocation());
		System.out.println("-----------------------------------------------------------\n\n");
		
		for(Department dp: d ) {
			System.out.println("-------------------Department Details----------------------");
			System.out.println("Department Id : " + dp.getDeptId());
			System.out.println("Department Name : " + dp.getDeptName());
			System.out.println("Department Location : " + dp.getDeptLocation());
			System.out.println("-----------------------------------------------------------\n\n");
			
			for(Employee e1 :dp.getEmployee() ) {
				System.out.println("-------------------Employee Details----------------------");
				System.out.println("Emp_Id : " + e1.getEmpId());
				System.out.println("E_Name : " + e1.getEmpName());
				System.out.println("Emp_Sal : " + e1.getSalary());
				System.out.println("---------Address-----------");
				System.out.println("House No.: \t" + e1.getAddress().gethNo());
				System.out.println("Street: \t" + e1.getAddress().getStreet());
				System.out.println("City:   \t" + e1.getAddress().getCity());
				System.out.println("State:  \t" + e1.getAddress().getState());
				System.out.println("----------------------------------------------------------\n\n");
				
			}
			
		}
		
		
		
		
		/*
		System.out.println("Emp_Id : " + e1.getEmpId());
		System.out.println("E_Name : " + e1.getEmpName());
		System.out.println("Emp_Sal : " + e1.getSalary());
		System.out.println("---------Address-----------");
		System.out.println("House No.: \t" + e1.getAddress().gethNo());
		System.out.println("Street: \t" + e1.getAddress().getStreet());
		System.out.println("City:   \t" + e1.getAddress().getCity());
		System.out.println("State:  \t" + e1.getAddress().getState());
		*/
	}

}