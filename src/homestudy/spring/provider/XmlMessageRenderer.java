package homestudy.spring.provider;

public class XmlMessageRenderer implements MessageRenderer{

    private MessageProvider messageProvider;

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }
    @Override
    public void render() {
        String xml = String.format("<renderer>%s</renderer>", messageProvider.getMessage());
        System.out.println(xml);
    }
}
