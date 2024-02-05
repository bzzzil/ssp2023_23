package by.bstu.di;

public interface ProxyConfigurator {
    <T> T  wrapWithProxy(T t);
}
