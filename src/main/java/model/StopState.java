package model;

public class StopState implements State {

	@Override
	public void pressPlay(Vedioplayer player) {
		// TODO Auto-generated method stub
		player.setCurrentPosition(0);
        player.setCurrentState(player.getPlayState());
        player.setCurrentPosition(player.getCurrentPosition() + 3);

	}

	@Override
	public void pressPause(Vedioplayer player) {
		// TODO Auto-generated method stub
		 
		// Cannot pause when stopped
	}

	@Override
	public void pressStop(Vedioplayer player) {
		// TODO Auto-generated method stub
		
		// Already stopped - do nothing
	
	}
	// In each existing state class, add:
	public void pressLock(Vedioplayer context) {
	    System.out.println("🔒 Locking player");
	    context.setCurrentState(context.getLockedState());
	}

	public void pressUnlock(Vedioplayer context) {
	    System.out.println("🔓 Already unlocked");
	    // Do nothing - only LockedState handles unlock
	}
	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return "STOP";
	}

}
