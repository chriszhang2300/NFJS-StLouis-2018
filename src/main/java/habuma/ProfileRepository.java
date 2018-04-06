package habuma;

public interface ProfileRepository {

	Iterable<Profile> findAll();
	Profile save(Profile profile);
	
}
