public class Logme {

    final String[] severity = {"EMERGENCY", "ALERT", "CRITICAL", "ERROR", "WARNING", "NOTIFICATION", "INFORMATIONAL", "DEBUGGING"};
    final String[] environments = {"DEBUGGING", "STAGING", "PRODUCTION"};

    final String EMERGENCY = "EMERGENCY";
    final String ALERT = "ALERT";
    final String CRITICAL = "CRITICAL";
    final String ERROR = "ERROR";
    final String WARNING = "WARNING";
    final String NOTIFICATION = "NOTIFICATION";
    final String INFORMATIONAL = "INFORMATIONAL";
    final String DEBUGGING = "DEBUGGING";

    final String STAGING = "STAGING";
    final String PRODUCTION = "PRODUCTION";

    

    private String session;
    private String tag;
    private String environment;

    public Logme(String environment, String tag, String session) {
        this.session = session;
        this.tag = tag;
        this.environment = environment;
    }

    private static void log(String environment, String tag, String session, String severity, String message){
        
    }


    public static void emergency(String message){

    }

    public static void alert(String message){

    }

    public static void warn(String message){

    }

    public static void nofify(String message){

    }

    public static void info(String message){

    }

    public static void debug(String message){

    }


}
