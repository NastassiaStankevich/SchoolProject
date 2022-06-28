package by.itstep.stank.javalessons.lesson22.model.logic;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class SchoolManagerTest {

    private static int [][] groups;

    @BeforeClass
    public static void init() {
        groups = new int[][] {
                {7, 7, 8, 2},
                {9, 8, 9, 10},
                {7, 7, 1},
                {8, 8, 10, 10}
        };
    }

 //   @Before
 //   public void init() {
 //        groups = new int[][] {
 //               {7, 7, 8, 2},
 //               {9, 8, 9, 10},
    //               {7, 7, 1},
//                {8, 8, 10, 10}
//         };
//    }

    @After
    public void destroy(){
        groups = null;
    }



    @Test
    public void testCalculateAvgMarkPositive(){
        double expected = 7.4;

        double actual = SchoolManager.calculateAvgMark(groups);

        assertEquals(expected, actual, 0.5);
    }

    @Test
    public void testFindBadStudentGroupsPositive(){

        String expected = "1 3";

        String actual = SchoolManager.findBadStudentGroups(groups);

        assertEquals(expected, actual);

    }

    @Test
    public void testFindGroupsWithoutBadStudentsPositive(){
        String expected = "24";

        String actual = SchoolManager.findGroupsWithoutBadStudents(groups);

        assertEquals(expected, actual);

    }

}
