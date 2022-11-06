public class Main {
    public static void main(String[] args) {
        Person mother = new PersonBuilder()
                .setName("Екатерина")
                .setSurName("Чехова")
                .setAge(32)
                .setAdress("Ростов-на-Дону")
                .build();
        mother.happyBirthday();
        Person child = mother.newChildBuilder()
                .setName("Анна")
                .build();
        System.out.println(mother);
        System.out.println("У " + mother.getName() + " есть дочь, " + child.getName());
        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
