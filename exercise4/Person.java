public class Person {
    int age;
    String name;

    Person(String personName, int personAge) {
        this.name = personName;
        this.age = personAge;
       
    }

    void addFriend(Person friend) {
        System.out.println( this.name + " is friends with " + friend.name);
    }

    void addClassmate(Person classmate) {
            System.out.println( this.name + " is classmate with " + classmate.name);

    }
}