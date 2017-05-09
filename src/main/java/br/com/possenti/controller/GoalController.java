package br.com.possenti.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.possenti.model.Goal;
import br.com.possenti.repository.GoalRepository;


@Controller
public class GoalController {


	@Autowired
	private GoalRepository repository;
	
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	

	@RequestMapping("listaobjetivos")
	public String listaObjetivos(Model model){
		 Iterable<Goal> goals = repository.findAll();
		 model.addAttribute("goals", goals);
		
		return "listaObjetivos";
	}
	
	@RequestMapping(value="save", method = RequestMethod.POST)
	public String  save(@RequestParam("name") String name, 
            			@RequestParam("description") String description,
            			Model model){
		Goal newGoal = new Goal(name, description);
	    repository.save(newGoal);
	    
	    Iterable<Goal> goals = repository.findAll();
	    model.addAttribute("goals", goals);
		
		return "listaobjetivos";
	}
	
}
