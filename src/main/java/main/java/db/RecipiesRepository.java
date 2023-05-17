package main.java.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import main.java.Objects.Recipe;

@Repository
public interface RecipiesRepository extends JpaRepository<Recipe, Long> { 
    @Query(value="Select * FROM Recipies WHERE id = :id", nativeQuery=true)
    List<Recipe> findByIdKey(String id);
    
    @Query(value="Select * FROM Recipies WHERE name like %:name%", nativeQuery=true)
    List<Recipe> findByIdName(String name);
}