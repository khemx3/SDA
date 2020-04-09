package SDALab8.task2;


/**
 * Playing.java
 *
 * This file represents the Playing state
 */

public class Unlock implements State {
    private RemoteDevice remote;

    public Unlock(RemoteDevice remote) {
        this.remote = remote;
    }

    // the Play button is pressed
    public boolean pressPlay() {
        System.out.println("The player is now playing.");
        remote.setState(remote.getPlayingState());
        remote.setPosition(remote.getPosition()+1);

        return true;
    }

    // the Pause button is pressed
    public boolean pressPause() {
        System.out.println("The player is now paused.");
        remote.setState(remote.getPausedState());

        return true;
    }

    // the Stop button is pressed
    public boolean pressStop() {
        System.out.println("The player is stopped.");
        remote.setState(remote.getStoppedState());
        remote.setPosition(0);

        return true;
    }

    public boolean pressRewind(){
        System.out.println("Cannot rewind while not in stop mode");
        return false;
    }
    public boolean pressLock(){
        System.out.println("The player is now LOCKED");
        remote.setState(remote.getLockedState());
        return true;
    }
    public boolean pressUnlock(){
        System.out.println("The player is not locked");
        return false;
    }

}
