package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.util.ArrayList;

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
@Test
    public void testToStringStartsAndEndsWithNewLine(){
        String test1="OOPS! This job does not seem to exist.";
        Job test3= new Job("Java Developer",new Employer(""),new Location("Arizona"),new PositionType("Developer"),new CoreCompetency("persistence"));

        Job test2=new Job();

        assertEquals(test2.toString(),test1);
        //Checks the empty line in first line and last line
        assertTrue(test3.toString().startsWith("\n"));
        assertTrue(test3.toString().endsWith("\n"));

}
@Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job test3= new Job("Java Developer",new Employer("IBM"),new Location("Arizona"),new PositionType("Developer"),new CoreCompetency("persistence"));
    Job test4 = new Job("Data Analyst", null, null, null, null);
    //checks the data prints the lables and ________ accordingly when the data passed as null value
    if(test4.getName()==null){
        assertTrue(test4.toString().contains("Name : _________"));
    }else if(test4.getEmployer()==null){
        assertTrue(test4.toString().contains("Employer : _________"));
    }else if(test4.getLocation()==null){
        assertTrue(test4.toString().contains("Location : _________"));
    }else if(test4.getPositionType()==null){
        assertTrue(test4.toString().contains("Position Type : _________"));
    }else if(test4.getCoreCompetency()==null){
        assertTrue(test4.toString().contains("Core Competency : _________"));
    }
    System.out.println(test4);
    System.out.println(test3);

    //Checks the Job class when the empty string value is passed.
    if(test3.getName().isEmpty()){
        assertTrue(test3.toString().contains("Name: Data Not Available"));
    }else if(test3.getEmployer().getValue().isEmpty()){
        assertTrue(test3.toString().contains("Employer: Data Not Available"));
    }else if(test3.getLocation().getValue().isEmpty()){
        assertTrue(test3.toString().contains("Location: Data Not Available"));
    }else if(test3.getPositionType().getValue().isEmpty()){
        assertTrue(test3.toString().contains("Position Type: Data Not Available"));
    }else if(test3.getCoreCompetency().getValue().isEmpty()){
        assertTrue(test3.toString().contains("Core Competency: Data Not Available"));
    }

}
}

