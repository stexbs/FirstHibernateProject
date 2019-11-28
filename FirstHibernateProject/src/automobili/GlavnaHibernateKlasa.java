package automobili;

import java.util.ArrayList;
import java.util.List;

import controller.HibernateDAO;
import model.Car;
import model.User;
import model.VisitCard;
import model.VrstaVozila;

public class GlavnaHibernateKlasa {

	public static void main(String[] args) {

		HibernateDAO dao = new HibernateDAO();
		
		
		
		  Car auto1 = dao.vratiAuto(1); Car auto2 = dao.vratiAuto(2);
		  
		  List<Car> ruziniAutici = new ArrayList<Car>(); ruziniAutici.add(auto1);
		  ruziniAutici.add(auto2);
		  
		  User user = dao.vratiUsera(1);
		  
		  if(dao.daLiUserImaDovoljnoParaZaAutomobile(user, ruziniAutici)) {
		  dao.spojiUseraIcar(user, ruziniAutici); }
		 

		
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
		 
		 
		 
		  
	}
}