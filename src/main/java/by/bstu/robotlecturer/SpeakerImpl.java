package by.bstu.robotlecturer;

import by.bstu.di.annotation.Benchmark;

public class SpeakerImpl implements Speaker {
    @Override
    @Benchmark
    public void speak(String text) {

        System.out.printf("Speaking: %s%n", text);

    }
}
