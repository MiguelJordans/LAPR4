package eapli.base.tcpServer.agvManager.domain;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.AGVStatus;
import eapli.base.agvmanagement.repositories.AGVRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servers.utils.TcpProtocolParser;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Semaphore;

public class REQUEST_OCCUPIED_AGV extends REQUESTS_API_Request {

    AGVRepository agvRepository = PersistenceContext.repositories().agvRepository();

    @Override
    public String execute(Semaphore agvSemaphore, Semaphore orderSemaphore, List<String> agvList, List<String> orderList, DataInputStream sIn, DataOutputStream sOut) throws IOException {


        byte[] agvMessage = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};

        sIn.read(agvMessage);

        AGV agv = agvRepository.findByID(TcpProtocolParser.readClientResponse(agvMessage));
        agv.changeStatus(AGVStatus.OCCUPIED);
        agvRepository.updateAGV(agv);

        return "";
    }
}
