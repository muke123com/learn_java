package learn;

/**
 * Created by Administrator on 2017/12/19.
 */

class Person{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 200){
            System.out.printf("fail");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Person{
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

public class ClassDemo01 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(123);
        stu.setName("abc");
        stu.setScore(100);
        System.out.printf(String.valueOf(stu.getScore()));
    }
}
