package SDALab8.task2;

/**
 * Playing.java
 *
 * This file represents the Playing state
 */

public class Lock implements State {
    private RemoteDevice remote;

    public Lock(RemoteDevice remote) {
        this.remote = remote;
    }

    // the Play button is pressed
    public boolean pressPlay() {
        System.out.println("The player is Locked.");
        return false;
    }

    // the Pause button is pressed
    public boolean pressPause() {
        System.out.println("The player is Locked.");

        return false;
    }

    // the Stop button is pressed
    public boolean pressStop() {
        System.out.println("The player is Locked.");

        return false;
    }

    public boolean pressRewind(){
        System.out.println("The player is Locked.");

        return false;
    }
    public boolean pressLock(){
        System.out.println("The player is already Locked.");

        return false;
    }
    public boolean pressUnlock(){
        System.out.println("The player is Unlocked");
        remote.setState(remote.getUnlockedState());
        return true;
    }

}
