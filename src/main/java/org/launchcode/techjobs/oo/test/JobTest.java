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
       // String test1="OOPS! This job does not seem to exist.";
        Job test3= new Job("Java Developer",new Employer(""),new Location("Arizona"),new PositionType("Developer"),new CoreCompetency("persistence"));

        Job test2=new Job();

       // assertEquals(test2.toString(),test1);
        //Checks the empty line in first line and last line
        assertTrue(test3.toString().startsWith("\n"));
        assertTrue(test3.toString().endsWith("\n"));
         //System.out.println(test3.toString().charAt(test3.toString().indexOf("\n")));
         //System.out.println(test3.toString().substring(128));
        //  assertEquals('\n',test3.toString().substring(0,1));
    assertEquals('\n',test3.toString().charAt(0));

    assertEquals('\n',test3.toString().charAt(128));


}
@Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job test3= new Job("Java Developer",new Employer("IBM"),new Location("Arizona"),new PositionType("Developer"),new CoreCompetency("persistence"));
    Job test4 = new Job("Data Analyst", null, null, null, null);
    Job jobData= new Job(null,null,null,null,null);

    String str="\n" +
            "ID : __________\n" +
            "Name : __________\n" +
            "Employer : __________\n" +
            "Location : __________\n" +
            "Position Type : __________\n" +
            "Core Competency : __________\n";
    assertEquals(str,jobData.toString());
    //checks the data prints the lables and ________ accordingly when the data passed as null value
    if(test4.getName()==null){
        assertTrue(test4.toString().contains("Name : _________"));
    }if(test4.getEmployer()==null){
        assertTrue(test4.toString().contains("Employer : _________"));
    }if(test4.getLocation()==null){
        assertTrue(test4.toString().contains("Location : _________"));
    }if(test4.getPositionType()==null){
        assertTrue(test4.toString().contains("Position Type : _________"));
    }if(test4.getCoreCompetency()==null){
        assertTrue(test4.toString().contains("Core Competency : _________"));
    }
    //System.out.println(test4);
    //System.out.println(test3);

    //Checks the Job class when the empty string value is passed.


}
@Test
    public void testToStringHandlesEmptyField(){
    Job test3= new Job("Java Developer",new Employer("IBM"),new Location("Texas"),new PositionType(""),new CoreCompetency(""));
   //Checks the Job class when the empty string value is passed.
    //System.out.println(test3.toString());
    Job job= new Job("",new Employer("IBM"),new Location("Arizona"),new PositionType("Developer"),new CoreCompetency("persistence"));

    String str="\n" +
            "ID: 4\n" +
            "Name: Data not available\n" +
            "Employer: IBM\n" +
            "Location: Arizona\n" +
            "Position Type: Developer\n" +
            "Core Competency: persistence\n";
    assertEquals(str,job.toString());
    if(test3.getName().isEmpty()){
        assertEquals(true, test3.toString().contains("Name: Data not available"));
    } if(test3.getEmployer().getValue().isEmpty()){
        assertEquals(true, test3.toString().contains("Employer: Data not available"));
    }if(test3.getLocation().getValue().isEmpty()){
        assertEquals(true, test3.toString().contains("Location: Data not available"));
    } if(test3.getPositionType().getValue().isEmpty()){
        assertEquals(true, test3.toString().contains("Position Type: Data not available"));
    }if(test3.getCoreCompetency().getValue().isEmpty()){
        assertEquals(true, test3.toString().contains("Core Competency: Data not available"));
    }
}
@Test
    public void testJobConstructorSetsAllFields(){
    Job test3= new Job("Java Developer",new Employer("IBM"),new Location("Arizona"),new PositionType("Developer"),new CoreCompetency("persistence"));
//   System.out.println(tes);
//    Job job= new Job("Java Developer",new Employer("IBM"),new Location("Arizona"),new PositionType("Developer"),new CoreCompetency("persistence"));
//
//    String str="\n" +
//            "ID: 2\n" +
//            "Name: Java Developer\n" +
//            "Employer: IBM\n" +
//            "Location: Arizona\n" +
//            "Position Type: Developer\n" +
//            "Core Competency: persistence\n";
//    assertEquals(str,job.toString());
    assertEquals("Java Developer",test3.getName());
    assertEquals("IBM",test3.getEmployer().getValue());
    assertEquals("Arizona",test3.getLocation().getValue());
    assertEquals("Developer",test3.getPositionType().getValue());
    assertEquals("persistence",test3.getCoreCompetency().getValue());


    if(!test3.getName().isEmpty()){
        assertTrue(test3.toString().contains("Name: Java Developer"));
    }if(!test3.getEmployer().getValue().isEmpty()){
        assertTrue(test3.toString().contains("Employer: IBM"));
    } if(!test3.getLocation().getValue().isEmpty()){
        assertTrue(test3.toString().contains("Location: Arizona"));
    } if(!test3.getPositionType().getValue().isEmpty()){
        assertTrue(test3.toString().contains("Position Type: Developer"));
    } if(!test3.getCoreCompetency().getValue().isEmpty()){
        assertTrue(test3.toString().contains("Core Competency: persistence"));
    }
}
//@Test
//    public void
 }

