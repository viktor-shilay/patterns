package main.java.singleton;

public class Logger {

    private static Logger INSTANCE;
    private static String logFile = "This is a log file:)\n";


    public static Logger getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
