package yte.intern.springcore;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionBean {

    public void print(){
        System.out.println("Ben bir Constructor injection Bean'iyim");
    }
}
