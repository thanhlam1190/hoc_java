public class PizzaClient {

    public void run() {
        Pizza round = new Pizza (3.89, new Circle (2.4));
        Pizza rect =  new Pizza (4.96, new Rectangle (5, 3));
        PizzaDeal pd = new PizzaDeal();
        System.out.println(round.getShape() + " is a better deal than " + rect.getShape() + ": " +
                pd.betterDeal(round, rect));
    }
    public static void main (String[] nu) {
        new PizzaClient().run();
    }
}