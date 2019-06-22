package fr.zaroumia.formation.spring._008;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main008 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_008.xml");
        MaClasseSingleton maClasseSingleton = applicationContext.getBean(MaClasseSingleton.class);
        maClasseSingleton.quiSuisJe();

        BeanACree beanACree = applicationContext.getBean(BeanACree.class);
        beanACree.quiJeSuis();
    }
}
