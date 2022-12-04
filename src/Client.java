
public class Client {
	private String username;
	private String parola;
	private String nume;
	private String adresa;
	private String email;
	private String numar;
	
	Client(){}
	
	Client(String username,String parola,String nume,String adresa,String email,String numar){
		this.username = username;
		this.parola = parola;
		this.nume = nume;
		this.adresa = adresa;
		this.email = email;
		this.numar = numar;
	}
	
	public String toString() {
		return "Username: " + username + " parola: " + parola + " nume complet: " + nume + " adresa: " + adresa + " email: " + email + " numar de telefon: " + numar;
	}
		
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.parola;
	}
	
	public void setUsername(String newUsername) {
		this.username = newUsername;
	}
	
	public void setParola(String newParola) {
		this.parola = newParola;
	}
	
	public void setNume(String newNume) {
		this.nume = newNume;
	}
	
	public void setAdresa(String newAdresa) {
		this.adresa = newAdresa;
	}
	
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}
	
	public void setNumar(String newNumar) {
		this.numar = newNumar;
	}
	
}
