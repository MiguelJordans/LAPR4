package eapli.base.tcpServer.agvManager.presentation;

import eapli.base.Application;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BasePasswordPolicy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.PlainTextEncoder;

public final class TcpAgvProtocolServer {

    private static final Logger LOGGER = LogManager.getLogger(TcpAgvProtocolServer.class);

    /**
     * Avoid instantiation of this class.
     */
    private TcpAgvProtocolServer() {

    }

    public static void main(final String[] args) {
        LOGGER.info("Configuring the Agv TCP Server::");

        AuthzRegistry.configure(PersistenceContext.repositories().users(),
                new BasePasswordPolicy(),
                new PlainTextEncoder());

        LOGGER.info("Starting the Agv server socket::");

        try {
            TcpAgvSrv.serverRun(Integer.parseInt(Application.settings().getTcpAgvManagerServerSocketPort()));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("There was an error while opening the agv server socket!");
        }

        LOGGER.info("Exiting the agv server::");
        System.exit(0);
    }
}

