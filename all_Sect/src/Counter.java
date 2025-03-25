public class Counter {
    private static int count = 0;

    public Counter() {
        count++; //increment the static variable count by 1
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        System.out.println(Counter.getCount());
    }
}
