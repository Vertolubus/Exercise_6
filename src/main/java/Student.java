public class Student extends Human
{
    private String nameOfDepartment;

    public Student(String surname, String name, String middleName, int age, String nameOfDepartment) {
        super(surname, name, middleName, age);
        this.nameOfDepartment = nameOfDepartment;
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }
}
