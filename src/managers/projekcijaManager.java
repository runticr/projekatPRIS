package managers;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Film9;
import model.Komentar9;
import java.util.List;
public class projekcijaManager {
	
	public Film9 saveFilm(String naziv, String trailer, String opis, String zanr, String glumci,byte[] slika,String reditelj) {
		try {
			EntityManager em = JPAUtils.getEntityManager();
			em.getTransaction().begin();
			Film9 f = new Film9();
			f.setNaziv(naziv);
			f.setTrailer(trailer);
			f.setOpis(opis);
			f.setZanr(zanr);
			f.setGlumci(glumci);
			f.setSlika(slika);
			f.setReditelj(reditelj);
			em.persist(f);
			em.getTransaction().commit();
			em.close();
			return f;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		projekcijaManager pma = new projekcijaManager();
		try{
			projekcijaManager pm = new projekcijaManager();
		
			
			Film9 f = pm.saveFilm("Avatar","nema","naucna fantastika","fantastika","nema",null, "adasd");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	

	}

	
//komentar
}
