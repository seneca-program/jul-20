package com.senecafoundation;

public class Car {
    private Boolean isDoorOpen;
    private int rpms;
    private int windows;
    private int maxRPM = 200;
    
    public int getMaxRPM() {
        return maxRPM;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getWindows() {
        return windows;
    }

    public Boolean getIsDoorOpen() {
        return isDoorOpen;
    }
    public void setIsDoorOpen(Boolean isDoorOpen) {
        this.isDoorOpen = isDoorOpen;
    }

    public int getRpms() {
        return rpms;
    }

    public void setRpms(int rpms) {
        if (rpms > this.maxRPM) {
            System.out.println("That's too many rpms, it would break the car");
            this.rpms = 0; 
        }
        else {
            this.rpms = rpms;  
        }
    }

    public Car(int rpmFromUser, Boolean isDoorOpenFromUser, int windowsFromUser, int maxRPMFromUser) {
        this.rpms = rpmFromUser;
        this.isDoorOpen = isDoorOpenFromUser;
        this.windows = windowsFromUser;
        this.maxRPM = maxRPMFromUser;
    }

    public void increaseRpm(int rpmfromuser) {
        this.rpms += rpmfromuser;
    }

    public void decreaseRpm(int rpmfromuser) {
        this.rpms -= rpmfromuser;
    }

    public void openDoor() {
        this.isDoorOpen = true;
    }

    public void closeDoor() {
        this.isDoorOpen = false;
    }

    // example of a method that should remain in any car
    public void outputDetails() {
        System.out.println("Car Details");
        System.out.println("RPM: " + rpms);
        System.out.println("Door Open: " + isDoorOpen);
        System.out.println("This car's max RPMs: " + this.maxRPM);
    }
}
