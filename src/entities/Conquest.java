package entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Conquest {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	private String foe;
	private String land;
	private String tale;
	private int gold;
	private String image;
	
	@OneToMany(fetch=FetchType.EAGER, orphanRemoval=true, cascade={CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name="conquest_id", referencedColumnName="id", nullable = false)
    private Set<Loot> loot;
	
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
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set<Loot> getLoot() {
		return loot;
	}

	public void setLoot(Set<Loot> loot) {
		this.loot = loot;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Conquest [id=" + id + ", foe=" + foe + ", land=" + land + ", gold=" + gold + "]";
	}
}
