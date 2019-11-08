package automobili;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import controller.HibernateDAO;
import model.Car;

public class GlavnaHibernateKlasa {

	public static void main(String[] args) {
		
		
		
		HibernateDAO dao = new HibernateDAO();
		
		Car car = new Car ("jaguar","f-type", 2017, 0.12, true );
		
		dao.snimiAutoUbazu(car);
		
		
		
		
		
		
	
		
		
		

	}

}
