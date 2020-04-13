package leonLab;


public class Student extends Person implements iLearner{
    private double totalStudyTime;

    public Student(Long id, String name){
        super (id,name);
        totalStudyTime = 0.0;
    }
     public Student(){
        super(0L, null);
        totalStudyTime = 0.0;
     }

    @Override
    public void learn(double numberOfHours) {
         totalStudyTime += numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}

