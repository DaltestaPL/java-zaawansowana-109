package lecture.reflection;

import lombok.Getter;

@Getter
@Deprecated(since = "31.01.2023", forRemoval = true)
@Sda
public class Person {

    public String name;

    public int age = 20;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
