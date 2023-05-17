package main.java.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.java.Objects.Recipe;
import main.java.db.RecipiesRepository;

@CrossOrigin(maxAge=3600)
@RestController
public class DataController {
	
	@Autowired
	private RecipiesRepository recipiesRepository;

	@GetMapping("/recipies")
	public List<Recipe> getRecipies(@RequestParam(value = "name", defaultValue = "Item1") String name) {
			return recipiesRepository.findByIdName(name);
	}
	
}