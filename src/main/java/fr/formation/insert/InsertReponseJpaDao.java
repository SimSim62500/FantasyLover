package fr.formation.insert;

import fr.formation.dao.IHistoireDao;
import fr.formation.dao.IReponseDao;
import fr.formation.dao.jpa.AbstractDaoJpa;
import fr.formation.dao.jpa.HistoireDaoJpa;
import fr.formation.dao.jpa.ReponseDaoJpa;
import fr.formation.model.Histoire;
import fr.formation.model.Reponse;

public class InsertReponseJpaDao {

	public static void main(String[] args) {
		IReponseDao daoReponse = new ReponseDaoJpa();
//		insertReponse1(daoReponse);
//		insertReponse2(daoReponse);
//		insertReponse3(daoReponse);
//		insertReponse4(daoReponse);
//		insertReponse5(daoReponse);
//		insertReponse6(daoReponse);
//		insertReponse7(daoReponse);
//		insertReponse8(daoReponse);
//		insertReponse9(daoReponse);
//		insertReponse10(daoReponse);
//		insertReponse11(daoReponse);
//		insertReponse12(daoReponse);
//		insertReponse13(daoReponse);
//		insertReponse14(daoReponse);
//		insertReponse15(daoReponse);
//		insertReponse16(daoReponse);
//		insertReponse17(daoReponse);
//		insertReponse18(daoReponse);
//		insertReponse19(daoReponse);
//		insertReponse20(daoReponse);
//		insertReponse21(daoReponse);
//		insertReponse22(daoReponse);
//		insertReponse23(daoReponse);
//		insertReponse24(daoReponse);
		AbstractDaoJpa.close();
	}

	public static void insertReponse1(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix("« AAAAH UN ABORIGENE !!! »");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(3);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse2(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix("« AAAAH UN ABORIGENE !!! »");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(4);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse3(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix("« Vous n’avez cas dormir dans un lit comme tout le monde ! C’est vous le paysan !»");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(3);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse4(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix("« Vous n’avez cas dormir dans un lit comme tout le monde ! C’est vous le paysan !»");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(4);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse5(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix("« Comment allez-vous charmant jeune homme ? »");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(3);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse6(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix("« Comment allez-vous charmant jeune homme ? »");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(4);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse7(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix("« Cela ne vous regarde pas. »");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(11);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse8(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix("« Cela ne vous regarde pas. »");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(12);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse9(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix("« De Tokyo, au Japon… Ceux-ci sont mes habits de lycée » ");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(11);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse10(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix("« De Tokyo, au Japon… Ceux-ci sont mes habits de lycée » ");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(12);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse11(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix("« Ma mère m’a toujours dit de ne pas parler aux inconnus »");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(11);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse12(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix("« Ma mère m’a toujours dit de ne pas parler aux inconnus »");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(12);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse13(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix(
				"« * Ce nom me dit quelque chose… je crois avoir jouée à un jeu du même nom * … Je m’appelle $joueur$ enchantée ». ");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(21);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse14(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix(
				"« * Ce nom me dit quelque chose… je crois avoir joué à un jeu du même nom * … Je m’appelle $joueur$ enchanté ». ");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(22);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse15(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix(
				"« * Ce nom me dit quelque chose… je crois avoir jouée à un jeu du même nom * … Je m’appelle $joueur$ vous êtes content de l’apprendre ? »");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(21);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse16(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix(
				"« * Ce nom me dit quelque chose… je crois avoir joué à un jeu du même nom * … Je m’appelle $joueur$ vous êtes content de l’apprendre ? »");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(22);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse17(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix(
				"« * Ce nom me dit quelque chose… je crois avoir jouée à un jeu du même nom * … $joueur$ *marmonne* ».");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(21);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse18(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix(
				"« * Ce nom me dit quelque chose… je crois avoir jouée à un jeu du même nom * … $joueur$ *marmonne* ».");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(22);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse19(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix("« Je m’appelle $joueur$, maintenant où sommes-nous ?! »");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(23);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse20(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix("« Je m’appelle $joueur$, maintenant où sommes-nous ?! »");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(24);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse21(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix(
				"« Vous êtes vraiment loin d’avoir la classe d’un marquis pour faire un tel chantage… je m’appelle $joueur$ ».");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(23);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse22(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix(
				"« Vous êtes vraiment loin d’avoir la classe d’un marquis pour faire un tel chantage… je m’appelle $joueur$ ».");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(24);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse23(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix("« * marmonne * $joueur$ … ».");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(23);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}

	public static void insertReponse24(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix("« * marmonne * $joueur$ … ».");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(24);
		maReponse.setHistoire(monhistoire);
		daoReponse.save(maReponse);
	}
}
