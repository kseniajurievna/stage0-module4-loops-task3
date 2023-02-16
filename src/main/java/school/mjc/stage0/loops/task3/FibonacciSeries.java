package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int previous = 0;
        int current = 1;
        while (current <= lastFibonacci) {
            //1 1 2 3 5
            System.out.println(current);
            int temporary = current;
            current = current + previous;
            previous = temporary;
        }
    }
}