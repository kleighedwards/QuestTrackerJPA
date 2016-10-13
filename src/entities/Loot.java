package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loot {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String name;
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Loot [id=" + id + ", name=" + name + "]";
	}

}
