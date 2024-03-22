public class Event{
    public static final double insuranceCost = 1000.00;
public static final double tax = 0.3;
private static final String EventName = null;

    private String eventID;
    private String eventName;
    private String eventLocation;
    private String pointofContact;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;
    public Event(String eventID,String eventName,String eventLocation,String pointofContact,double eventCost,int totalParticipants,int totalEventDays){
        this.eventID=eventID;
        this.eventName=eventName;
        this.eventLocation=eventLocation;
        this.eventCost=eventCost;
        this.totalParticipants=totalParticipants;
        this.totalEventDays=totalEventDays;
    }
    public String geteventID(){
        return eventID;
    }
    public void seteventID(String eventID){
        this.eventID=eventID;
    }
    public String geteventName(){
        return eventName;
    }
    public void seteventName(String eventName){
        this.eventName=eventName;
    }
    public String geteventLocation(){
        return eventLocation;
    }
    public void seteventLoaction(String eventLocation){
        this.eventLocation=eventLocation;
    }
    public String getpointofContact(){
        return pointofContact;
    }
    public void setpointofContact(String pointofContact){
        this.pointofContact=pointofContact;
    }
    public double geteventCost(){
        return eventCost;
    }
    public void seteventCoast(double eventCost){
        this.eventCost=eventCost;
    }
    public int gettotalParticipants(){
        return totalParticipants;
    }
    public void settotalParticipants(int totalParticipants){
        this.totalParticipants=totalParticipants;
    }
    public int gettotalEventDays(){
        return totalEventDays;
    }
    public void settotalEventDays(int totalEventDays){
        this.totalEventDays=totalEventDays;
    }

    public String toString(){
        return eventName + " " + eventID + " " + eventLocation + " " 
        + pointofContact + " " + eventCost +" " + totalParticipants + ""
        + totalEventDays;
        
    }
    
    public void calculateEventCost(){
        this.eventCost = eventCost + (eventCost * tax)+insuranceCost;
    }

    
    

}