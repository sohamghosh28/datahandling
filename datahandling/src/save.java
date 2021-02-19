
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import static javax.swing.text.html.HTML.Tag.S;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soham
 */
public class save {
    public static void main(String args[])throws IOException, ParseException
    {
        JSONParser jsonparser=new JSONParser();
        FileReader reader=new FileReader("C:\\Users\\Soham\\Desktop/demo.json");
        Object ob=jsonparser.parse(reader);
        JSONObject jsonob=(JSONObject)ob;
        Map Header=(HashMap)jsonob.get("HeaderField");
        Header.put("senderID","ICEGATE");
        
        try(FileWriter writer=new FileWriter("C:\\Users\\Soham\\Desktop/demo1.json"))
        {
            writer.write(jsonob.toString());
            writer.flush();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
}
}
