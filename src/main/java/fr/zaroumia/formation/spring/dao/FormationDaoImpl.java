package fr.zaroumia.formation.spring.dao;

import fr.zaroumia.formation.spring.modele.Formation;

import java.util.ArrayList;
import java.util.List;

;

public class FormationDaoImpl implements FormationDao {

	public FormationDaoImpl() {
		System.out.println("FormationDaoImpl : constructeur par defaut ");

	}

	@Override
	public String quiSuisJe() {
		return " je suis une impl�mentation de FormationDao ";
	}

	@Override
	public List<Formation> findAll() {
		// on va ex�cuter une requ�te pour r�cup�rer la liste des formations en
		// BD
		Formation formation1 = new Formation(1L, "Spring : Etape par �tape pour devenir professionnel",
				"un descriptif");
		Formation formation2 = new Formation(2L, "Hibernate : Etape par �tape pour devenir professionnel",
				"un descriptif");
		Formation formation3 = new Formation(3L, "JPA : Etape par �tape pour devenir professionnel", "un descriptif");
		List<Formation> formations = new ArrayList<>();
		formations.add(formation1);
		formations.add(formation2);
		formations.add(formation3);
		return formations;
	}

}
