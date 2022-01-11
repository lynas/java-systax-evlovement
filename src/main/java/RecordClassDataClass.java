public class RecordClassDataClass {
    public static void main(String[] args) {
        Animal animal = new Animal("name", "t");
        System.out.println(animal.name());
        System.out.println(animal.type());
        System.out.println(animal.name().length());
    }
}


record Animal(
        String name, String type
) {
    Animal{
        if (name.length() <= 1) {
            throw new IllegalArgumentException("Name must have at least 2 letter");
        }
    }

}