package eapli.base.customermanagement.application;

import eapli.base.usermanagement.application.AddUserController;
import eapli.framework.application.ApplicationService;
import eapli.framework.infrastructure.authz.domain.model.Role;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.util.Calendar;
import java.util.Set;

@ApplicationService
public class CreateUserService {

    private final AddUserController theController = new AddUserController();

    public SystemUser createUser(final String username, final String password, final String firstName, final String lastName, final String email, final Set<Role> roles, final Calendar createdOn) {
        return theController.addUser(username, password, firstName, lastName, email, roles, createdOn);

    }
}
