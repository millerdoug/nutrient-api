package main.java.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.java.Objects.Item;
import main.java.db.ItemRepository;

@CrossOrigin(maxAge=3600)
@RestController
public class DataController {
	
	@Autowired
	private ItemRepository itemRepository;

	@GetMapping("/info")
	public List<Item> getItem(@RequestParam(value = "name", defaultValue = "Item1") String name) {
			return itemRepository.findByIdKey(name);
	}
	
}