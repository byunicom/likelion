package com.example.sample.config;

import com.example.sample.bean.Dice;
import com.example.sample.bean.Game;
import com.example.sample.bean.Player;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.example.sample")
@PropertySource({"classpath:game.properties"})
public class GameConfig {
    @Bean
    public Player kang(Dice dice){
//        Player player = new Player(dice);   //생성자를 통한 주입
        Player player = new Player();
        player.setDice(dice);       //설정자를 통한 주입
        player.setName("강경미");
        return player;
    }

    @Bean
    public  Player kim(Dice dice){
        Player player = new Player();
        player.setDice(dice);   //설정자를 통한 주입
        player.setName("김둘리");
        return player;
    }

    @Bean
    public Player hong(Dice dice){
        Player player = new Player();
        player.setDice(dice);
        player.setName("홍길동");
        return player;
    }

    @Bean
    public Player jo(Dice dice){
        Player player=new Player();
        player.setDice(dice);
        player.setName("조은희");
        return player;
    }

    @Bean
    public Game game(List<Player> playerList){
        Game game = new Game();
        game.setList(playerList);
        return game;
    }
}
