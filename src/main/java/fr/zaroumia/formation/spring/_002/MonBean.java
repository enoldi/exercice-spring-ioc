package fr.zaroumia.formation.spring._002;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MonBean implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public void helloWord(){
        System.out.println("Hello world from " + applicationContext.getDisplayName() );
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.applicationContext = applicationContext;

    }
}
