package com.company.example.helloworld.shared.helloworld;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;

import com.company.example.helloworld.shared.helloworld.HelloWorldFormData;

/**
 * <h3>{@link IHelloWorldFormService}</h3>
 *
 * @author jbr
 */
@TunnelToServer
public interface IHelloWorldFormService extends IService {
	HelloWorldFormData load(HelloWorldFormData input);
}
