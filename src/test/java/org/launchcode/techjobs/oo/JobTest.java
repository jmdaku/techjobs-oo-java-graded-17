package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.Before;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JobTest {

    //testData
    @Before
    public void createTestData(){
    Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId(){

    }

    //Create two Job objects using the empty constructor.
    //
    //Use assertNotEquals to verify that the IDs of the
    // two objects are distinct.

    @Test
    public void testJobConstructorSetsAllFields(){

    }

    //Use assertTrue and assertEquals statements to test
    // that the constructor correctly assigns both the class and value
    // of each field. Your test should have 5 assert statements of each type.
    //The instanceof keyword can be used to check the class of an object.
    // The result of the comparison is a boolean.

    @Test
    public void testJobsForEquality(){
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobB = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    //Generate two Job objects that have identical field values EXCEPT for id.
    // Test that equals returns false.

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        boolean a = testJob.toString.contains(System.lineSeparator());
        assertEquals(true, a);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){

    }

    @Test
    public void testToStringHandlesEmptyField(){

    }

}

//arrange
//act
//assert