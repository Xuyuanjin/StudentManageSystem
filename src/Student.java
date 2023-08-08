
public class Student {
    //成员变量
    private String id;
    private String name;
    private int age;
    private char gender;
    private String major;
    //不带参数构造方法
    public Student(){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.major=major;
    }
    //成员方法
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

}
