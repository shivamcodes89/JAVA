public class Student{
    String name;
    int rollnumber;
    private int age;

    public void setAge(int x){
        if(x < 0){
            x = 0;
        }
        age = x;
    }

    public int getAge(){
        return age;
    }
}