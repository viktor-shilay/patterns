package java.singleton;

public class LoggerRunner {
    public static void main(String[] args) {
//        System.out.println(Logger.getInstance().toString());     Same
//        System.out.println(Logger.getInstance().toString());         objects...
        Logger.getInstance().addLogInfo("First log...");
        Logger.getInstance().addLogInfo("Second log...");
        Logger.getInstance().addLogInfo("Third log...");
        Logger.getInstance().showLogFile();
    }
}
