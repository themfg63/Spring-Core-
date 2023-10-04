package yte.intern.springcore;

import org.springframework.stereotype.Component;

@Component //spring classların hepsini tarar ve @Component anatasyonu olan classları Spring bean'ine dönüştürür.
public class ComponentTest {

    public void print(){
        System.out.println("Ben component bean'iyim");
    }
}
