package habuma;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProfileUiController {
	
	private final ProfileRepository repo;

	@GetMapping("/allProfiles")
	public String allProfiles(Model model) {
		model.addAttribute("profiles", repo.findAll());
		return "profiles";
	}
	
}
