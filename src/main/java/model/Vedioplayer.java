package model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class Vedioplayer {
	private State currentState;
	private String videoName;
	private int currentPosition;
	
	@JsonIgnore
	private boolean isLocked = false; 
	@JsonIgnore
	private final State playState;
	
	@JsonIgnore
	private final State pauseState;
	
	@JsonIgnore
	private final State stopState;
	

	@JsonIgnore
	private final State lockState;
	
	public Vedioplayer(String videoName) {
		this.playState = new PlayingState();
		this.pauseState = new PauseState();
		this.stopState = new StopState();
		this.lockState = new LockState();
		this.videoName = videoName;
        this.currentPosition = 0;
        this.currentState = stopState;
		
        
	}
	
	
	   // Track lock state
	    
	    public void toggleLock() {
	        if (isLocked) {
	            pressUnlock();
	        } else {
	            pressLock();
	        }
	        isLocked = !isLocked;  // Toggle the state
	    }
	    
	    public boolean isLocked() {
	        return isLocked;
	    }
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public String getCurrentState() {
		return currentState.getState();
	}

	public String getVideoName() {
		return videoName;
	}

	public int getCurrentPosition() {
		return currentPosition;
	}
	
	 public void setCurrentPosition(int position) {
	        this.currentPosition = position;
	 }
	 
    public String getFormattedPosition() {
        int minutes = currentPosition / 60;
        int seconds = currentPosition % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
	public State getPlayState() {
		return playState;
	}

	public State getPauseState() {
		return pauseState;
	}

	public State getStopState() {
		return stopState;
	}
	
	public State getLockedState() {
		// TODO Auto-generated method stub
		return lockState;
	}
	public void pressLock() {
        currentState.pressLock(this);
    }
    
    public void pressUnlock() {
        currentState.pressUnlock(this);
    }
    
    // NEW: Getter for locked state

	//Business logic
	 
	public void pressPlay() {
		currentState.pressPlay(this);
	}
	
	public void pressPause() {
		currentState.pressPause(this);
	}
	
	public void pressStop() {
		currentState.pressStop(this);
	}



	
	
	
	
}
