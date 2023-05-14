package com.meitech.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meitech.dslist.entities.GameList;


public interface GameListRepository  extends JpaRepository<GameList, Long>{

}
