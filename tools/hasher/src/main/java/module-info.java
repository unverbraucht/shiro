module org.apache.shiro.tools.hasher {
    exports org.apache.shiro.tools.hasher;

    requires org.apache.shiro.core;
    requires org.apache.shiro.crypto.core;
    requires org.apache.shiro.crypto.hash;
    requires org.apache.shiro.lang;

    requires commons.cli;
}