package service;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import model.Vedioplayer;

@Service
public class VedioplayerService {

		private Vedioplayer player;
		
		@PostConstruct
		void inti() {
			player = new Vedioplayer("sample.mp4");
		}
		
		public Vedioplayer getPlayerStatus() {
			return player;
		}
		
		public Vedioplayer pressPlay() {
			player.pressPlay();
			return player;
		}
		
		public Vedioplayer pressPause() {
			player.pressPause();
			return player;
		}
		
		public Vedioplayer pressStop() {
			player.pressStop();
			return player;
		}
		
		 
	    public Vedioplayer loadVideo(String videoName) {
	        this.player = new Vedioplayer(videoName);
	        return player;
	    }
	    
	    public Vedioplayer seekTo(int position) {
	    	player.setCurrentPosition(position);
	        return player;
	    }

	    public Vedioplayer toggleLock() {
	        player.toggleLock();
	        return player;
	    }
	    
	    public boolean isLocked() {
	        return player.isLocked();
	    }
}
