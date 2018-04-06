package habuma;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor(force=true, access=AccessLevel.PRIVATE)
@RequiredArgsConstructor
@Document
public class Profile {

	@Id
	private String id;
	
	private final String username;
	private final String password;
	private final String fullName;
	private final Boolean enabled;
	
}
