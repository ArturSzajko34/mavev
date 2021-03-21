package Task10;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneRepository {

    private LoggerService loggerService;

    public SmartphoneRepository(LoggerService loggerService) {
        this.loggerService = loggerService;
        loggerService.logInfo("SmartphoneRepository");
    }

    public List<Smartphone> getSmarthPones() {
        loggerService.logInfo("getSmarthPones");
        List<Smartphone> phone = new ArrayList<>();
        phone.add(new Smartphone(Brand.HTC));
        phone.add(new Smartphone(Brand.NOKIA));
        phone.add(new Smartphone(Brand.SIEMENS));

        return phone;
    }
}
