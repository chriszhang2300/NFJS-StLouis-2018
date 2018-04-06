package habuma;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class JdbcProfileRepository
		implements ProfileRepository {

	private final JdbcTemplate jdbc;
	
	@Override
	public Iterable<Profile> findAll() {
		
		return jdbc.query("select username, password, fullName"
				+ " from Profile",
				(rs, row) -> {
					String username = rs.getString("username");
					String password = rs.getString("password");
					String fullName = rs.getString("fullName");
					return new Profile(username, password, fullName);
				});
		
	}
	
	@Override
	public Profile save(Profile profile) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
