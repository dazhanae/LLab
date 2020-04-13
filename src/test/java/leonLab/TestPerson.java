package leonLab;

import leonLab.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

        @Test
        public void testConstructor(){
        String name = "Day";
        Long id = 9871L;
            Person person = new Person(id, name);
            Assert.assertEquals(id, person.getId());
        }

        @Test
         public void testSetName(){
            String name = "Daymulaa";
            Long id = 2019l;
                Person person = new Person(id, name);
                String newName = "DM";
                person.setName(newName);
                Assert.assertEquals(newName, person.getName());
         }
}

