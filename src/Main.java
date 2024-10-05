import java.util.Scanner;

public static void main(String[] args) throws InterruptedException {
    Scanner sc = new Scanner(System.in);
    Stopwatch stopwatch = new Stopwatch();
    while (true) {
        if (sc.nextLine().equals(" ")) {
            stopwatch.start();
            Thread.sleep(1000);
            stopwatch.stop();
            stopwatch.addElapsedTime();
        }

        if (sc.nextLine().equals("b")) {
            break;
        }
    }
    stopwatch.getElapsedTimeList().forEach(System.out::println);
    sc.close();
}