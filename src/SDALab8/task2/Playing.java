package SDALab8.task2;

/**
 * Playing.java
 *
 * This file represents the Playing state
 */

public class Playing implements State {
	private RemoteDevice remote;
	
	public Playing(RemoteDevice remote) {
		this.remote = remote;
	}

	// the Play button is pressed
	public boolean pressPlay() {
		System.out.println("The player is already playing.");
		
		return false;
	}

	// the Pause button is pressed
	public boolean pressPause() {
		System.out.println("The player is paused.");
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
		System.out.println("Cannot rewind while playing");
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
