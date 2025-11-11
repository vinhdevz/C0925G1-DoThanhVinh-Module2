package ss4_class_and_oop_to_java.bai_tap;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        System.out.println("Bắt đầu đếm");
        sw.start();

        for (int i = 0; i < 100_000; i++) {
            Math.pow(i, 2);
        }

        sw.stop();
        System.out.println("Thời gian đã trôi qua: " + sw.getElapsedTime() + "milliseconds");
    }
}
