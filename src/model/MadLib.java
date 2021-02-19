/**
 * @author Trae Eddie - tmeddie
 * CIS175 - Spring 2021
 * Feb 18, 2021
 */
package model;

/**
 * @author Traee
 *
 */
public class MadLib {
	private String verb;
	private String noun;
	private String adjective;
	private String place;
	public MadLib(String verb, String noun, String adjective, String place) {
		super();
		this.verb = verb;
		this.noun = noun;
		this.adjective = adjective;
		this.place = place;
	}
	public String getVerb() {
		return verb;
	}
	public void setVerb(String verb) {
		this.verb = verb;
	}
	public String getNoun() {
		return noun;
	}
	public void setNoun(String noun) {
		this.noun = noun;
	}
	public String getAdjective() {
		return adjective;
	}
	public void setAdjective(String adjective) {
		this.adjective = adjective;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "MadLib [verb=" + verb + ", noun=" + noun + ", adjective=" + adjective + ", place=" + place + "]";
	}
}
