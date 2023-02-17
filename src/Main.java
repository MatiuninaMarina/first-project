public class Main {
    public static void main(String [] args) {
        int[] sales = new int[] {1, 2, 300, 200};
        SalesManager salesManager = new SalesManager(sales);

        int max = salesManager.max();
        int min = salesManager.min();
        int average = salesManager.average();

        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
    }
}
