public class ConferenceEvent extends Event {
    private boolean breakfastRequired ;
    private double brefakfastCost ;
    private boolean lunchRequired ;
    private double lunchCost ;
    private boolean dinnerRequired ;
    private double dinnerCost ;
    private double conferenceEventCost ;

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String pointOfContact,  int totalParticipants, int totalEventDays , 
    double brefakfastCost, double lunchCost, double dinnerCost ) {
       super(eventID, eventName, eventLocation, pointOfContact, totalParticipants, totalEventDays, totalEventDays);
       this.brefakfastCost = brefakfastCost;
       this.lunchCost = lunchCost;
       this.dinnerCost = dinnerCost;
   } 

   public double getbreakfastCost() {
       return brefakfastCost;
   }

   public void setbreakfastCost(double brefakfastCost) {
       this.brefakfastCost = brefakfastCost;
   }

   public double getlunchCost() {
       return lunchCost;
   }

   public void setlunchCost(double lunchCost) {
       this.lunchCost = lunchCost;
   }

   public double getdinnerCost() {
       return dinnerCost;
   }

   @Override
   public void calculateEventCost() {
       conferenceEventCost = geteventCost() +((getbreakfastCost() + getlunchCost() + getdinnerCost())*gettotalParticipants()*gettotalEventDays());
   }


   @Override
   public String toString() {
       return "Conference Event details :" + "\n" +
              "Event ID: " + geteventID() + "\n" +
              "Event Name: " + geteventName() + "\n" +
              "Event Location: " + geteventLocation() + "\n" +
             "Total Participants: " + gettotalParticipants() + "\n" +
             "Total Conference Cost: " + conferenceEventCost;
               
           }

}
   