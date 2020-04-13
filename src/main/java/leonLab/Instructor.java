package leonLab;

public class Instructor extends Person implements iTeacher {
    public Instructor(Long id, String name) {
        super(id, name);
    }
    public Instructor(){
        super(0L, null);
    }

    @Override
    public void teach(iLearner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(iLearner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;

        for (iLearner learner : learners){
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
