
public class Map {

	private String symbo;
	private int location;
	/**
	 * Map constructor; default symbo value will be "-", then will be occupied by players name. location value will be assigned from 1 - 100; 
	 * @param symbo
	 * @param location
	 */
	public Map(String symbo, int location) {
		
		this.symbo = symbo;
		this.location = location;
	}
	public String getSymbo() {
		return symbo;
	}
	public void setSymbo(String symbo) {
		this.symbo = symbo;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	
	
	
}
