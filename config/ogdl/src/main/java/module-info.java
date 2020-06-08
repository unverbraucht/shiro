module org.apache.shiro.config.ogdl {
    exports org.apache.shiro.config.ogdl;

    requires org.apache.shiro.config.core;
    requires org.apache.shiro.event;
    requires org.apache.shiro.lang;

    requires static org.apache.commons.configuration2;
    requires commons.beanutils;
    requires slf4j.api;

    requires java.desktop;
}