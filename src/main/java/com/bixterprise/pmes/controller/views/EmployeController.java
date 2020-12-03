package com.bixterprise.pmes.controller.views;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bixterprise.pmes.models.Employe;
import com.bixterprise.pmes.services.impl.EmployeService;

@Controller
@RequestMapping("employes")
public class EmployeController {

	@Autowired EmployeService service;

	
	@GetMapping("/add")
	public String addView(Model model) {
		model.addAttribute("isEmploye", true);
		model.addAttribute("employe", new Employe());
		return "employes/add";
	}
	
	@GetMapping("/edit/{id}")
	public String addView(Model model, @PathVariable Long id) {
		model.addAttribute("isEmploye", true);
		model.addAttribute("employe", service.findById(id));
		return "employes/add";
	}
	
	@GetMapping
	public String homeView(Model model) {
		List<Employe> l = service.list();
		model.addAttribute("employes", l);
		model.addAttribute("isEmploye", true);
		return "employes/home";
	}

	@PostMapping("/add")
	public String addEmploye(Model model, Employe employe, @Value("${error.subscription.message}") String error) {
		if(employe.getId() != null) {
			model.addAttribute("error", error);
			model.addAttribute("employe", employe);
			return "employes/add";
		}
		
		service.save(employe);
		return "redirect:/employes";
	}
	

	@PostMapping("/edit/{id}")
	public String editEmploye(Model model, Employe employe, @Value("${error.subscription.message.edit}") String error, @Value("${error.employe.find}") String errorNotFound) {
		if(employe.getId() == null) {
			model.addAttribute("error", error);
			model.addAttribute("employe", employe);
			return "employes/add";
		}
		Employe last = service.findById(employe.getId());
		if(last == null) {
			model.addAttribute("error", errorNotFound);
			model.addAttribute("employe", employe);
			return "employes/add";
		}
		service.edit(employe);
		return "redirect:/employes";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmploye(@PathVariable Long id) {
		Employe e = new Employe(id);
		service.delete(e);
		return "redirect:/employes";
	}
}
