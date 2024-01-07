package Project2;

public abstract class Marks {
    //We have to calculate the average of marks obtained in three subjects by
    //student A and by student B. Create class 'Marks' with an abstract method
    //'getPercentage' that will return the average percentage of marks. Provide
    //implementation of abstract methods in classes 'A' and 'B'. The constructor of
    //student A takes the marks in three subjects as its parameters and the marks
    //in four subjects as its parameters for student B. Test your code
    abstract double getPercentage();
}
class A extends Marks {
    double subject1, subject2, subject3;

    A(double s1, double s2, double s3) {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3;
    }
}

class B extends Marks {
    double subject1, subject2, subject3, subject4;

    B(double s1, double s2, double s3, double s4) {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
        subject4 = s4;
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4;
    }
}

class TestingMarks {
    public static void main(String[] args) {


    A studentA = new A(80, 90, 75);
    B studentB = new B(85, 88, 92, 78);
        System.out.println("Student A Percentage: "+studentA.getPercentage());
                System.out.println("Student B Percentage: "+studentB.getPercentage());
}}