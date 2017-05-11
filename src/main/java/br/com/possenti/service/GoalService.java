package br.com.possenti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.possenti.model.Goal;
import br.com.possenti.repository.GoalRepository;

@Service
public class GoalService {
	
	@Autowired
    private GoalRepository repository;

	public Iterable<Goal> getAll(){
        Iterable<Goal> goals = repository.findAll();
        return goals;
    }

    public Goal getId(Integer id){
    	Goal goal = repository.findOne(id);
    	return goal; 
    }
	
	public void save(Goal goal){
        repository.save(goal);
    }
	
	public void delete(Goal goal){
        repository.delete(goal);
    }
    
    
	
}
