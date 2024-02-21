package static00.ex;

public class Logger {

    static String logLevel = "INFO";


    public static void logInfo(String info) {
        if (logLevel.equals("ERROR")) {
            System.out.println("[INFO] ERROR 레벨이 세팅되었을 때 출력되는 INFO 메시지입니다.");
        } else {
            System.out.println("[INFO] " + info);
        }
    }

    public static void logError(String info) {
        if (logLevel.equals("ERROR")) {
            System.out.println("[ERROR] " + info);
        } else {
            return;
        }
    }

    public static void setLogLevel(String logLevel) {
        Logger.logLevel = logLevel;
    }
}
