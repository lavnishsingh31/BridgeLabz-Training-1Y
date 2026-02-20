
public class Problem3 {
    private static StringBuffer sharedBuffer = new StringBuffer();
    
    static class ServiceThread extends Thread {
        private String serviceName;
        private int sleepTime;
        
        public ServiceThread(String serviceName, int sleepTime) {
            this.serviceName = serviceName;
            this.sleepTime = sleepTime;
        }
        
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                String timestamp = java.time.LocalTime.now().toString();
                String level = (i % 3 == 0) ? "ERROR" : (i % 2 == 0) ? "WARNING" : "INFO";
                String message = "Log entry " + i + " from " + serviceName;
                
                synchronized (sharedBuffer) {
                    sharedBuffer.append("[")
                                .append(timestamp)
                                .append("] [")
                                .append(serviceName)
                                .append("] [")
                                .append(level)
                                .append("] ")
                                .append(message)
                                .append("\n");
                }
                
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Problem 3: Multi-threaded Log Aggregator
        ServiceThread webServer = new ServiceThread("Web Server", 100);
        ServiceThread database = new ServiceThread("Database", 150);
        ServiceThread cache = new ServiceThread("Cache", 80);
        ServiceThread apiGateway = new ServiceThread("API Gateway", 120);
        
        webServer.start();
        database.start();
        cache.start();
        apiGateway.start();
        
        try {
            webServer.join();
            database.join();
            cache.join();
            apiGateway.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Consolidated Logs:");
        System.out.println(sharedBuffer.toString());
        System.out.println("Total Log Size: " + sharedBuffer.length() + " characters");
    }
}
