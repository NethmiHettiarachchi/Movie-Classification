/**
 * Created by Thilanka on 12/19/2014.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nethmi Hettiarachchi
 */
public class NewEmptyJUnitTest {
    Knn1 instance;


    public NewEmptyJUnitTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    List <Knn1.Genre> genreList = new ArrayList<Knn1.Genre>();
    List <Knn1.Result> resultList = new ArrayList<Knn1.Result>();
    // Collections.sort(resultList,new Knn1.DistanceComperator());

    static class  Result{
        double distance;
        String genreName;

        public Result(double distance,String genreName){
            this.genreName=genreName;
            this.distance=distance;
        }
    }





    @Test
    public void testClassify_plot1() {
        Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\taken.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Action";
        // String result = Knn1;

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot2() {
        Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\saw.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Action";
        // String result = Knn1;

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot3() {
        // Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\parker.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Action";
        // String result = Knn1;

        assertEquals(expResult, result);

    }



    @Test
    public void testClassify_plot4() {
        // Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\proposal.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";
        // String result = Knn1;

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot5() {
        Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\faultinourstars.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Romance";
        // String result = Knn1;

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot6() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\mazerunner.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Action";
        // String result = Knn1;

        assertEquals(expResult, result);

    }


    @Test
    public void testClassify_plot7() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\blindside.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Sport";
        // String result = Knn1;

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot8() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\millionarm.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";
        // String result = Knn1;

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot9() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\wrestler.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";
        // String result = Knn1;

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot10() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\psiloveu.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Romance";
        // String result = Knn1;

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot11() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\walktoremember.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Romance";
        // String result = Knn1;

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot12() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\walktoremember.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Romance";
        // String result = Knn1;

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot13() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\jack.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Action";
        // String result = Knn1;

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot14() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\four.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Action";
        // String result = Knn1;

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot15() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\after.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Action";
        // String result = Knn1;

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot16() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\jenna.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Action";
        // String result = Knn1;

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot17() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\crime.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Action";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot18() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\yona.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Action";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot19() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\yona.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Action";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot20() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\1972.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Action";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot21() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\lovestory.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Romance";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot22() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\roman.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Romance";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot23() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\gloria.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Romance";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot24() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\emery.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Romance";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot25() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\aliens.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Action";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot26() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\elmira.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot27() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\jeremy.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot28() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\napo.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot29() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\merry.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot30() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\image.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot31() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\andrew.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot32() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\selda.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot33() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\freeman.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot34() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\will.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot35() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\fiona.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot36() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\once.txt";
        //javaapplication31.Knn1 instance;
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Music";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot37() {
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\bob.txt";
        //javaapplication31.Knn1 instance;
        //Knn1 instance;
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Muusic";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot38() {
        // Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\school.txt";
        //javaapplication31.Knn1 instance;
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Music";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot39() {
        //  Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\august.txt";
        //javaapplication31.Knn1 instance;
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Music";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot40() {
        //  Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\sugar.txt";
        //javaapplication31.Knn1 instance;
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Music";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot41() {
        //  Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\40.txt";
        //javaapplication31.Knn1 instance;
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot42() {
        //  Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\let.txt";
        //javaapplication31.Knn1 instance;
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot43() {
        //  Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\hangover.txt";
        //javaapplication31.Knn1 instance;
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot44() {
        //  Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\knocked.txt";
        //javaapplication31.Knn1 instance;
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot45() {
        //  Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\elf.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot46() {
        //  Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\boss.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot47() {
        //  Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\super.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot48() {
        //  Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\dumb.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot49() {
        //  Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\teting-plots\\pie.txt";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }

    @Test
    public void testClassify_plot50() {
        //  Knn1 instance;
        String filename ="E:\\EDucational\\Acadamic\\Com Eng\\Short Sem\\CO227\\Projects\\Our Project\\Movie\\Testing plots\\romance\\two states 2014";
        instance = new Knn1();
        String result = instance.run(filename);
        String expResult = "Comedy";

        assertEquals(expResult, result);

    }


}
