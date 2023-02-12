package homestudy.spring.provider;

public class DefaultMessageProvider implements MessageProvider{
    @Override
    public String getMessage() {
        return "Default message";
    }
}
