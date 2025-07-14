package Study.setTest.MySet.DEO;

import java.util.Objects;

public class User {
    private String name;
    private int age;
    private String type;

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

    public String getId() {
        return type;
    }

    public void setId(String type) {
        this.type = type;
    }

    public User() {
    }

    public User(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(type, user.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, type);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + type + '\'' +
                '}';
    }
}
