public class Entry {
	public static void main(String[] args) {
		IEmployee employee1 = new PartTimeEmployee("Tran Nguyen Trung Truc", 787898, 5);
		IEmployee employee2 = new FullTimeEmployee("Le Thi Phuong Hoa", 787899);
		IEmployee list [] = {employee1, employee2};
		for (IEmployee test : list)
		{
			System.out.println("Ho Va Ten: " + test.getName());
			System.out.println("Luong moi ngay: " + test.calculateSalary());
			System.out.println();
		}
	}
}