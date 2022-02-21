import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {

    private ExerciseManagement mgmt;

    @Before
    public void initialize() {
        mgmt = new ExerciseManagement();
    }


    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, mgmt.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        mgmt.add("Write a test");
        assertEquals(1, mgmt.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        mgmt.add("Write a test");
        assertTrue(mgmt.exerciseList().contains("Write a test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        mgmt.add("New exercise");
        mgmt.markAsCompleted("New exercise");
        assertTrue(mgmt.isCompleted("New exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        mgmt.add("New exercise");
        mgmt.markAsCompleted("New exercise");
        assertFalse(mgmt.isCompleted("Some exercise"));
    }
    

    
}
