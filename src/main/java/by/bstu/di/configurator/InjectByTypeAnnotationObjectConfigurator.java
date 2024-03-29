package by.bstu.di.configurator;

import by.bstu.di.ObjectConfigurator;
import by.bstu.di.ObjectFactory;
import by.bstu.di.annotation.InjectByType;
import lombok.RequiredArgsConstructor;

import java.lang.reflect.Field;

@RequiredArgsConstructor
public class InjectByTypeAnnotationObjectConfigurator implements ObjectConfigurator {
    private final ObjectFactory factory;

    @Override
    public void configure(Object t) throws ReflectiveOperationException {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                field.setAccessible(true);
                field.set(t,
                        factory.createObject(field.getType()));
            }
        }
    }
}
