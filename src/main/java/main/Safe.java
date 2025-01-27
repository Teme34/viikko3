package main;

import java.util.ArrayList;

public class Safe {
    private String pinCode;
    private ArrayList<String> safeFolder = new ArrayList<>();

    public Safe() {
        pinCode = "0000";
    }

    public Safe(String pinCode) {
        this.pinCode = pinCode;
    }

    public void changePin(String pinCode) {
            this.pinCode = pinCode;    
    }

    public void addString(String string) {
            safeFolder.add(string);
    }

    public ArrayList<String> getList(String pin) {               
                    if(pin.equals(pinCode)) {
                        return safeFolder;
                    } else {
                        System.out.println("Väärä PIN-koodi!");
                            return null;
                    }
                    
    }
}
    

