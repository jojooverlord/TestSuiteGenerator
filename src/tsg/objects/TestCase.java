package tsg.objects;

import java.util.ArrayList;
import java.util.List;

public class TestCase {

//    String refNo;
    String SeatClass;
    String TripRange;
    String Upgrade;
    String TripType;
    String TripLength;
    String FlighType;
    String PassengerType;
    String VIPType;
    String Season;
    String DiscountType;
    String isValid;

//    public void setRefNo(String ref){ this.refNo = ref;}
    public void setSeatClass(String str){
        this.SeatClass = str;
    }
    public void setTripRange(String str){
        this.TripRange = str;
    }
    public void setUpgrade(String str){
        this.Upgrade = str;
    }
    public void setTripType(String str){
        this.TripType = str;
    }
    public void setTripLength(String str){
        this.TripLength = str;
    }
    public void setFlighType(String str){
        this.FlighType = str;
    }
    public void setPassengerType(String str){
        this.PassengerType = str;
    }
    public void setVIPType(String str){
        this.VIPType = str;
    }
    public void setSeason(String str){
        this.Season = str;
    }
    public void setDiscountType(String str){
        this.DiscountType = str;
    }
    public void setisValid(String str){
        this.isValid = str;
    }

//    public String getRefNo(){return this.refNo;}
    public String  getSeatClass(){
        return this.SeatClass;
    }
    public String  getTripRange(){
        return this.TripRange;
    }
    public String  getUpgrade(){
        return this.Upgrade;
    }
    public String  getTripType(){
        return this.TripType;
    }
    public String  getTripLength(){
        return this.TripLength;
    }
    public String  getFlighType(){
        return this.FlighType;
    }
    public String  getPassengerType(){
        return this.PassengerType;
    }
    public String  getVIPType(){
        return this.VIPType;
    }
    public String  getSeason(){
        return this.Season;
    }
    public String  getDiscountType(){
        return this.DiscountType;
    }
    public String  getisValid(){
        return this.isValid;
    }

    public List<String> toStringList(){
        List<String> list = new ArrayList<>();
        list.add(SeatClass);
        list.add(TripRange);
        list.add(Upgrade);
        list.add(TripType);
        list.add(TripLength);
        list.add(FlighType);
        list.add(PassengerType);
        list.add(VIPType);
        list.add(Season);
        list.add(DiscountType);
        list.add(isValid);
        return list;
    }
}
