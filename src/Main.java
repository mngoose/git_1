public class Main {
    public static void main(String[] args) {
        long [] sales = { 100 , 30 , 410 , 15 };
        SalesManager manager = new SalesManager(sales);
        System.out.println("Max: " + manager.max());


    }
}
