package BuilderDesingPattern.Calisma2;

public class Main {
	
	public static void main(String[] args) {
		 UserDirector director = new UserDirector();

	        User user1 = director.constructFullUser("Lokesh", "Gupta", 30, "1234567", "Fake address 1234");
	        System.out.println(user1);

	        User user2 = director.constructFullUser("Jack", "Reacher", 40, "5655", null);
	        System.out.println(user2);

	        User user3 = director.constructBasicUser("Super", "Man");
	        System.out.println(user3);
	}

}
