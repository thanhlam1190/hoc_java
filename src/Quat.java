

public class Quat {
    String  hang;
    String model;
    Float gia;
    Integer congSuat;
    Integer soHienTai;
    Boolean dangQuay;
    public Quat(String hang, String model, Float gia, Integer congSuat){
        this.hang = hang;
        this.model = model;
        this.gia = gia;
        this.congSuat = congSuat;
        this.soHienTai = 0;
        this.dangQuay = false;
    }
    public void bat(){
        this.soHienTai = 1;
        System.out.println("Thuc hien chua nang bat");

    }
    public void tat(){
        this.soHienTai = 0;
        System.out.println("Tat quat");
    }
    public void chuyenSo(int so){
        this.soHienTai =so;
        System.out.println("Chuyen doi so:" + so);
    }
    public void chuyenQuay(){
        if (this.soHienTai == 0)
        {
//            this.dangQuay = false ;
            System.out.println("Chuyen qua trang thai dung yen");
        }else {
//            this.dangQuay = true;
            System.out.println("Chuyen qua trang thai quay");
        }
    }

    @Override
    public String toString() {
        return "Quat{" +
                "hang='" + hang + '\'' +
                ", model='" + model + '\'' +
                ", gia=" + gia +
                ", congSuat=" + congSuat +
                ", soHienTai=" + soHienTai +
                ", dangQuay=" + dangQuay +
                '}';
    }


    public static void main(String[] args) {
//        Quat quat1 = new Quat("Senko", "SLQ-34", 17000.0f, 60);
//        quat1.bat();
//        quat1.chuyenSo(3);
//        quat1.chuyenQuay();
//        System.out.println(quat1);
//
//        Quat quat2 = new Quat("Tosiba", "23-AEM", 220000.0f, 50);
//        quat2.bat();
//        quat2.chuyenSo(2);
//        quat2.chuyenQuay();
//        System.out.println(quat2);

        Quat quat3 = new Quat("Hatari,", "34-RTG", 231341.f, 60);
        quat3.bat();
        quat3.chuyenSo(0);
        quat3.chuyenQuay();
        System.out.println(quat3);
    }
}