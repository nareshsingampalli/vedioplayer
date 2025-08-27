package model;

public class PauseState implements State {

	@Override
	public void pressPlay(Vedioplayer player) {
		// TODO Auto-generated method stub
		
		player.setCurrentState(player.getPlayState());
        player.setCurrentPosition(player.getCurrentPosition() + 2);
		
	}

	@Override
	public void pressPause(Vedioplayer player) {
		// TODO Auto-generated method stub
		
		// Already stopped - do nothing
		
	}

	@Override
	public void pressStop(Vedioplayer player) {
		// TODO Auto-generated method stub
		
		player.setCurrentPosition(0);
		player.setCurrentState(player.getStopState());
		
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
		return "PAUSED";
	}

}
