import java.time.LocalDate;

public class PastEvents{
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    private int totalParticipants;
    private int totalEventDays;
    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    private static final double eventCost=10_000;
    private String paymentDetails;

    public PastEvents(String eventID, String eventName, String eventLocation, String eventPointOfContact, int totalParticipants, int totalEventDays, LocalDate eventStartDate, LocalDate eventEndDate, String paymentStatus, boolean requiresExtension) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventPointOfContact = eventPointOfContact;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.paymentStatus = paymentStatus;
        this.requiresExtension = requiresExtension;
    }
public String toString() {
        return "Past Event details:"+'\n'+
                "Event ID: "+ eventID +'\n'+
                "Event Name: "+eventName+'\n'+
                "Event Location: "+eventLocation+'\n'+
                "Total Participants: "+totalParticipants+'\n'+
                "Total Event Cost:"+eventCost+'\n';
    }


}