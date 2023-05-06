package main.java.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.java.Objects.Item;
import main.java.db.ItemRepository;
import main.java.exceptions.ItemNotFoundException;

@CrossOrigin(maxAge=3600)
@RestController
public class DataController {
	
	@Autowired
	private ItemRepository itemRepository;

	@GetMapping("/info")
	public Item getItem(@RequestParam(value = "name", defaultValue = "Item1") String name) {
			return (Item) itemRepository
					.findById(1l)
					.orElseThrow(ItemNotFoundException::new);
	}
	
}