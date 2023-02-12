package homestudy.spring.framework;

import homestudy.spring.provider.MessageProvider;
import homestudy.spring.provider.MessageRenderer;

import java.io.FileInputStream;
import java.util.Properties;

public class AppFramework {
    private final MessageProvider messageProvider;
    private final MessageRenderer messageRenderer;

    public AppFramework() {
        Properties properties = new Properties();
        try (FileInputStream stream = new FileInputStream("config.properties")) {
            properties.load(stream);
        } catch (Exception ex) {
            throw new RuntimeException("Failed to read properties error=" + ex.toString(), ex);
        }
        try {
            String renderedClass = properties.getProperty("render.class");
            String messageProviderClass = properties.getProperty("provider.class");

            messageProvider = (MessageProvider) Class.forName(messageProviderClass).newInstance();

            messageRenderer = (MessageRenderer) Class.forName(renderedClass).newInstance();
            messageRenderer.setMessageProvider(messageProvider);
        } catch (Exception ex) {
            throw new RuntimeException("Failed to init framework error=" + ex, ex);
        }
    }

    public MessageRenderer getMessageRenderer() {
        return messageRenderer;
    }

    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
