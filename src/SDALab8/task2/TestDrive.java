package SDALab8.task2;


public class TestDrive {
	public static void main(String[] args) {
		RemoteDevice remote = new RemoteDevice();
		//remote.setState(remote.getPlayingState());
		remote.pressPlay();
		remote.pressPause();
		remote.pressStop();
		remote.pressRewind();
		remote.pressRewind();
		remote.pressPlay();
		remote.pressLock();
		remote.pressPlay();
		remote.pressUnlock();
		remote.pressPlay();
	}

}
