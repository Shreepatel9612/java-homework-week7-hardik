package homework7;

/**
 * Write a class with the name Person. The class needs three fields (instance variables) with the names
 * firstName, lastName of type String and age of type int.
 */
public class Person14 {
    private String firstName;
    private String lastName;
    private int age;

    // Method to get firstName
    public String getFirstName() {
        return firstName;
    }

    // Method to set firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Method to get lastName
    public String getLastName() {
        return lastName;
    }

    // Method to set lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method to get age
    public int getAge() {
        return age;
    }

    // Method to set age
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0; // If age is less than 0 or more than 100, set to 0
        } else {
            this.age = age;
        }
    }

    // Method to check if the person is a teen (age between 13 and 19)
    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    // Method to get the full name
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }

    // Main method for testing the Person class
    public static void main(String[] args) {
        Person14 person = new Person14();

        // Test case 1
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName("");  // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        // Test case 2
        person.setFirstName("Hardik"); // firstName is set to Hardik
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        // Test case 3
        person.setLastName("Pokiya"); // lastName is set to Pokiya
        System.out.println("fullName= " + person.getFullName());
    }
}

