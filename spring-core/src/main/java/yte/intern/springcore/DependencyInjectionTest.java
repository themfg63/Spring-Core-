package yte.intern.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionTest {
    /* Kullanım sıralaması
    1. Constructor Injection
    2. Setter Injection
    3. Field Injection
     */

    //FIELD INJECTION
    @Autowired
    public FieldInjectionBean fieldInjectionBean;

    //SETTER INJECTION
    public SetterInjectionBean setterInjectionBean;

    @Autowired
    public void setSetterInjectionBean(SetterInjectionBean setterInjectionBean) {
        this.setterInjectionBean = setterInjectionBean;
    }

    //CONSTRUCTOR INJECTION
    public ConstructorInjectionBean constructorInjectionBean;

    @Autowired
    public DependencyInjectionTest(ConstructorInjectionBean constructorInjectionBean){
        this.constructorInjectionBean=constructorInjectionBean;
    }

    public void print(){
        fieldInjectionBean.print();
        setterInjectionBean.print();
        constructorInjectionBean.print();
    }
}
