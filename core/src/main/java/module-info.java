module org.apache.shiro.core {
    exports org.apache.shiro;
    exports org.apache.shiro.aop;
    exports org.apache.shiro.authc;
    exports org.apache.shiro.authc.credential;
    exports org.apache.shiro.authc.pam;
    exports org.apache.shiro.authz;
    exports org.apache.shiro.authz.annotation;
    exports org.apache.shiro.authz.aop;
    exports org.apache.shiro.authz.permission;
    exports org.apache.shiro.concurrent;
    exports org.apache.shiro.dao;
    exports org.apache.shiro.env;
    exports org.apache.shiro.ini;
    exports org.apache.shiro.jndi;
    exports org.apache.shiro.ldap;
    exports org.apache.shiro.mgt;
    exports org.apache.shiro.realm;
    exports org.apache.shiro.session;
    exports org.apache.shiro.session.mgt;
    exports org.apache.shiro.session.mgt.eis;
    exports org.apache.shiro.subject;
    exports org.apache.shiro.subject.support;
    exports org.apache.shiro.util;

    requires org.apache.shiro.lang;
    requires org.apache.shiro.cache;
    requires org.apache.shiro.config.core;
    requires org.apache.shiro.config.ogdl;
    requires org.apache.shiro.crypto.core;
    requires org.apache.shiro.crypto.hash;
    requires org.apache.shiro.crypto.cipher;
    requires org.apache.shiro.event;

    requires static commons.beanutils;
    requires static commons.collections;
    requires slf4j.api;

    requires java.sql;
    requires java.naming;
}