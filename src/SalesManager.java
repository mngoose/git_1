public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int min() {
        int min = Integer.MIN_VALUE;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
        int sum = 0;
        for (int : sale = sales) {
            sum += sale;
        }
        return (sum - min() - max()) / (sales.lenght - 2);
    }

    public int avgTrimmed () {
    }
}