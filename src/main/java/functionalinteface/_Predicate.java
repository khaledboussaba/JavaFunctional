package functionalinteface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("0605543905"));
        System.out.println(isPhoneNumberValid("0705543905"));

        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("0605543905"));
        System.out.println(isPhoneNumberValidPredicate.test("0705543905"));

        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("0605543905"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("0605544905"));

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("06") && phoneNumber.length() == 10;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("06") && phoneNumber.length() == 10;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

}
