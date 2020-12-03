package com.bixterprise.pmes.controller.views;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bixterprise.pmes.models.Employe;
import com.bixterprise.pmes.services.impl.EmployeService;

@Controller
@RequestMapping("employes")
public class EmployeController {

	@Autowired EmployeService service;
	
//	
//	@GetMapping
//	public String homeView(Model model, Pageable pageable) {
//		model.addAttribute("employes", service.list(pageable).getContent());
//		model.addAttribute("isEmploye", true);
//		return "employes/home";
//	}
	
	@GetMapping
	public String homeView(Model model) {
		List<Employe> l = service.list();
		System.out.println("Employees = "+l);
		model.addAttribute("employes", l);
		model.addAttribute("isEmploye", true);
		return "employes/home";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmploye(@PathVariable Long id) {
		Employe e = new Employe(id);
		service.delete(e);
		return "redirect:/employes";
	}
}
