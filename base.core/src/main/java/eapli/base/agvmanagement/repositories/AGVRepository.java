package eapli.base.agvmanagement.repositories;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.warehousemanagement.domain.AGVDock;
import eapli.base.warehousemanagement.domain.Warehouse;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;

public interface AGVRepository extends DomainRepository<Long, AGV> {
    AGV findByID(String id);
    AGV findByDock(AGVDock dock);
    List<AGV> findFreeAGVS();
}
