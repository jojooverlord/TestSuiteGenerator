package tsg.main;

import tsg.objects.TestCase;
import tsg.objects.TestPlanObj;
import tsg.testCase.CreateTestCase;
import tsg.utility.TestPlanReader;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static String jsonPath = "/testPlan/testPlan.json";
    public static void main(String[] args) {
        List<TestCase> list = new ArrayList<TestCase>();
        try{
            List<TestPlanObj> testPlan = TestPlanReader.readTestPlan(jsonPath);
            testPlan.stream().forEach(plan -> {
                plan.getChildren().stream().forEach(c ->{
                    for(int i = 0; i< c.getCount(); i++){
                        TestCase tc = (TestCase)CreateTestCase.NewTestCase(c);
                        while(list.contains(tc)){
                            tc = (TestCase)CreateTestCase.NewTestCase(c);
                        }
                        list.add(tc);
                    }
                });
            });


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
