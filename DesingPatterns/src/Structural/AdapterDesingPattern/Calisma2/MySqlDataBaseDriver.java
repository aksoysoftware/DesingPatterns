package AdapterDesingPattern.Calisma2;

public class MySqlDataBaseDriver implements DataBaseAccess {

	 @Override
	    public void connect() {
	        System.out.println("MySQL veritabanına bağlanılıyor...");
	    }

	    @Override
	    public void query(String query) {
	        System.out.println("MySQL sorgusu: " + query);
	    }

}
