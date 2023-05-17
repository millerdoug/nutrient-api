package main.java.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import main.java.Objects.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> { 
    @Query(value="Select * FROM item WHERE id = :id", nativeQuery=true)
    List<Item> findByIdKey(String id);
    
    @Query(value="Select * FROM item WHERE name = :name", nativeQuery=true)
    List<Item> findByIdName(String name);
}