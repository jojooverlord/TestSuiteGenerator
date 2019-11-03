package tsg.objects;

public class Constrain3 implements IConstrainObj {
    public Boolean getIsPassed(Object obj, Boolean result){
        Boolean isPassed = result;

        String tripRange = ((TestCase) obj).getTripRange();
        String tripLength = ((TestCase) obj).getTripLength();
        String flightType = ((TestCase) obj).getFlighType();

        isPassed = (tripRange == "D") ^ ((tripLength != "_") && (flightType != "_"));
        return isPassed == result;
    }

    public Object randomCase(Object obj, Boolean result){
        String[] tripRange = {"D", "N"};
        String[] tripLength = {"S", "L", "_"};
        String[] flightType = {"D", "I", "_"};

        ((TestCase)obj).setTripType(randomObj(tripRange));
        ((TestCase)obj).setTripLength(randomObj(tripLength));
        ((TestCase)obj).setFlighType(randomObj(flightType));

        while(!getIsPassed(obj, result)){
            ((TestCase)obj).setTripType(randomObj(tripRange));
            ((TestCase)obj).setTripLength(randomObj(tripLength));
            ((TestCase)obj).setFlighType(randomObj(flightType));
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
