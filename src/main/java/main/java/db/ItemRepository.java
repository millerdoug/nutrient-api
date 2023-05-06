package main.java.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.java.Objects.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}