package eapli.base.tcpServer.utils;

import eapli.base.tcpServer.orderManagement.domain.TcpOrderSrvThread;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.net.*;

public class TcpSrv {
    private static ServerSocket sock;
    private static final Logger LOGGER = LogManager.getLogger(TcpOrderSrvThread.class);

    public static void serverRun(int serverSockNum) throws Exception {
        Socket cliSock;

        try {
            sock = new ServerSocket(serverSockNum);
        } catch (IOException ex) {
            LOGGER.error("Failed to open server socket");
            System.exit(1);
        }

        while (true) {
            cliSock = sock.accept();
            new Thread(new TcpOrderSrvThread(cliSock)).start();
        }
    }

}