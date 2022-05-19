package roman.skrypnyk.sfgpetclinic.controllers;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import roman.skrypnyk.sfgpetclinic.services.OwnerService;

@RequestMapping({"/owners"})
@Controller
public class OwnerController {

	private OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}

	@RequestMapping({"", "/", "/owners/index"})
	public String listOwners(@NotNull Model model){

	model.addAttribute("owners", ownerService.findAll());

		return "owners/index";
	}

}
