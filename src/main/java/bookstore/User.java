package bookstore;

import lombok.Getter;
import lombok.Setter;

import java.util.Locale;

@Setter
@Getter
public class User {

    private UserAddress userAddress;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String pesel;
    private String email;
    private String passwordHash;
    private String phone;
    private boolean preferEmails;


}
