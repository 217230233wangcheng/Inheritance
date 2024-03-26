import java.time.LocalDate;

public class PastEvents extends Event {
    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    private static final double eventCost = 10000;


    public PastEvents(String eventID, String eventName, String eventLocation, String eventPointOfContact,
            double eventCost, int totalParticipants, int totalEventDays) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.paymentStatus = paymentStatus;
        this.requiresExtension = requiresExtension;
        
    }


    
    public String getPaymentDetails() {
        String extension = requiresExtension ? "Request an extension of time" : "No extension required";
        return "The event cost is" + eventCost + ",Payment status is" + paymentStatus + "Does the customer request an extension? :" + extension + "。";
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Event start date" + eventStartDate + "\n" +
                "Event End Date" + eventEndDate + "\n" +
                "Payment status" + paymentStatus + "\n" +
                "Customer requests an extension" + requiresExtension;
    }

    @Override
    public void calculateEventCost() {
        
        throw new UnsupportedOperationException("Unimplemented method 'calculateEventCost'");
    }
}
