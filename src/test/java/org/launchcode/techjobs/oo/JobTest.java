package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class JobTest {

    //testData
    @Before
    public void createTestData(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
         //TODO: Create your unit tests here

    @Test
    public void testSettingJobId(){
        Job testJobA = new Job();
        Job testJobB = new Job();

        assertNotEquals(testJobA.getId(), testJobB.getId());
    }

    //Create two Job objects using the empty constructor.
    //
    //Use assertNotEquals to verify that the IDs of the
    // two objects are distinct.

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob.getEmployer() instanceof Employer);
        assertEquals("ACME", testJob.getEmployer().getValue());

        assertTrue(testJob.getLocation() instanceof Location);
        assertEquals("Desert", testJob.getLocation().getValue());

        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertEquals("Quality control", testJob.getPositionType().getValue());

        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());

        assertTrue(testJob.getName() instanceof String);
        assertEquals("Product tester", testJob.getName());
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

        assertNotEquals(jobA, jobB);
    }

    //Generate two Job objects that have identical field values EXCEPT for id.
    // Test that equals returns false.

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob.toString().contains(System.lineSeparator()));
        //first & last character
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String testLine = System.lineSeparator();

        String testString =
                testLine +
                "ID: " + 2 + testLine +
                "Name: " + "Product tester" + testLine +
                "Employer: " + "ACME" + testLine +
                "Location: " + "Desert" + testLine +
                "Position Type: " + "Quality control" + testLine +
                "Core Competency: " + "Persistence" + testLine;

        assertEquals(testString, testJob.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){

    }

}

//arrange
//act
//assert