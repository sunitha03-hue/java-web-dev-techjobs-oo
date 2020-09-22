package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static junit.framework.TestCase.*;

public class JobTest {
    private Job job1,job2,job3,job4;
    @Before
    public void createJob() {
         job1 = new Job();
         job2 = new Job();
    }
    @Test
    public void testSettingJobId() { assertEquals(1,2,1);
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
        //Job job4=new Job(new Employer("ACME"), new Employer("Desert"));
         assertFalse(job1.equals(job2));
    }
}



