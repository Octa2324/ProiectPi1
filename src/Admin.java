
public class Admin {
	
	private String codAutentificare;
	
	Admin(String codAutentificare){
		this.codAutentificare = codAutentificare;
	}
	
	public String toString() {
		return "Cod autentificare admin: " + codAutentificare;
	}
	
	public String getCod() {
		return this.codAutentificare;
	}
}
