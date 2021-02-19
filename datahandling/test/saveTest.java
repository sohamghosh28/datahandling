/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Soham
 */
public class saveTest {
    FileReader reader;String Header="HeaderField";
    
    public saveTest() {
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

    /**
     * Test of main method, of class save.
     */
    @Test
    public void testMain() throws IOException, ParseException {
        JSONParser jsonparser=new JSONParser();
        reader=new FileReader("C:\\Users\\Soham\\Desktop/demo.json");
        Object ob=jsonparser.parse(reader);
        System.out.println("main");
        String[] args = null;
        save.main(args);
        //assertEquals("HeaderField",Header);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
