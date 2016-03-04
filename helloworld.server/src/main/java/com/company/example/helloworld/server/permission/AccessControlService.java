package com.company.example.helloworld.server.permission;

import java.security.AllPermission;
import java.security.Permissions;

import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.security.RemoteServiceAccessPermission;
import org.eclipse.scout.rt.shared.services.common.security.UserIdAccessControlService;

/**
 * <h3>{@link AccessControlService}</h3>
 *
 * @author jbr
 */
@Order(-1)
public class AccessControlService extends UserIdAccessControlService {
	@Override
	protected Permissions execLoadPermissions(String userId) {
		Permissions permissions = new Permissions();
		permissions.add(new RemoteServiceAccessPermission("*.shared.*", "*"));

		// TODO [jbr]: Fill access control service
		permissions.add(new AllPermission());
		return permissions;
	}
}
