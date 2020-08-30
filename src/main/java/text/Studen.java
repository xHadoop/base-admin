package text;

public class Studen {
    public String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public Studen(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(Integer age) {
        this.age = age;

    }

    @Override
    public String toString() {
        return "Studen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
