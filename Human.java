/**
 * Created by chernyahivskiy.v on 11.04.2017.
 */
public class Human {
    String name;
    int age;
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
            return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
