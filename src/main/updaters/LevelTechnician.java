package main.updaters;

import main.settings.HeroSettings;

public class LevelTechnician implements LevelObserver {

    @Override
    public void listen(String incomingUpdate) {
        System.out.println("making changes");
        HeroSettings settings = HeroSettings.getInstance();
        settings.setWarriorHp(+150);
    }
}