package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {

        Customer alice = new Customer("Alice", "alice@gmail.com", "+012345", LocalDate.of(1990, 10, 20));
//        CustomerValidatorService validatorService = new CustomerValidatorService();
//        System.out.println(validatorService.isCustomerValid(alice));

        // Using combinator pattern
        CustomerRegistrationValidator.ValidationResult result =
                isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(alice);
        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }

    }
}
