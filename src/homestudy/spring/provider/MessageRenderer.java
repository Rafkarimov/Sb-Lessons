package homestudy.spring.provider;

public interface MessageRenderer {
    void setMessageProvider(MessageProvider provider);
    void render();
}
