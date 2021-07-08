package Classes;

import java.util.ArrayList;


public class Room {
    
    private String name;
    private String contact;
    private String gender;
    private double price;
    private int nights;
    private final ArrayList<Food> foodList = new ArrayList();
    
    

    
    
    public Room(String name, String contact, String gender, double price, int nights) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
        this.price = price;
        this.nights = nights;
    }



    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the nights
     */
    public int getNights() {
        return nights;
    }

    /**
     * @param nights the nights to set
     */
    public void setNights(int nights) {
        this.nights = nights;
    }

    /**
     * @return the foodList
     */
    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    /**
     * @param food
     */
    public void addFood(Food food) {
        this.foodList.add(food);
    }
    
    /**
     * @param food 
     */
    public void removeFood(Food food){
        this.foodList.remove(food);
    }
    
    
   
    
    
    
}
