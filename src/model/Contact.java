package model;

public class Contact {
    private String fullName;
    private long phoneNumber;
    private long id;

    public Contact() {
    }

    public Contact(String fullName, long phoneNumber, long id) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contact: " +"\n"+
                " fullName: " + fullName  +" /"+
                "  phoneNumber: " + phoneNumber +" /"+
                "   id: "+id+"\n\n";
    }
}
