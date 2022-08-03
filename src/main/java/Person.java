import java.util.Objects;

public class Person {
    private static long counter = 0;
    private long id;
    private String name;
    private String surname;
    private int age;

    public Person() {
        this.id = ++counter;
        this.name = "Ivan";
        this.surname = "Petrov";
        this.age = 35;
    }

    private Person(String name, String surname, int age) {
        this.id = ++counter;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    static Person build(String name, String surname, int age) {
        if (!name.isBlank() && !surname.isBlank() && age > 0 && age < 120) {
            return new Person(name, surname, age);
        } else if (name.isBlank()) {
            throw new IllegalArgumentException("Incorrect or empty name!");
        } else if (surname.isBlank()) {
            throw new IllegalArgumentException("Incorrect or empty surname!");
        } else {
            throw new IllegalArgumentException("Incorrect age!");
        }
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
