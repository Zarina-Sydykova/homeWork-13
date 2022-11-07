public class MyClass {
    private String fullName;
    private  int age;
    private String [] courses;
    private String dish;

    public MyClass(String fullName, int age){
        this.fullName=fullName;
        this.age=age;

    }
    public void setFullName(){
        this.fullName=fullName;
    }
    public void setAge(){
        this.age=age;
    }
    public String getFullName(){
        return fullName;
    }

    public int getAge() {
        return age;
    }
    public MyClass(String [] courses, String dish){
        this.courses=courses;
        this.dish=dish;
    }
    public void setCourses(){
        this.courses=courses;
    }
    public void setDish(){
        this.dish=dish;
    }
    public String [] getCourses(){
        return courses;
    }
    public String getDish(){
        return dish;
    }
}
