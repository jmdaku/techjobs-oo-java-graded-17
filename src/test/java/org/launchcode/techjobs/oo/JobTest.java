package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class JobTest {

    //testData
//    @Before
//    public void createTestData(){
//        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//    }
         //TODO: Create your unit tests here

    @Test
    //1
    public void testSettingJobId(){
        Job testJob1A = new Job();
        Job testJob1B = new Job();

        assertNotEquals(testJob1A.getId(), testJob1B.getId());
    }

    //Create two Job objects using the empty constructor.
    //
    //Use assertNotEquals to verify that the IDs of the
    // two objects are distinct.

    @Test
    //2
    public void testJobConstructorSetsAllFields(){
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob2.getEmployer() instanceof Employer);
        assertEquals("ACME", testJob2.getEmployer().getValue());

        assertTrue(testJob2.getLocation() instanceof Location);
        assertEquals("Desert", testJob2.getLocation().getValue());

        assertTrue(testJob2.getPositionType() instanceof PositionType);
        assertEquals("Quality control", testJob2.getPositionType().getValue());

        assertTrue(testJob2.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", testJob2.getCoreCompetency().getValue());

        assertTrue(testJob2.getName() instanceof String);
        assertEquals("Product tester", testJob2.getName());
    }

    //Use assertTrue and assertEquals statements to test
    // that the constructor correctly assigns both the class and value
    // of each field. Your test should have 5 assert statements of each type.
    //The instanceof keyword can be used to check the class of an object.
    // The result of the comparison is a boolean.

    @Test
    //3
    public void testJobsForEquality(){
        Job testJob3A = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob3B = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(testJob3A, testJob3B);
    }

    //Generate two Job objects that have identical field values EXCEPT for id.
    // Test that equals returns false.

    @Test
    //4
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        int length = testJob4.toString().length();

        Character stringStart = testJob4.toString().charAt(0);
        Character stringEnd = testJob4.toString().charAt(length - 1);

        assertEquals(System.lineSeparator(), String.valueOf(stringStart));
        assertEquals(System.lineSeparator(), String.valueOf(stringEnd));

    }

    @Test
    //5
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String testLine = System.lineSeparator();

        String testString =
                testLine +
                "ID: " + testJob5.getId() + testLine +
                "Name: " + "Product tester" + testLine +
                "Employer: " + "ACME" + testLine +
                "Location: " + "Desert" + testLine +
                "Position Type: " + "Quality control" + testLine +
                "Core Competency: " + "Persistence" + testLine;

        assertEquals(testString, testJob5.toString());
    }


    @Test
    //6
    public void testToStringHandlesEmptyField(){
        Job testJob6 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        String testLine = System.lineSeparator();
        String blankError = "Data not available";

        String testString =
                testLine +
                "ID: " + testJob6.getId() + testLine +
                "Name: " + blankError + testLine +
                "Employer: " + blankError + testLine +
                "Location: " + blankError + testLine +
                "Position Type: " + blankError + testLine +
                "Core Competency: " + blankError + testLine;

        assertEquals(testString, testJob6.toString());
    }
}

//arrange
//act
//assert