package by.bstu.robotlecturer;

import by.bstu.di.annotation.Benchmark;

public class SlideShowImpl implements SlideShow {
    @Override
    public void show(String text) {
        System.out.printf("Slide: %s%n", text);
    }
}
