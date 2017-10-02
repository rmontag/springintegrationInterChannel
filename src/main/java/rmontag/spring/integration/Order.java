package rmontag.spring.integration;

import java.io.Serializable;

public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private boolean billed;
    private boolean invUpdated;
    private boolean emailSent;

    public Order(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public void setInvUpdated(boolean invUpdated) {
        this.invUpdated = invUpdated;
    }

    public void setEmailSent(boolean emailSent) {
        this.emailSent = emailSent;
    }
    
    public void setBilled(boolean billed) {
        this.billed = billed;
    }

    public String toString() {
        return "Order: [ID: " + id + " order billed: " + billed + ", inventory update: " + invUpdated + ", email sent: " + emailSent + "]";
    }
}
