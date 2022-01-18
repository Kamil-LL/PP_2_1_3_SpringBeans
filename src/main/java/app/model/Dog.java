package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private String sound;

    public Dog(String sound) {
        this.sound = sound;
    }

    @Override
    void say() {
        System.out.println("Dog says " + sound);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "sound='" + sound + '\'' +
                '}';
    }
}
