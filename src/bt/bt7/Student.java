package bt.bt7;

public class Student {
    private int id;
    private String name;
    private boolean gender;
    private String dateOfBirth;

    public Student() {
    }

    public Student(int id, String name, boolean gender, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "ID: " + id + " || Name: " + name + " || Gender: " + (gender ? "Nam" : "Nữ") + " || DateOfBirth: " + dateOfBirth;
    }
}
