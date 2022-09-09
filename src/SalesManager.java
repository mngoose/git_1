public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

<<<<<<< HEAD
    public long min() {
        long min = Long.MAX_VALUE;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
=======
    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
>>>>>>> longer
            }
        }
        return min;
        long sum = 0;
        for (long : sale = sales) {
            sum += sale;
        }
        return (sum - min() - max()) / (sales.lenght - 2);
    }

    public int avgTrimmed () {
    }
}