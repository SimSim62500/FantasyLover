package fr.formation.insert;

import fr.formation.dao.IHistoireDao;
import fr.formation.dao.INavigationDao;
import fr.formation.dao.IReponseDao;
import fr.formation.dao.jpa.AbstractDaoJpa;
import fr.formation.dao.jpa.HistoireDaoJpa;
import fr.formation.dao.jpa.NavigationDaoJpa;
import fr.formation.dao.jpa.ReponseDaoJpa;
import fr.formation.model.Histoire;
import fr.formation.model.Navigation;
import fr.formation.model.OrientationSexuelle;
import fr.formation.model.Reponse;
import fr.formation.model.Sexe;

public class InsertNavigationJpaDao {

	public static void main(String[] args) {
		INavigationDao daoNavigation = new NavigationDaoJpa();
//		insertNavigation1(daoNavigation);
//		insertNavigation2(daoNavigation);
//		insertNavigation3(daoNavigation);
//		insertNavigation4(daoNavigation);
//		insertNavigation5(daoNavigation);
//		insertNavigation6(daoNavigation);
//		insertNavigation7(daoNavigation);
//		insertNavigation8(daoNavigation);
//		insertNavigation9(daoNavigation);
//		insertNavigation10(daoNavigation);
//		insertNavigation11(daoNavigation);
//		insertNavigation12(daoNavigation);
//		insertNavigation13(daoNavigation);
//		insertNavigation14(daoNavigation);
//		insertNavigation15(daoNavigation);
//		insertNavigation16(daoNavigation);
//		insertNavigation17(daoNavigation);
//		insertNavigation18(daoNavigation);
//		insertNavigation19(daoNavigation);
//		insertNavigation20(daoNavigation);
//		insertNavigation21(daoNavigation);
//		insertNavigation22(daoNavigation);
//		insertNavigation23(daoNavigation);
//		insertNavigation24(daoNavigation);
//		insertNavigation25(daoNavigation);
//		insertNavigation26(daoNavigation);
//		insertNavigation27(daoNavigation);
//		insertNavigation28(daoNavigation);
//		insertNavigation29(daoNavigation);
//		insertNavigation30(daoNavigation);
//		insertNavigation31(daoNavigation);
//		insertNavigation32(daoNavigation);
//		insertNavigation33(daoNavigation);
//		insertNavigation34(daoNavigation);
//		insertNavigation35(daoNavigation);
//		insertNavigation36(daoNavigation);
//		insertNavigation37(daoNavigation);
//		insertNavigation38(daoNavigation);
//		insertNavigation39(daoNavigation);
//		insertNavigation40(daoNavigation);
//		insertNavigation41(daoNavigation);
//		insertNavigation42(daoNavigation);
//		insertNavigation43(daoNavigation);
//		insertNavigation44(daoNavigation);
//		insertNavigation45(daoNavigation);
//		insertNavigation46(daoNavigation);
//		insertNavigation47(daoNavigation);
//		insertNavigation48(daoNavigation);
//		insertNavigation49(daoNavigation);
//		insertNavigation50(daoNavigation);
//		insertNavigation51(daoNavigation);
//		insertNavigation52(daoNavigation);
//		insertNavigation53(daoNavigation);
//		insertNavigation54(daoNavigation);
//		insertNavigation55(daoNavigation);
//		insertNavigation56(daoNavigation);
//		insertNavigation57(daoNavigation);
//		insertNavigation58(daoNavigation);
//		insertNavigation59(daoNavigation);
//		insertNavigation60(daoNavigation);
//		insertNavigation61(daoNavigation);
//		insertNavigation62(daoNavigation);
//		insertNavigation63(daoNavigation);
//		insertNavigation64(daoNavigation);
//		insertNavigation65(daoNavigation);
//		insertNavigation66(daoNavigation);
//		insertNavigation67(daoNavigation);
//		insertNavigation68(daoNavigation);
//		insertNavigation69(daoNavigation);
//		insertNavigation70(daoNavigation);
//		insertNavigation71(daoNavigation);
//		insertNavigation72(daoNavigation);
//		insertNavigation73(daoNavigation);
//		insertNavigation74(daoNavigation);
//		insertNavigation75(daoNavigation);
//		insertNavigation76(daoNavigation);
//		insertNavigation77(daoNavigation);
//		insertNavigation78(daoNavigation);
//		insertNavigation79(daoNavigation);
//		insertNavigation80(daoNavigation);
//		insertNavigation81(daoNavigation);
//		insertNavigation82(daoNavigation);
//		insertNavigation83(daoNavigation);
//		insertNavigation84(daoNavigation);
//		insertNavigation85(daoNavigation);
//		insertNavigation86(daoNavigation);
//		insertNavigation87(daoNavigation);
//		insertNavigation88(daoNavigation);
//		insertNavigation89(daoNavigation);
//		insertNavigation90(daoNavigation);
//		insertNavigation91(daoNavigation);
//		insertNavigation92(daoNavigation);
//		insertNavigation93(daoNavigation);
//		insertNavigation94(daoNavigation);
//		insertNavigation95(daoNavigation);
//		insertNavigation96(daoNavigation);
//		insertNavigation97(daoNavigation);
//		insertNavigation98(daoNavigation);
//		insertNavigation99(daoNavigation);
//		insertNavigation100(daoNavigation);
//		insertNavigation101(daoNavigation);
//		insertNavigation102(daoNavigation);
//		insertNavigation103(daoNavigation);
//		insertNavigation104(daoNavigation);
//		insertNavigation105(daoNavigation);
//		insertNavigation106(daoNavigation);
//		insertNavigation107(daoNavigation);
//		insertNavigation108(daoNavigation);
//		insertNavigation109(daoNavigation);
//		insertNavigation110(daoNavigation);
//		insertNavigation111(daoNavigation);
//		insertNavigation112(daoNavigation);
//		insertNavigation113(daoNavigation);
//		insertNavigation114(daoNavigation);
//		insertNavigation115(daoNavigation);
//		insertNavigation116(daoNavigation);
//		insertNavigation117(daoNavigation);
//		insertNavigation118(daoNavigation);
//		insertNavigation119(daoNavigation);
//		insertNavigation120(daoNavigation);
//		insertNavigation121(daoNavigation);
//		insertNavigation122(daoNavigation);
//		insertNavigation123(daoNavigation);
//		insertNavigation124(daoNavigation);
//		insertNavigation125(daoNavigation);
//		insertNavigation126(daoNavigation);
		AbstractDaoJpa.close();

	}

