package Task11;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("prototype")
@Service
public class LoggerService {

    public static int instanceCount;

    public LoggerService() {
        instanceCount++;
    }


    public void logInfo(String msg) {
        System.out.println("INFO: " + msg);
    }

    public void logError(String msg) {
        System.out.println("Error: " + msg);
    }
}
