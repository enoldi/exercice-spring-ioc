package fr.zaroumia.formation.spring._003;

import fr.zaroumia.formation.spring.service.FormationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main003 {

    public static void main(String[] args) {
        //Creer l'intance de l'application
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_003.xml");

        //Recuperer le bean FormationService
        FormationService formationService = applicationContext.getBean(FormationService.class);

        //Appeler la methode
        System.out.println(formationService.findAll());
    }
}
