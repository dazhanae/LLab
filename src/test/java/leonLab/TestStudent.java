package leonLab;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){

        Student student = new Student();

        Assert.assertTrue(student instanceof iLearner);

    }

    @Test
    public void testInheritance(){
        Student student = new Student();

        Assert.assertTrue(student instanceof Person);
    }


    @Test
    public void testLearn(){
        Student student = new Student();
        student.learn(5.0);
        double expected = 5.0;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.0);

    }
}
