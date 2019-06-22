package fr.zaroumia.formation.spring._002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main002 {

    public static void main(String[] args) {
        //On cree une instance de la classe applicationContext
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_002.xml");

        applicationContext.setDisplayName("Context Application");
        //On recupere le bean
        MonBean monBean = applicationContext.getBean(MonBean.class);

        //Appeler la methode
        monBean.helloWord();
    }
}
