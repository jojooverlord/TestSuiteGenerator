package tsg.objects;

public class Constrain2 implements IConstrainObj {
    public Boolean getIsPassed(Object obj, Boolean result){
        Boolean isPassed = result;

        String seatClass = ((TestCase) obj).getSeatClass();
        String upgrade = ((TestCase) obj).getUpgrade();

        isPassed = (seatClass != "E" ) ^ (upgrade != "_") ;
        return isPassed == result;
    }

    public Object randomCase(Object obj, Boolean result){
        String[] seatClass = {"F", "B", "E"};
        String[] upgrade = {"U", "N"};

        ((TestCase)obj).setSeatClass(randomObj(seatClass));
        ((TestCase)obj).setUpgrade(randomObj(upgrade));

        while(!getIsPassed(obj, result)){
            ((TestCase)obj).setSeatClass(randomObj(seatClass));
            ((TestCase)obj).setUpgrade(randomObj(upgrade));
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
