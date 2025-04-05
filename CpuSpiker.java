public class CpuSpiker {
    public static void main(String[] args) {
        // Number of threads to create
        int numThreads = Runtime.getRuntime().availableProcessors();
        
        for (int i = 0; i < numThreads; i++) {
            new Thread(new CpuTask()).start();
        }
    }
}

class CpuTask implements Runnable {
    @Override
    public void run() {
        while (true) {
            // Perform a CPU-intensive task
            double value = Math.random() * Math.random();
        }
    }
}
