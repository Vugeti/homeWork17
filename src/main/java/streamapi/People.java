package streamapi;

public class People {

    String name;
    int age;
    Sex sex;

    @Override
    public String toString() {
        return " name: " + name +
                ", age: " + age +
                ", sex: " + sex + " || ";
    }

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
