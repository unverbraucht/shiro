module org.apache.shiro.web {
    exports org.apache.shiro.web.config;
    exports org.apache.shiro.web.env;
    exports org.apache.shiro.web.filter;
    exports org.apache.shiro.web.mgt;
    exports org.apache.shiro.web.servlet;
    exports org.apache.shiro.web.session;
    exports org.apache.shiro.web.subject;
    exports org.apache.shiro.web.tags;
    exports org.apache.shiro.web.util;

    // project dependencies
    requires org.apache.shiro.config.core;
    requires org.apache.shiro.config.ogdl;
    requires org.apache.shiro.core;
    requires org.apache.shiro.lang;

    requires static javax.servlet.api;
    requires static jsp.api;
    requires encoder;
    requires slf4j.api;

    // JDK dependencies
    requires java.desktop;
}