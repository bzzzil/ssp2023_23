package by.bstu.robotlecturer;

import java.util.stream.Stream;

public class FirstLecture implements Lecture {
    @Override
    public Stream<Slide> getSlides() {
        return Stream.of(new Slide("slide#1", "blah-blah"),
                new Slide("slide#2", "blah-blah-blah"));
    }
}
