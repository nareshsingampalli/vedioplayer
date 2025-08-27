package model;

interface State {
	void pressPlay(Vedioplayer player);
	void pressPause(Vedioplayer player);
	void pressStop(Vedioplayer player);
	String getState();
	   // NEW: Default implementations for lock/unlock
    default void pressLock(Vedioplayer context) {
        System.out.println("🔒 Locking player from " + getState() + " state");
        context.setCurrentState(context.getLockedState());
    }
    
    default void pressUnlock(Vedioplayer context) {
        System.out.println("🔓 Already unlocked in " + getState() + " state");
        // Default behavior: do nothing (only LockedState will override this)
    }
}
