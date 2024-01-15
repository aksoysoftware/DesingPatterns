package BuilderDesingPattern.Calisma2;


public class UserDirector {
    public User constructFullUser(String firstName, String lastName, int age, String phone, String address) {
        return new User.UserBuilder(firstName, lastName)
                .age(age)
                .phone(phone)
                .address(address)
                .build();
    }

    public User constructBasicUser(String firstName, String lastName) {
        return new User.UserBuilder(firstName, lastName).build();
    }

    
    }

