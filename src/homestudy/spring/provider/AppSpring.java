package homestudy.spring.provider;

import homestudy.spring.framework.AppFramework;

public class AppSpring {
    public static void main(String[] args) {
        AppFramework framework = new AppFramework();
        MessageRenderer messageRenderer = framework.getMessageRenderer();
        messageRenderer.render();
    }
}
