package util;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
 
public class appListener implements ServletContextListener,
        ServletContextAttributeListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
 
    	System.out.println("-------------init");
    }
 
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
 
    }
 
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
 
    }
 
    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
 
    }
 
    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
 
    }
}
 
