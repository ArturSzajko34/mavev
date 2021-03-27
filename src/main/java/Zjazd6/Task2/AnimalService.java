package Zjazd6.Task2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    private Animal animal;


    public AnimalService(@Qualifier("pies") Animal animal) {
        this.animal = animal;
    }

    public void eat(){
        animal.eat();
    }
}
