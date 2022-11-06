import java.util.Objects;
import java.util.Optional;

public class Person {
    protected final String name;
    protected final String surName;
    protected String adress;
    protected int age;


    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public boolean hasAge() {
        return age != 0;
    }

    public boolean hasAdress() {
        return adress != null;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Optional getAge() {
        if (hasAge()) {
            return Optional.empty();
        } else {
            return Optional.of(age);
        }
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", adress='" + adress + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surName, person.surName) && Objects.equals(adress, person.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, adress, age);

    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurName(this.surName).setAdress(this.adress).setAge(18);
    }

}
