package kyu_8;

//  https://www.codewars.com/kata/547c71fdc5b2b38db1000098/train/java

public class This_is_a_problem {
    public String firstName;
    public String lastName;
    public String fullName;

    public This_is_a_problem(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        fullName = first + " "  +  last;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public static void main(String[] args) {
        This_is_a_problem nameMe = new This_is_a_problem("maksim", "korelov");
        System.out.println(nameMe.getFirstName());
        System.out.println(nameMe.getFullName());
    }
}
