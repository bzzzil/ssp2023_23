package by.bstu.robotlecturer;

import by.bstu.di.annotation.Benchmark;

import java.util.stream.Stream;

public interface Lecture {
    Stream<Slide> getSlides();
}
