package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    private String sound;

    public Cat(String sound) {
        this.sound = sound;
    }

    @Override
    void say() {
        System.out.println("I am a Cat" + sound);
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }
}
