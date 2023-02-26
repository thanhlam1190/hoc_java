public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        // TODO Auto-generated method stub
        return 8 * getPaymentPerHour();
    }
 
}