	public static void insertNavigation1(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(1);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(3);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation2(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(1);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(3);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation3(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(1);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(3);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation4(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(2);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(4);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation5(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(2);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(4);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation6(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(2);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(4);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation7(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(3);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(5);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation8(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(3);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(5);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation9(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(3);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(5);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation10(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(4);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(6);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation11(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(4);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(6);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation12(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(4);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(6);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation13(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(5);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(7);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation14(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(5);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(7);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation15(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(5);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(7);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation16(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(6);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(8);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation17(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(6);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(8);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation18(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(6);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(8);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation19(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(7);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(9);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation20(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(7);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(9);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation21(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(7);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(9);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation22(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(8);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(10);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation23(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(8);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(10);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation24(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(8);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(10);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation25(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(9);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(9);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation26(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(9);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(9);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation27(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(9);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(9);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation28(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(10);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(10);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation29(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(10);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(10);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation30(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(10);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(10);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation31(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(11);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(9);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation32(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(11);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(9);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation33(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(11);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(9);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation34(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(12);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(10);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation35(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(12);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(10);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation36(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(12);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(10);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation37(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(13);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(11);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation38(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(13);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(11);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation39(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(13);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(11);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation40(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(14);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(12);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation41(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(14);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(12);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation42(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(14);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(12);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation43(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(15);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(11);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation44(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(15);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(11);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation45(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(15);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(11);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation46(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(16);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(12);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation47(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(16);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(12);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation48(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(16);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(12);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation49(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(17);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(11);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation50(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(17);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(11);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation51(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(17);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(11);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation52(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(18);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(12);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation53(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(18);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(12);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation54(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(18);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(12);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation55(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(19);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(13);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation56(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(19);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(13);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation57(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(19);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(13);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation58(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(20);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(14);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation59(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(20);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(14);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation60(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(20);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(14);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation61(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(21);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(13);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation62(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(21);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(13);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation63(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(21);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(13);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation64(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(22);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(14);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation65(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(22);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(14);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation66(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(22);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(14);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation67(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(23);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(13);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation68(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(23);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(13);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation69(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(23);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(13);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation70(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(24);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(14);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation71(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(24);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(14);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation72(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(24);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(14);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation73(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(25);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation74(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(25);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation75(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(25);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation76(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(26);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation77(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(26);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation78(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(26);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation79(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(27);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation80(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(27);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation81(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(27);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation82(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(28);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation83(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(28);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation84(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(28);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation85(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(29);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation86(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(29);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation87(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(29);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation88(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(30);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation89(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(30);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation90(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(30);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation91(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(31);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation92(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(31);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation93(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(31);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation94(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(32);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation95(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(32);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation96(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(32);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation97(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(33);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation98(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(33);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation99(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(33);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation100(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(34);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation101(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(34);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation102(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(34);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation103(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(35);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation104(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(35);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation105(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(35);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(15);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation106(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(36);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation107(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(36);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation108(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(36);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(16);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation109(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(37);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(17);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation110(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(37);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(17);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation111(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(37);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(17);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation112(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(38);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(18);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation113(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(38);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(18);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation114(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(38);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(18);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation115(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(39);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(17);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation116(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(39);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(17);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation117(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(39);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(17);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation118(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(40);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(18);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation119(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(40);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(18);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation120(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(40);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(18);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation121(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(41);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(17);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation122(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(41);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(17);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation123(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.FEMININ);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(41);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(17);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation124(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(42);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(18);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation125(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.HOMO);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(42);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(18);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

	public static void insertNavigation126(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();
		maNavigation.setOrientationSexelle(OrientationSexuelle.BI);
		maNavigation.setSexeDuJoueur(Sexe.MASCULIN);

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(42);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(18);
		maNavigation.setHistoireRedirigee(monHistoire);

		daoNavigation.save(maNavigation);
	}

}
