package day1;

import java.util.Objects;

public class Customer {
    public final static int MAX_NUMBER_OF_CUSTOMERS = 1000;
    private String firstName;
    private String lastName;
    private int age;

    public Customer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Customer() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void sayName() {
        System.out.println("Hello from " + firstName + " " + lastName);
    }

    /**
     * Sets the firstName
     * @param newFirstName The new first name
     * @author
     * @since 1.2
     * @return Returns something
     */
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public static Customer getTestCustomer() {
        return new Customer("Ichbinein", "Testuser");
    }


    @Override
    public String toString() {
        return "day1.Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
