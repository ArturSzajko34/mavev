package Zjazd5.Task11;

import org.springframework.stereotype.Component;

@Component
public class LoggerService {


    public void logInfo(String msg) {
        System.out.println("INFO: " + msg);
    }

    public void logError(String msg) {
        System.out.println("Error: " + msg);
    }
}
