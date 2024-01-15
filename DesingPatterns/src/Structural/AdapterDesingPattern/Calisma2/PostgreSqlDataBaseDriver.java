package AdapterDesingPattern.Calisma2;

public class PostgreSqlDataBaseDriver implements DataBaseAccess{

	 @Override
	    public void connect() {
	        System.out.println("PostgreSQL veritabanına bağlanılıyor...");
	    }

	    @Override
	    public void query(String query) {
	        System.out.println("PostgreSQL sorgusu: " + query);
	    }

}
