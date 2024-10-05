import java.util.ArrayList;
import java.util.List;

public class Stopwatch {
    private long startTime;
    private long stopTime;
    private long elapsedTime;
    private long totalTime;
    private long totalElapsedTime;
    private List<Long> elapsedTimeList = new ArrayList<>();

    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public long getTotalElapsedTime() {
        return totalElapsedTime;
    }

    public void setTotalElapsedTime(long totalElapsedTime) {
        this.totalElapsedTime = totalElapsedTime;
    }

    public List<Long> getElapsedTimeList() {
        return elapsedTimeList;
    }

    public void setElapsedTimeList(List<Long> elapsedTimeList) {
        this.elapsedTimeList = elapsedTimeList;
    }

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        stopTime = System.nanoTime();
    }

    public void addElapsedTime() {
        elapsedTimeList.add(stopTime - startTime);
    }
}
