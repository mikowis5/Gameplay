package pl.pjatk.mikolajwisniewski.gameplay.service;

import org.springframework.stereotype.Service;
import pl.pjatk.mikolajwisniewski.gameplay.model.Player;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    public List<Player> findAll() {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player());
        return playerList;
    }

}
