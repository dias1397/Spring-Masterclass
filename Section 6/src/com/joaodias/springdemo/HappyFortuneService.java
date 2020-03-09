package com.joaodias.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

    private String[] randomFortunes;

    @Override
    public String getFortune() {
        return randomFortunes[new Random().nextInt(randomFortunes.length)];
    }

    public void setRandomFortunes(String[] randomFortunes) {
        this.randomFortunes = randomFortunes;
    }
}
