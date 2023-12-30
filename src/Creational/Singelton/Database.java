package Creational.Singelton;

public class Database {

    private static Database dbObject;

    private Database() {
        // Özel yapıcı metod, dışarıdan erişimi engeller.
    }

    public static synchronized Database getInstance() {
        if (dbObject == null) {
            dbObject = new Database();
        }
        return dbObject;
    }

    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }
    
    
    public User getUser() {
    	
    	return new User("Dilan","Aksoy");
    }
}
