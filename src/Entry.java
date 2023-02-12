public class Entry {
    public static void main(String[] args) {
        student s = new student("Linh", 18, "Dong Hoi", 6.0);
        s.display();
        System.out.println();
        Teacher t = new Teacher("Huong", 27, "Ho Chi Minh", 45200);
        t.display();
    }
}