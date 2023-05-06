package main.java.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "Test")
public class Item {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Long id;
    
    @Column(name = "name")
    String name;

    @Column(name = "accessed")
    String accessed;
    
    public Item () {}
    
    public Item(String name, String accessed) {
    	this.name=name;
    	this.accessed=accessed;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return accessed;
	}

	public void setAccessed(String accessed) {
		this.accessed = accessed;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", accessed=" + accessed + "]";
	}
    
}