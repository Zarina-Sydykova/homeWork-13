import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass("Zarina Sydykova", 27);
        System.out.println(myClass.getFullName()+" "+myClass.getAge());
        MyClass myClass1 = new MyClass(new String[]{"Java", "Soft skills", "English"},"Pasta: Fettuccine Alfredo");
        System.out.println(Arrays.toString(myClass1.getCourses())+ " "+myClass1.getDish());
    }
}