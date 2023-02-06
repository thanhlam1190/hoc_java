class xe_may {
    String hang;
    String model;
    Float gia;
    String dung_Tich;
    String chu_Xe;
    Integer so_Km;
    public xe_may(){}
    public xe_may(String hang, String model, Float gia, String dung_Tich, String chu_Xe, Integer so_Km) {
        this.hang = hang;
        this.model = model;
        this.gia = gia;
        this.dung_Tich = dung_Tich;
        this.chu_Xe = chu_Xe;
        this.so_Km = so_Km;
    }
    public void danh_gia() {
        if (this.so_Km > 20000) {
            System.out.println("Xe cũ");
        } else if (this.so_Km < 300) {
            System.out.println("Xe mới");
        }else
        {
            System.out.println("Xe còn khá mới");
        }
    }
    public void thong_tin() {

        System.out.println("Chủ xe là: " + this.chu_Xe);

        System.out.println("Hãng xe là: " + this.hang);

        System.out.println("Model: " + this.model);

        System.out.println("Giá: " + this.gia);

        System.out.println("Dung tích của xe: " + this.dung_Tich);
    }
}
public class bai_tap_xe_may{
    public static void main(String[] args) {
        xe_may xe1 = new xe_may("Suzuki", "43RTX", 220000.0f, "100cc", "Lam", 350);
        xe1.thong_tin();
        xe1.danh_gia();
    }
}

