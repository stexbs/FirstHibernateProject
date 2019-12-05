package automobili;

import java.util.ArrayList;
import java.util.List;

import controller.HibernateDAO;
import model.Car;
import model.Kupac;
import model.Prodavac;
import model.User;
import model.VisitCard;
import model.VrstaVozila;

public class GlavnaHibernateKlasa {

	public static void main(String[] args) {
		
		HibernateDAO dao = new HibernateDAO();
		
		
		
		
		
		
		/*
		 * User kupac = dao.vratiUsera(4);
		 * 
		 * Car car1 = dao.vratiAuto(1); Car car2 = dao.vratiAuto(2);
		 * 
		 * List<Car> automobili = new ArrayList<Car>(); automobili.add(car1);
		 * automobili.add(car2);
		 * 
		 * dao.spojiUseraIcar(kupac, automobili);
		 */
		 
		 
		
		
		
		/*
		 * VisitCard vizitKarta = new VisitCard(); vizitKarta.setIme("Sone");
		 * vizitKarta.setEmail("nenad@gmail.com");
		 * vizitKarta.setBrojTelefona("064111333");
		 * 
		 * List<VisitCard> kartice = new ArrayList<VisitCard>();
		 * kartice.add(vizitKarta);
		 * 
		 * Kupac kupac = new Kupac(); kupac.setUserName("Nenad");
		 * kupac.setPassword("nenad123"); kupac.setNovcanik(3000000);
		 * kupac.setJmbg("9876543210987"); kupac.setVisitCards(kartice);
		 * 
		 * dao.snimiUseraUbazu(kupac);
		 * 
		 * Car car1 = new Car(); car1.setMarka("Fiat"); car1.setModel("Punto");
		 * car1.setGodiste(2005); car1.setCena(3000); car1.setRegistracija(true);
		 * car1.setVrstaVozila(VrstaVozila.PUTNICKO);
		 * 
		 * Car car2 = new Car(); car2.setMarka("BMW"); car2.setModel("740");
		 * car2.setGodiste(2018); car2.setCena(50000); car2.setRegistracija(true);
		 * car2.setVrstaVozila(VrstaVozila.PUTNICKO);
		 * 
		 * dao.snimiAutoUbazu(car1); dao.snimiAutoUbazu(car2);
		 */
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Car auto1 = dao.vratiAuto(1); Car auto2 = dao.vratiAuto(2);
		 * 
		 * List<Car> ruziniAutici = new ArrayList<Car>(); ruziniAutici.add(auto1);
		 * ruziniAutici.add(auto2);
		 * 
		 * User user = dao.vratiUsera(1);
		 * 
		 * if(dao.daLiUserImaDovoljnoParaZaAutomobile(user, ruziniAutici)) {
		 * dao.spojiUseraIcar(user, ruziniAutici); }
		 */
		 
		
		
		
		/*
		 * Car car1 = new Car("crysler","300c",2019,35000,false,VrstaVozila.PUTNICKO);
		 * Car car2 = new Car("dodge","caliber",2017,10000,false,VrstaVozila.PUTNICKO);
		 * Car car3 = new Car("lexus","lc500",2019,110000,true,VrstaVozila.PUTNICKO);
		 * Car car4 = new Car("Lada","niva",2019,19000,false,VrstaVozila.TERENAC);
		 * 
		 * dao.snimiAutoUbazu(car1); dao.snimiAutoUbazu(car2); dao.snimiAutoUbazu(car3);
		 * dao.snimiAutoUbazu(car4);
		 * 
		 * 
		 * VisitCard visitCard1 = new VisitCard(); visitCard1.setIme("ruzica");
		 * visitCard1.setEmail("ruza@gmail.com");
		 * visitCard1.setBrojTelefona("0641234567");
		 * 
		 * VisitCard visitCard2 = new VisitCard(); visitCard2.setIme("ruzica");
		 * visitCard2.setEmail("ruza2@gmail.com");
		 * visitCard2.setBrojTelefona("061987654");
		 * 
		 * List<VisitCard> vizitke = new ArrayList<VisitCard>();
		 * vizitke.add(visitCard1); vizitke.add(visitCard2);
		 * 
		 * 
		 * User user = new User();
		 * 
		 * user.setUserName("Ruza"); user.setPassword("ruza123");
		 * user.setNovcanik(200000); user.setVisitCards(vizitke);
		 * 
		 * dao.snimiUseraUbazu(user);
		 */
		
		
		/*
		 * User user = dao.vratiUsera(1); System.out.println("Zdravo " +
		 * user.getUserName());
		 * 
		 * dao.izlistajAutomobile(user);
		 */
		
		/*
		 * Car auto1 = dao.vratiAuto(2); Car auto2 = dao.vratiAuto(3); Car auto3 =
		 * dao.vratiAuto(5);
		 * 
		 * List<Car> ruziniAutomobili = new ArrayList<Car>();
		 * 
		 * ruziniAutomobili.add(auto1); ruziniAutomobili.add(auto2);
		 * ruziniAutomobili.add(auto3);
		 * 
		 * 
		 * if(dao.daLiUserImaDovoljnoParaZaAutomobile(user, ruziniAutomobili)) {
		 * 
		 * dao.spojiUseraIcar(user, ruziniAutomobili); }
		 */
		
		
		
		/*
		 * Car car1 = new Car("crysler","300c",2019,35000,false,VrstaVozila.PUTNICKO);
		 * Car car2 = new Car("dodge","caliber",2017,10000,false,VrstaVozila.PUTNICKO);
		 * Car car3 = new Car("lexus","lc500",2019,110000,true,VrstaVozila.PUTNICKO);
		 * Car car4 = new Car("Lada","niva",2019,19000,false,VrstaVozila.TERENAC);
		 * 
		 * dao.snimiAutoUbazu(car1); dao.snimiAutoUbazu(car2); dao.snimiAutoUbazu(car3);
		 * dao.snimiAutoUbazu(car4);
		 */

		
		/*
		 * Car car = new Car("land rover",
		 * "discovery",2018,39990,false,VrstaVozila.SUV);
		 * 
		 * VisitCard visitCard = new VisitCard(); visitCard.setIme("ruzica");
		 * visitCard.setEmail("ruza@gmail.com");
		 * visitCard.setBrojTelefona("0641234567");
		 * 
		 * User user = new User(); user.setUserName("ruza");
		 * user.setPassword("ruzaprogramer123"); user.setNovcanik(100000);
		 * user.setVisitCard(visitCard);
		 * 
		 * 
		 * dao.snimiUseraUbazu(user); dao.snimiAutoUbazu(car);
		 */
		
		

	}

}