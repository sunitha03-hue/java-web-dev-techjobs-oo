package org.launchcode.techjobs_oo.Tests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static junit.framework.TestCase.*;

public class JobTest {
    private Job job1,job2,job3,job4, job5, job6, job7, job8, job9;
    private String id1,id2;
    @Before
    public void createJob() {
         job1 = new Job();
         job2 = new Job();
    }
    @Test
    public void testSettingJobId() {
         assertEquals(job1.getId(),job2.getId(), 1);
    }
    @Test
    public void testJobConstructorSetAllFields()
    {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new org.launchcode.techjobs_oo.PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());
    }
     @Test
    public void testJobsForEquality(){
        assertFalse(job1.equals(job2));
    }
@Test
public void toBefore() {
    job7 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
    assertTrue(job7.toString().startsWith("\n"));
    assertTrue(job7.toString().endsWith("\n"));
    assertTrue(job7.toString().startsWith(""));
    assertTrue(job7.toString().endsWith(""));
    assertNotNull(job7.getEmployer().getValue()==null);
    /*Job job7 = new Job("Name:----", new Employer("Employer:----"), new Location("Location:----"), new org.launchcode.techjobs_oo.PositionType("Position Type:----"), new CoreCompetency("Core Competency:----"));
    assertEquals("Name:----", job7.getName());
    assertEquals("Employer:----", job7.getEmployer().getValue());
    assertEquals("Location:----", job7.getLocation().getValue());
    assertEquals("Position Type:----", job7.getPositionType().getValue());
    assertEquals("Core Competency:----", job7.getCoreCompetency().getValue());*/

}
    @After
    public void toAfter() {
        Job job8 = new Job("Name:-----", new Employer("Employer:-----"), new Location("Location:-----"), new org.launchcode.techjobs_oo.PositionType("Position Type:-----"), new CoreCompetency("Core Competency:-----"));
        assertEquals("Name:-----", job8.getName());
        assertEquals("Employer:-----", job8.getEmployer().getValue());
        assertEquals("Location:-----", job8.getLocation().getValue());
        assertEquals("Position Type:-----", job8.getPositionType().getValue());
        assertEquals("Core Competency:-----", job8.getCoreCompetency().getValue());
    }
    public String toString(){
        Job job9 = new Job("---", new Employer("---"), new Location("---"), new org.launchcode.techjobs_oo.PositionType("---"), new CoreCompetency("---"));
        assertEquals("Name:----", job9.getName());
        assertEquals("Employer:----", job9.getEmployer().getValue());
        assertEquals("Location:----", job9.getLocation().getValue());
        assertEquals("Position Type:----", job9.getPositionType().getValue());
        assertEquals("Core Competency:----", job9.getCoreCompetency().getValue());
        return " ";

    }
}



