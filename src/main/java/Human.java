import java.util.Objects;
public class Human
{
    private String surname;
    private String name;
    private String middleName;
    private int age;

    public Human(String surname, String name, String middleName, int age)
    {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return getAge() == human.getAge() && Objects.equals(getSurname(), human.getSurname()) && Objects.equals(getName(), human.getName()) && Objects.equals(getMiddleName(), human.getMiddleName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSurname(), getName(), getMiddleName(), getAge());
    }

    @Override
    public String toString() {
        return "Human{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age +
                '}';
    }
}
