package model;

public class LockState implements State {

	@Override
	public void pressPlay(Vedioplayer player) {
		// TODO Auto-generated method stub
		 System.out.println("🔒 Cannot play - player is locked");
		
	}

	@Override
	public void pressPause(Vedioplayer player) {
		// TODO Auto-generated method stub
		System.out.println("🔒 Cannot pause - player is locked");
	}

	@Override
	public void pressStop(Vedioplayer player) {
		// TODO Auto-generated method stub
		System.out.println("🔒 Cannot stop - player is locked");
	}
	
	   @Override
	    public void pressLock(Vedioplayer context) {
	        System.out.println("🔒 Already locked");
	    }
	    
	    @Override
	    public void pressUnlock(Vedioplayer context) {
	        System.out.println("🔓 Unlocking player");
	        // Decide which state to return to after unlock
	        // For simplicity, let's return to StoppedState
	        context.setCurrentState(context.getStopState());
	    }

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return "LOCKED";
	}

}
