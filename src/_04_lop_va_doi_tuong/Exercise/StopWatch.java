package _04_lop_va_doi_tuong.Exercise;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class StopWatch {
    private Instant startTime;
    private Instant endTime;

    public Instant getStartTime() {
        return this.startTime;
    }

    public Instant getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = Instant.now();
    }

    public void end() {
        this.endTime = Instant.now();
    }

    public long getElapsedTime() {
        long times = Duration.between(startTime, endTime).toMillis();
        return times;
    }

    public static void main(String[] args) {
        StopWatch example = new StopWatch();
        example.start();
        int array[] = new int[100000];
        int randomNum;
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            randomNum = random.nextInt();
            array[i] = randomNum;
        }
        example.end();
        System.out.println(example.getElapsedTime() + " milliseconds");
    }
}
