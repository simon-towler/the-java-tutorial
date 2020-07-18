import java.util.function.IntConsumer;

/**
 * Custom class to provide parameters for .collect reduction and average a stream.
 */

class Averager implements IntConsumer {
    private int total = 0;
    private int count = 0;

    public double average() {
        return count > 0 ? ((double) total)/count : 0;
    }

    // implemnt the functional method from the IntConsumer interface
    public void accept(int i) {
        total += i;
        count++;
    }

    public void combine(Averager other) {
        total += other.total;
        count += other.count;
    }

}