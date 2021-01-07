package garg.digaant.petclinic.controllers;

import garg.digaant.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners","/owners/index","/owners/index.html"})
    private String listOwners(Model model){

        model.addAttribute("owners", ownerService.findAll());

        return "owner/index";
    }

    @RequestMapping("/owners/find")
    public String findOwners(){
        return "notimplemented";
    }

}
