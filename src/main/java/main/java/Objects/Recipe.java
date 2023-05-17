package main.java.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "Recipe")
public class Recipe {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Long id;
    
    @Column(name = "name")
    String name;

    @Column(name = "url")
    String url;

    @Column(name = "tags")
    String tags;
    
    public Recipe () {}
    
    public Recipe(String name, String url) {
    	this.name=name;
    	this.url=url;
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

	public String geturl() {
		return url;
	}

	public void seturl(String url) {
		this.url = url;
	}

	public String gettags() {
		return tags;
	}

	public void settags(String tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", url=" + url + ", tags=" + tags==null?"":tags + "]";
	}
    
}