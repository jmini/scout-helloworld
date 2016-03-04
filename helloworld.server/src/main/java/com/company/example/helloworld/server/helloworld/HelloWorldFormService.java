package com.company.example.helloworld.server.helloworld;

import com.company.example.helloworld.server.ServerSession;
import com.company.example.helloworld.shared.helloworld.HelloWorldFormData;
import com.company.example.helloworld.shared.helloworld.IHelloWorldFormService;

/**
 * <h3>{@link HelloWorldFormService}</h3>
 *
 * @author jbr
 */
public class HelloWorldFormService implements IHelloWorldFormService {

	@Override
	public HelloWorldFormData load(HelloWorldFormData input) {
		StringBuilder msg = new StringBuilder();
		msg.append("Hello ").append(ServerSession.get().getUserId()).append("!");
		input.getMessage().setValue(msg.toString());
		return input;
	}
}
