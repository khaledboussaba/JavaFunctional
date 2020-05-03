package optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Optional.ofNullable("john@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to " + email));


    }

}
