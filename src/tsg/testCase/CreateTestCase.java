package tsg.testCase;

import tsg.objects.IConstrainObj;
import tsg.objects.TestPlanObj;
import tsg.testCase.Constrains;

import java.util.Arrays;

public class CreateTestCase {
    public static Object NewTestCase(TestPlanObj tpo){
        Object obj = new Object();

        Boolean[] testDetail = tpo.getTestDetail();
        for (int i =0; i< testDetail.length; i++){
            obj = ParseConstrain(obj, i, testDetail[i]);
        }
        return obj;
    }

    public static Object ParseConstrain(Object obj, Integer cIndex, Boolean test){
        IConstrainObj constrainObj = Constrains.getConstrain(cIndex);
        constrainObj.randomCase(obj, test);
        return obj;
    }
}
