package Zjazd5.Task7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Maine {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("Zjazd5/Task7");
        context.refresh();

        ShopService shopService = context.getBean("shopService", ShopService.class);
        shopService.order("Artur",Brand.HTC);
        shopService.order("Jaro", Brand.NOKIA);

    }
}
