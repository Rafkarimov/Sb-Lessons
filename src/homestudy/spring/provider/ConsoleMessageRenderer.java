package homestudy.spring.provider;

public class ConsoleMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public void render() {
        System.out.println(messageProvider.getMessage());
    }
}
