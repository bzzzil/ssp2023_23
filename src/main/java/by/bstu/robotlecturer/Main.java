package by.bstu.robotlecturer;

import by.bstu.di.ObjectFactory;

public class Main {
    public static void main(String[] args) throws ReflectiveOperationException {
        RobotLecturer lecturer =
                new ObjectFactory().createObject(RobotLecturer.class);
        //RobotLecturer lecturer = new RobotLecturer();
        lecturer.lecture();
    }
}
