package com.nazar.listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AttributeListener implements ServletContextAttributeListener {
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println(servletContextAttributeEvent.getName() + " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + servletContextAttributeEvent.getValue());
    }

    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {

    }

    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println(servletContextAttributeEvent.getName() + " " + servletContextAttributeEvent.getValue());
    }
}
