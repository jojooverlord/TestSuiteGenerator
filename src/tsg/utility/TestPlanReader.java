package tsg.utility;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import tsg.objects.TestPlanObj;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestPlanReader {
    public static List<TestPlanObj> readTestPlan(String path) throws Exception {
        List<TestPlanObj> list = new ArrayList<TestPlanObj>();
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(path));
            JSONObject testPlanJson = (JSONObject) obj;
            JSONArray categoryList = (JSONArray) testPlanJson.get("Categories");
            Iterator i = categoryList.iterator();

            while (i.hasNext()) {
                TestPlanObj tpo = jsonToToObj((JSONObject)i.next());
                if(tpo != null){
                    list.add(tpo);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    private static TestPlanObj jsonToToObj(JSONObject obj){
        TestPlanObj tpo = new TestPlanObj();
        try{
            tpo.setCategory((String)obj.get("Category"));
            tpo.setCount((Integer) obj.get("Count"));
            tpo.setTestDetail((Boolean[]) obj.get("TestDetail"));
            JSONArray children = (JSONArray) obj.get("Children");
            Iterator i = children.iterator();

            while(i.hasNext()){
                TestPlanObj c = jsonToToObj((JSONObject)i.next());
                if(c != null){
                    tpo.addChildren(c);
                }
            }
            return tpo;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
