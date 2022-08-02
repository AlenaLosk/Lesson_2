public class Runner3 {
    public static void main(String[] args) {
        //3) Смоделировать свою предметную область из одного-двух классов, имеющих поля для хранения данных и методы.
        //Написать в методе main код, создающий эти объекты и вызывающий методы.

        //дефолтный конструктор создает экземпляр класса Person с "Ivan", "Petrov", 35
        Person p1 = new Person();
        Person p2;
        try {
            p2 = new Person("Ольга", "", 50);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
            p2 = new Person("Ольга", "Громова", 50);
        }
        Person p3 = new Person("Ivan", "Petrov", 35);

        System.out.println("Are p1 and p3 the same person? Answer: " + p1.equals(p3));
        System.out.println("Are p1 and p2 the same person? Answer: " + p1.equals(p2));
        System.out.println("Is p1's hashcode more than p2's one? Answer: " + (p1.hashCode() > p2.hashCode()));
        System.out.println("Is p2's hashcode more than p1's one? Answer: " + (p1.hashCode() < p2.hashCode()));
        System.out.println("Is p1's hashcode equals to p3's one? Answer: " + (p1.hashCode() == p3.hashCode()));
    }
}
