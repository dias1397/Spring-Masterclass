package com.joaodias.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAddress;
    private String teamName;

    public CricketCoach() {
        System.out.println("CricketCoach: Inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: Inside setter fortune method");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: Inside setter email method");
        this.emailAddress = emailAddress;
    }

    public void setTeamName(String teamName) {
        System.out.println("CricketCoach: Inside setter team name method");
        this.teamName = teamName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return "You can do it! " + fortuneService.getFortune();
    }
}
