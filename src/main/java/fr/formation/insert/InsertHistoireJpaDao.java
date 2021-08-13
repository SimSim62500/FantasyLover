package fr.formation.insert;

import fr.formation.dao.IHistoireDao;
import fr.formation.dao.IPersonnageDao;
import fr.formation.dao.jpa.AbstractDaoJpa;
import fr.formation.dao.jpa.HistoireDaoJpa;
import fr.formation.dao.jpa.PersonnageDaoJpa;
import fr.formation.model.Histoire;
import fr.formation.model.Personnage;
import fr.formation.model.Sexe;

public class InsertHistoireJpaDao {

	public static void main(String[] args) {
		IHistoireDao daoHistoire = new HistoireDaoJpa();
//		insertHistoire1(daoHistoire);
//		insertHistoire2(daoHistoire);
//		insertHistoire3(daoHistoire);
//		insertHistoire4(daoHistoire);
//		insertHistoire5(daoHistoire);
//		insertHistoire6(daoHistoire);
//		insertHistoire7(daoHistoire);
//		insertHistoire8(daoHistoire);
//		insertHistoire9(daoHistoire);
//		insertHistoire10(daoHistoire);
//		insertHistoire11(daoHistoire);
//		insertHistoire12(daoHistoire);
//		insertHistoire13(daoHistoire);
//		insertHistoire14(daoHistoire);
//		insertHistoire15(daoHistoire);
//		insertHistoire16(daoHistoire);
//		insertHistoire17(daoHistoire);
//		insertHistoire18(daoHistoire);
//		insertHistoire19(daoHistoire);
//		insertHistoire20(daoHistoire);
//		insertHistoire21(daoHistoire);
//		insertHistoire22(daoHistoire);
//		insertHistoire23(daoHistoire);
//		insertHistoire24(daoHistoire);
//		insertHistoire25(daoHistoire);
//		insertHistoire26(daoHistoire);
//		insertHistoire27(daoHistoire);
//		insertHistoire28(daoHistoire);
		AbstractDaoJpa.close();
	}

