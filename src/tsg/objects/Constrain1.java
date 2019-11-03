package tsg.objects;

public class Constrain1 implements IConstrainObj {
    public Boolean getIsPassed(Object obj, Boolean result){
        Boolean isPassed = result;

        String seatClass = ((TestCase) obj).getSeatClass();
        String tripRange = ((TestCase) obj).getTripRange();

        isPassed = (seatClass != "F" ) || (tripRange == "N");
        return isPassed == result;
    }

    public Object randomCase(Object obj, Boolean result){
        String[] seatClass = {"F", "B", "E"};
        String[] tripRange = {"D", "N"};

        ((TestCase)obj).setSeatClass(randomObj(seatClass));
        ((TestCase)obj).setTripRange(randomObj(tripRange));

        while(!getIsPassed(obj, result)){
            ((TestCase)obj).setSeatClass(randomObj(seatClass));
            ((TestCase)obj).setTripRange(randomObj(tripRange));
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
