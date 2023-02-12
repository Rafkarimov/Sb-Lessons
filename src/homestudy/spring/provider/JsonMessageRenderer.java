package homestudy.spring.provider;

public class JsonMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public void render() {

        String json = String.format("{\"message\": \"%s\"}", messageProvider.getMessage());
        System.out.println(json);
    }
}
