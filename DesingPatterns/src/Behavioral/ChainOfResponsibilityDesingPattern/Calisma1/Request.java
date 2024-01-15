package ChainOfResponsibilityDesingPattern.Calisma1;

public class Request {
	// İsteğin içerdiği verileri tutmak için alanlar tanımlanır
    private String username;
    private String password;
    private String data;

    // İsteği oluşturmak için bir kurucu metod tanımlanır
    public Request(String username, String password, String data) {
        this.username = username;
        this.password = password;
        this.data = data;
    }

    // Verileri döndürmek için getter metodları tanımlanır
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getData() {
        return data;
    }

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setData(String data) {
		this.data = data;
	}

	
}
