package tsg.objects;

public class Constrain4 implements IConstrainObj {
    public Boolean getIsPassed(Object obj, Boolean result){
        Boolean isPassed = result;

        String passengerType = ((TestCase) obj).getPassengerType();
        String vIPType = ((TestCase) obj).getVIPType();

        isPassed = (passengerType != "V") ^ (vIPType != "_") ;
        return isPassed == result;
    }

    public Object randomCase(Object obj, Boolean result){
        String[] passengerType = {"V", "N"};
        String[] vIPType = {"G", "D", "_"};

        ((TestCase)obj).setPassengerType(randomObj(passengerType));
        ((TestCase)obj).setVIPType(randomObj(vIPType));

        while(!getIsPassed(obj, result)){
            ((TestCase)obj).setPassengerType(randomObj(passengerType));
            ((TestCase)obj).setVIPType(randomObj(vIPType));
        }
        return obj;
    }

    public String randomObj(String[] list){
        double d = Math.random()*list.length;
        int index = Math.round((float)d);
        String obj = list[index];
        return obj;
    }
}
