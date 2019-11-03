package tsg.testCase;

import tsg.objects.*;

public class Constrains {
    private static IConstrainObj[] list = new IConstrainObj[]{
            new Constrain1(), new Constrain2(), new Constrain3(), new Constrain4()
    };

    public static IConstrainObj getConstrain(Integer index){
        return list[index];
    }
}
