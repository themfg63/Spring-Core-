package yte.intern.springcore;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleBean {
    @PostConstruct
    public void  init(){
        System.out.println("Init içendeyim");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy içerisindeyim");
    }

    public LifeCycleBean(){
        System.out.println("Constructor içindeyim");
    }

    public void print(){
        System.out.println("Print içindeyim");
    }
}
