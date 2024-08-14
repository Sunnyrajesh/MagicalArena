package com.MagicalArena.game.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MagicalArena.game.Model.CombinedPlayers;
import com.MagicalArena.game.Model.Player;
import com.MagicalArena.game.Service.MagicalArenaService;

@RestController

public class MagicalArenaController {
	
	
	@Autowired
	private MagicalArenaService magicalarenaservice;
	
	@PostMapping("/play")
	public String GameOn(@RequestBody CombinedPlayers players ){
		return magicalarenaservice.winnerOfMagicalArena(players.getP1(),players.getP2());
		
	}
	
	
	

}
