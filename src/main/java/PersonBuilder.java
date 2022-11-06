import java.util.function.Predicate;

public class PersonBuilder {
    private String name;
    private String surName;
    private int age;
    private String adress;

    public PersonBuilder setName(String name){
        this.name = name;
        return this;
    }

    public PersonBuilder setSurName(String surName) {
        this.surName = surName;
        return this;
    }
    public PersonBuilder setAge(int age){
        if(age > 120 || age < 0){
            throw  new IllegalArgumentException("Write the correct age please");
        }else{
            this.age = age;
            return this;
        }
    }
    public PersonBuilder setAdress(String adress){
        this.adress = adress;
        return this;
    }
    public Person build(){
        if(name == null || surName == null){
            throw new IllegalArgumentException("Write the correct name or surName please");
        }
        Person person = new Person(this.name, this.surName);
        person.age = this.age;
        person.adress = this.adress;
        return person;
    }
}
