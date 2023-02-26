public class Entry {
    public static void main(String[] args) {
        IShape[] shapes = new IShape[3];
        shapes[0] = new Rectangle(3.5, 5.4);
        shapes[1] = new Circle(4.5);
        shapes[2] = new Rectangle(7.5, 4.3);
        for (int i = 0; i < 3; i++) {
            System.out.println("Dien tich[" + i + "]: " + shapes[i].getArea());
            System.out.println("Chu vi[" + i + "]: " + shapes[i].getPerimeter());
        }
    }
}