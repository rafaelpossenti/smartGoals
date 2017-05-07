package br.com.possenti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import br.com.possenti.model.Staff;
import br.com.possenti.repository.staffRepository;


@Controller
public class dashboardController {


	@Autowired
	private staffRepository repository;
	
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	

	@RequestMapping("listaobjetivos")
	public String listaObjetivos(Model model){
		 Iterable<Staff> staffs = repository.findAll();
		 model.addAttribute("convidados", staffs);
		
		return "listaObjetivos";
	}
	
}
