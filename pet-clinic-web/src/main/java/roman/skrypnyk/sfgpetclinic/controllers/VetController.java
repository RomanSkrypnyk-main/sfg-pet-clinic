package roman.skrypnyk.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import roman.skrypnyk.sfgpetclinic.services.VetService;

@RequestMapping({"/vets"})
@Controller
public class VetController {

	private final VetService vetService;

	public VetController(VetService vetService) {
		this.vetService = vetService;
	}

	@RequestMapping({"", "/", "/owners/index"})
	public String listVets(Model model){

		model.addAttribute("vets", vetService.findAll());

		return "vets/index";
	}
}
