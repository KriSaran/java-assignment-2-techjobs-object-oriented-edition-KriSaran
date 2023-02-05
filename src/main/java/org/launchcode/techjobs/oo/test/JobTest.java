package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId(){
        Job test1=new Job();
        Job test2=new Job();
        assertNotEquals(test1,test2);
    }
@Test
    public void testFullConstructor(){
        Job test1=new Job("Product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"),new CoreCompetency("Persistence"));
        String str="Product tester";
        assertEquals("ACME",test1.getEmployer().getValue());
        assertTrue(test1.getLocation().getValue().equals("Desert"));
        assertEquals("Quality Control",test1.getPositionType().getValue());
        assertTrue(test1.getCoreCompetency().getValue().equals("Persistence"));
        assertTrue(test1.getName().equals("Product tester"));
        assertTrue(test1 instanceof Job);//true
}
@Test
    public void testJobsForEquality(){
        Job test1= new Job("Java Developer",new Employer("IBM"),new Location("Arizona"),new PositionType("Developer"),new CoreCompetency("persistence"));
        Job test2= new Job("Java Developer",new Employer("IBM"),new Location("Arizona"),new PositionType("Developer"),new CoreCompetency("persistence"));
        assertFalse(test1.equals(test2));
}
}
