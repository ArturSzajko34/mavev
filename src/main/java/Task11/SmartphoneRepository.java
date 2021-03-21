package Task11;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SmartphoneRepository {

    private LoggerService loggerService;

    @Autowired
    public SmartphoneRepository(LoggerService loggerService) {
        this.loggerService = loggerService;
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
