package listener;

import config.Conexao;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Iuri Menin on 15/06/2020.
 */
public class ApplicationListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Conexao.migrarBanco();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
