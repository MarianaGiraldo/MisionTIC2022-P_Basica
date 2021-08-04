package Classes;

public class DoubleRoom extends Room {

    private String name2;
    private String contact2;
    private String gender2;

    public DoubleRoom(  String name, 
                        String contact, 
                        String gender, 
                        double price, 
                        int nights, 
                        String name2, 
                        String contact2, 
                        String gender2) {
        super(name, contact, gender, price, nights);
        this.name2 = name2;
        this.contact2 = contact2;
        this.gender2 = gender2;
    }

    /**
     * @return the name2
     */
    public String getName2() {
        return name2;
    }

    /**
     * @param name2 the name2 to set
     */
    public void setName2(String name2) {
        this.name2 = name2;
    }

    /**
     * @return the contact2
     */
    public String getContact2() {
        return contact2;
    }

    /**
     * @param contact2 the contact2 to set
     */
    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    /**
     * @return the gender2
     */
    public String getGender2() {
        return gender2;
    }

    /**
     * @param gender2 the gender2 to set
     */
    public void setGender2(String gender2) {
        this.gender2 = gender2;
    }
    
    
    
}
