package world.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock;

/**
 * A City in a country.
 * 
 * @author masn
 */

@Entity
public class City {

	@Id
	private Integer id;
	private String name;
	private String district;
	private int population;

	// -- constructors --
	
	public City() {
		
	}
	
	
	// -- methods --

	public String toString() {
		return this.name;
	}
}