	public static void insertHistoire1(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration(
				"Un beau matin de juillet sur le pays du soleil levant, $joueur$ se lève tout doucement, les yeux encore brouillés par les centaines de pages de Mangas et les jeux de dragues qui lui ont bercés sa nuit. $joueur$ regarde l’heure…\n"
						+ "« MINCE JE SUIS EN RETARD POUR LE LYCEE !!! ».\n"
						+ "D’un pas assuré et avec une rapidité digne des plus grands félins, $joueur$ s’habille, se coiffe à une vitesse record. $joueur$ déboule les escaliers paniquée et enfonce la porte d’entrée en criant.\n"
						+ "« MAMAN JE NE MANGE PAS JE SUIS TROP EN RETARD A CE SOIR JE T’AIME ! ».\n" + "………\n"
						+ "Les voitures klaxonnent, les gens se pressent, et fracassent leurs épaules sur les passants adjacents. $joueur$ se faufile du mieux qu’elle peut parmi cette foule en ébullition avec un seul objectif en tête… NE PAS ARRIVER EN RETARD EN COURS DE CHIMIE ! \n"
						+ "« Ce n’est pas possible, le prof ne m’aime pas de base, vu que je passe mon temps à rêvasser en cours si j’arrive en retard c’est la colle assurée… ».\n"
						+ "$joueur$ se jette sur la route, pour passer au feu vert piéton, il vire au rouge … $joueur$ ne le sait pas encore mais sa vie va basculer.\n"
						+ "Un silence… Un interminable silence… Des yeux écarquillés… Un cri… $joueur$ se retourne machinalement en direction du cri, et dans son sillage visuel, éblouie par les feux écarlates… Un camion. \n"
						+ "« Je… ». \n"
						+ "$joueur$ est projetée en l’air… Et puis cette désagréable sensation de froid, et cet engourdissement grandissant. Et puis le noir grandissant, jusqu’à n’être que le simple horizon de $joueur$.\n"
						+ "« J’ai froid… Au secours… A…L’aide… ».\n"
						+ "$joueur$ entend au loin un son, une chanson, comme si quelqu’un l’appeler, un puissant rayon de lumière emplie de chaleur l’aveugle complétement.\n"
						+ "");
		monHistoire.setSexeDuJoueur(Sexe.FEMININ);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire2(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration(
				"Un beau matin de juillet sur le pays du soleil levant, $joueur$ se lève tout doucement, les yeux encore brouillés par les centaines de pages de Mangas et les jeux de dragues qui lui ont bercés sa nuit. $joueur$ regarde l’heure…\n"
						+ "« MINCE JE SUIS EN RETARD POUR LE LYCEE !!! ».\n"
						+ "D’un pas assuré et avec une rapidité digne des plus grands félins, $joueur$ s’habille, se coiffe à une vitesse record. $joueur$ déboule les escaliers paniqué et enfonce la porte d’entrée en criant.\n"
						+ "« MAMAN JE NE MANGE PAS JE SUIS TROP EN RETARD A CE SOIR JE T’AIME ! ».\n" + "………\n"
						+ "Les voitures klaxonnent, les gens se pressent, et fracassent leurs épaules sur les passants adjacents. $joueur$ se faufile du mieux qu’il peut parmi cette foule en ébullition avec un seul objectif en tête… NE PAS ARRIVER EN RETARD EN COURS DE CHIMIE ! \n"
						+ "« Ce n’est pas possible, le prof ne m’aime pas de base, vu que je passe mon temps à rêvasser en cours si j’arrive en retard c’est la colle assurée… ».\n"
						+ "$joueur$ se jette sur la route, pour passer au feu vert piéton, il vire au rouge … $joueur$ ne le sait pas encore mais sa vie va basculer.\n"
						+ "Un silence… Un interminable silence… Des yeux écarquillés… Un cri… $joueur$ se retourne machinalement en direction du cri, et dans son sillage visuel, ébloui par les feux écarlates… Un camion. \n"
						+ "« Je… ». \n"
						+ "$joueur$ est projeté en l’air… Et puis cette désagréable sensation de froid, et cet engourdissement grandissant. Et puis le noir grandissant, jusqu’à n’être que le simple horizon de $joueur$.\n"
						+ "« J’ai froid… Au secours… A…L’aide… ».\n"
						+ "$joueur$ entend au loin un son, une chanson, comme si quelqu’un l’appeler, un puissant rayon de lumière emplie de chaleur l’aveugle complétement.\n"
						+ "");
		monHistoire.setSexeDuJoueur(Sexe.MASCULIN);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire3(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration("CUI…CUI…CUI...\n" + "« Des oiseaux ?!».\n"
				+ "$joueur$ ouvre les yeux machinalement. S’étend là, juste devant, une forêt des plus luxuriantes, les rayons du soleil traversant les feuillages hérissés des arbres rendent à la pelouse un effet tacheté des plus sauvages, le vert omniprésent ravit les yeux et le cœur, et le bruit apaisant des oiseaux, d’un ruisseau au loin rendent à cette endroit une atmosphère des plus charmantes.\n"
				+ "« Où suis-je ? je ne comprends pas je venais de me faire renverser… JE SUIS MORTE, C’EST LE PARADIS !!! AAAAAAAAAAAAAAAAAH !!!».\n"
				+ "« Voulez-vous bien vous taire ! Vous m’avez réveillé maudite paysanne ! ».\n"
				+ "$joueur$ sursaute et se retourne machinalement en direction de la voix.\n"
				+ "Un homme saute d’un arbre… Il est très beau, il possède des yeux de jais avec sur l’œil droit un cache œil, des longs cheveux noirs brillant au soleil, un air mesquin contrastant avec son look très sérieux de majordome.\n"
				+ "");
		monHistoire.setSexeDuJoueur(Sexe.FEMININ);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire4(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration("CUI…CUI…CUI...\n" + "« Des oiseaux ?!».\n"
				+ "$joueur$ ouvre les yeux machinalement. S’étend là, juste devant, une forêt des plus luxuriantes, les rayons du soleil traversant les feuillages hérissés des arbres rendent à la pelouse un effet tacheté des plus sauvages, le vert omniprésent ravit les yeux et le cœur, et le bruit apaisant des oiseaux, d’un ruisseau au loin rendent à cette endroit une atmosphère des plus charmantes.\n"
				+ "« Où suis-je ? je ne comprends pas je venais de me faire renverser… JE SUIS MORT, C’EST LE PARADIS !!! AAAAAAAAAAAAAAAAAH !!!».\n"
				+ "« Voulez-vous bien vous taire ! Vous m’avez réveillé maudit paysan ! ».\n"
				+ "$joueur$ sursaute et se retourne machinalement en direction de la voix.\n"
				+ "Un homme saute d’un arbre… Il est très beau, il possède des yeux de jais avec sur l’œil droit un cache œil, des longs cheveux noirs brillant au soleil, un air mesquin contrastant avec son look très sérieux de majordome.\n"
				+ "");
		monHistoire.setSexeDuJoueur(Sexe.MASCULIN);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire5(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration(
				"« Un aborigène AHAHAHA, je suis un marquis de la famille Vlad je vous signale, je suis Zarg tentée de vous en souvenir manant ».");
		monHistoire.setSexeDuJoueur(Sexe.FEMININ);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire6(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration(
				"« Un aborigène AHAHAHA, je suis un marquis de la famille Vlad je vous signale, je suis Zarg tenté de vous en souvenir manant ».");
		monHistoire.setSexeDuJoueur(Sexe.MASCULIN);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire7(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration(
				"« Je suis un marquis de la famille Vlad je vous signale, je suis Zarg tentée de le retenir pour la prochaine fois, il n’y a que quelqu’un de basse famille pour ne pas reconnaitre mon blason ».");
		monHistoire.setSexeDuJoueur(Sexe.FEMININ);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire8(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration(
				"« Je suis un marquis de la famille Vlad je vous signale, je suis Zarg tenté de le retenir pour la prochaine fois, il n’y a que quelqu’un de basse famille pour ne pas reconnaitre mon blason ».");
		monHistoire.setSexeDuJoueur(Sexe.MASCULIN);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire9(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration(
				"« Rester à votre place ! Je suis un marquis de la famille Vlad je vous signale, je suis Zarg ».");
		monHistoire.setSexeDuJoueur(Sexe.FEMININ);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire10(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration(
				"« Rester à votre place ! Je suis un marquis de la famille Vlad je vous signale, je suis Zarg ».");
		monHistoire.setSexeDuJoueur(Sexe.MASCULIN);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire11(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration(
				"« Vos habits sont tout à fait étrange de quel pays venez-vous ? je n’ai jamais vu de tels attirails ».");
		monHistoire.setSexeDuJoueur(Sexe.FEMININ);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire12(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration(
				"« Vos habits sont tout à fait étrange de quel pays venez-vous ? je n’ai jamais vu de tels attirails ».");
		monHistoire.setSexeDuJoueur(Sexe.MASCULIN);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire13(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration(
				"« Comment me répondez-vous, un être de votre rang devrait être honoré que je lui parle ! ».");
		monHistoire.setSexeDuJoueur(Sexe.FEMININ);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire14(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration(
				"« Comment me répondez-vous, un être de votre rang devrait être honoré que je lui parle ! ».");
		monHistoire.setSexeDuJoueur(Sexe.MASCULIN);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire15(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration(
				"« Hmmm… je ne suis jamais allé à… Tokyo, mais aux vues de vos habits votre peuple doit être assez… spécial ».");
		monHistoire.setSexeDuJoueur(Sexe.FEMININ);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire16(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration(
				"« Hmmm… je ne suis jamais allé à… Tokyo, mais aux vues de vos habits votre peuple doit être assez… spécial ».");
		monHistoire.setSexeDuJoueur(Sexe.MASCULIN);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire17(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration("« Vous êtes bien présomptueuse AHAHAHA ! Vous me plaisez bien ! ».");
		monHistoire.setSexeDuJoueur(Sexe.FEMININ);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire18(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration("« Vous êtes bien présomptueux AHAHAHA ! Vous me plaisez bien ! ».");
		monHistoire.setSexeDuJoueur(Sexe.MASCULIN);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire19(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration("« Mr Vlad où sommes-nous exactement, je ne connais pas cet endroit… ».");
		monHistoire.setSexeDuJoueur(Sexe.FEMININ);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire20(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration("« Mr Vlad où sommes-nous exactement, je ne connais pas cet endroit… ».");
		monHistoire.setSexeDuJoueur(Sexe.MASCULIN);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire21(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration("« Nous sommes dans le monde de Fantasy Lover’s, mais présentez-vous tout de même ».");
		monHistoire.setSexeDuJoueur(Sexe.FEMININ);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire22(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration("« Nous sommes dans le monde de Fantasy Lover’s, mais présentez-vous tout de même ».");
		monHistoire.setSexeDuJoueur(Sexe.MASCULIN);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire23(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration(
				"« Ma mère m’a également dit de ne jamais parler aux inconnus, peut être que je daignerai vous répondre si vous faites preuves de meilleur volonté ».");
		monHistoire.setSexeDuJoueur(Sexe.FEMININ);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire24(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration(
				"« Ma mère m’a également dit de ne jamais parler aux inconnus, peut être que je daignerai vous répondre si vous faites preuves de meilleur volonté ».");
		monHistoire.setSexeDuJoueur(Sexe.MASCULIN);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire25(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration("«Bienvenue à vous $joueur$ ! ».");
		monHistoire.setSexeDuJoueur(Sexe.FEMININ);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire26(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration("«Bienvenue à vous $joueur$ ! ».");
		monHistoire.setSexeDuJoueur(Sexe.MASCULIN);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire27(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration("« Eh bien nous sommes dans le monde de Fantasy Lover’s Bienvenue ! ».");
		monHistoire.setSexeDuJoueur(Sexe.FEMININ);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

	public static void insertHistoire28(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration("« Eh bien nous sommes dans le monde de Fantasy Lover’s Bienvenue ! ».");
		monHistoire.setSexeDuJoueur(Sexe.MASCULIN);
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		Personnage monPersonnage = daoPersonnage.findById(1);
		monHistoire.setPersonnage(monPersonnage);
		daoHistoire.save(monHistoire);
	}

}
