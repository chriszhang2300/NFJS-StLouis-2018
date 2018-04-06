package habuma;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository 
         extends CrudRepository<Profile, String>,
         		 ProfileRepositoryExtras {
	
	Iterable<Profile> findByPassword(String password);
	
	Iterable<Profile> findByPasswordAndEnabled(String pwd, boolean e);
	
	Profile findByUsername(String u);
	
	int countByPassword(String p);
	
	@Query("{'username':'venkat'}")
	Profile findVenkatsProfile();
	
}
