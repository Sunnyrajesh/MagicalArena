package com.MagicalArena.game.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MagicalArena.game.Model.Player;

@Repository
public interface PlayerRepository  extends JpaRepository<Player, Integer>{
	

}
