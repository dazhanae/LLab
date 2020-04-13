package leonLab;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(2348L, "Dmoney" );
        Assert.assertTrue(instructor instanceof iTeacher);
    }
    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(4574L, "Cancun");
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach(){
        Instructor instructor = new Instructor();
        iLearner learner = new Student();
        double expected =  8.0;
        learner.learn(4.0);
        instructor.teach(learner, 4.0);
        double actual = learner.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.0);
        }
        @Test
        public void testLecture(){
        Instructor instructor = new Instructor();
        Student[] students = {new Student (), new Student(), new Student()};
        instructor.lecture(students, 6.0);
        double expected = 2.0;
        double actual = students[0].getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.0);

        }
    }
