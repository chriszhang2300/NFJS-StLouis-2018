package habuma;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/profiles")
public class ProfileController {

	private final ProfileRepository repo;
	
	@GetMapping
	public Iterable<Profile> allProfiles() {
		return repo.findAll();
	}
	
	@GetMapping(params="pwd")
	public Iterable<Profile> byPwd(@RequestParam("pwd") String pwd) {
		return repo.findByPasswordAndEnabled(pwd, true);
	}	
	
	@GetMapping("/venkat")
	public Profile venkatsProfile() {
		repo.doSomethingStupid();
		return repo.findVenkatsProfile();
	}
}
