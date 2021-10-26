
package oop;


public class taxmanagement {
    public static void main(String[] args) {
		
		Student student = new Student("11-09-2001", 'A', 0);
		Worker worker = new Worker("04-09-2001", 'O', 0);
		BusinessPerson bus = new BusinessPerson("13-09-2000",'C', 1);
		
		student.setName("Hung");
		student.setStudentId("20T1080012");
		student.setGender(0);
		
		worker.setName("Tu");
		worker.setGender(0);
		worker.setSalary(350000);
		worker.setOther_income(500000);
		
		bus.setName("Huyen");
		bus.setGender(1);
		bus.setSalary(54000000);
		bus.setOther_income(1000000000);
		bus.setBusiness_income(12000000);
		
		//
		System.out.println(student.getName());
		System.out.println(student.payTax(3000000, "11-09-2021", "11-09-2021"));
		System.out.println(worker.getName());
		System.out.println(worker.payTax(worker.getSalary() + worker.getOther_income(), "11-09-2021", "11-09-2021"));
		System.out.println(bus.getName());
		System.out.println(bus.payTax(bus.getSalary() + bus.getOther_income() + bus.getBusiness_income(), "11-09-2021", "11-09-2021"));
	}

}
