
public class Employe {
		private int empNo;
		private String eName;
		private String company;
		private int salary;
		public Employe(int empNo, String eName, String company, int salary) {
			super();
			this.empNo = empNo;
			this.eName = eName;
			this.company = company;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employe [empNo=" + empNo + ", eName=" + eName + ", company=" + company + ", salary=" + salary + "]";
		}
		public int getEmpNo() {
			return empNo;
		}
		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}
		public String geteName() {
			return eName;
		}
		public void seteName(String eName) {
			this.eName = eName;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		
		

	}

