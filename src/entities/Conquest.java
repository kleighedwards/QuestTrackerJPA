package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conquest {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	private String foe;
	private String land;
	private String tale;
	private int gold;
	
	// Gets and Sets
	public String getFoe() {
		return foe;
	}
	
	public void setFoe(String foe) {
		this.foe = foe;
	}
	
	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public String getTale() {
		return tale;
	}
	
	public void setTale(String tale) {
		this.tale = tale;
	}
	
	public int getGold() {
		return gold;
	}
	
	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Conquest [id=" + id + ", foe=" + foe + ", land=" + land + ", gold=" + gold + "]";
	}
}
