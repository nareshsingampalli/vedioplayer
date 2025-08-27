	package controller;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	
	import model.Vedioplayer;
	import service.VedioplayerService;
	
	@RestController
	@RequestMapping("/api/player")
	@CrossOrigin(origins = "*")
	public class VedioplayerController {
		
		
	private final VedioplayerService videoPlayerService;
	    @Autowired
	    public VedioplayerController(VedioplayerService videoPlayerService) {
	        this.videoPlayerService = videoPlayerService;
	    }
	    
	    @GetMapping("/status")
	    public Vedioplayer getStatus() {
	    	System.out.println("printing.....");
	        return videoPlayerService.getPlayerStatus();
	    }
	    
	    @PostMapping("/play")
	    public ResponseEntity<Vedioplayer> play() {
	        return ResponseEntity.ok(videoPlayerService.pressPlay());
	    }
	    
	    @PostMapping("/pause")
	    public ResponseEntity<Vedioplayer> pause() {
	    	System.out.println("printing.... play  ....");
	        return ResponseEntity.ok(videoPlayerService.pressPause());
	    }
	    
	    @PostMapping("/stop")
	    public ResponseEntity<Vedioplayer> stop() {
	        return ResponseEntity.ok(videoPlayerService.pressStop());
	    }
	    
	    @PostMapping("/load/{videoName}")
	    public ResponseEntity<Vedioplayer> loadVideo(@PathVariable String videoName) {
	        return ResponseEntity.ok(videoPlayerService.loadVideo(videoName));
	    }
	    
	    @PostMapping("/seek/{position}")
	    public ResponseEntity<Vedioplayer> seekTo(@PathVariable int position) {
	        return ResponseEntity.ok(videoPlayerService.seekTo(position));
	    }
	    
	    @PostMapping("/reset")
	    public ResponseEntity<Vedioplayer> reset() {
	        return ResponseEntity.ok(videoPlayerService.loadVideo("Sample Video.mp4"));
	    }
	    
	    @PostMapping("/toggle-lock") 	
	    public ResponseEntity<Vedioplayer> toggleLock() {
	        return ResponseEntity.ok(videoPlayerService.toggleLock());
	    }
	    
	    @GetMapping("/lock-status")
	    public ResponseEntity<Boolean> getLockStatus() {
	        return ResponseEntity.ok(videoPlayerService.isLocked());
	    }
		
	}
