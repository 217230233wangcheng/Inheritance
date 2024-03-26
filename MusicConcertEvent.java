public class MusicConcertEvent extends Event{
    
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private double musicConcertEventCost;

  
    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays, double merchandiseCost) {
        super(eventID, eventName, eventLocation, pointOfContact, totalParticipants, totalEventDays, totalEventDays);
        this.merchandiseCost = merchandiseCost;
    }


    public boolean isMerchandiseRequired() {
        return merchandiseRequired;
    }

    public void setMerchandiseRequired(boolean merchandiseRequired) {
        this.merchandiseRequired = merchandiseRequired;
    }

    public double getmerchandiseCost() {
        return merchandiseCost;
    }

    public void setmerchandiseCost(double merchandiseCost) {
        this.merchandiseCost = merchandiseCost;
    }

    public double getMusicConcertEvenCost() {
        return musicConcertEventCost;
    }

    public void setMusicConcertEvenCost(double musicConcertEvenCost) {
        this.musicConcertEventCost = musicConcertEvenCost;
    }

   
    public void calculateEventCost() {
        musicConcertEventCost = geteventCost() + (getmerchandiseCost() *  gettotalParticipants() * gettotalEventDays());
    }

  
    @Override
    public String toString() {
        return  "Event ID: " + geteventID() + "\n" +
                "Event Name: " + geteventName() + "\n" +
                "Event Location: " + geteventLocation() + "\n" +    
                "Total Participants: " + gettotalParticipants() + "\n" +
                "Total MusicConcert Cost: " + musicConcertEventCost;
    }
}