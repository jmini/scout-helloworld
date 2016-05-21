package com.company.example.helloworld.server.helloworld;

import com.company.example.helloworld.server.ServerSession;
import com.company.example.helloworld.shared.helloworld.HelloWorldFormData;
import com.company.example.helloworld.shared.helloworld.IHelloWorldService;

/**
 * <h3>{@link HelloWorldService}</h3>
 *
 * @author jbr
 */
public class HelloWorldService implements IHelloWorldService {

	@Override
	public HelloWorldFormData load(HelloWorldFormData input) {
		StringBuilder msg = new StringBuilder();
		msg.append("Hello ").append(ServerSession.get().getUserId()).append('!');
		input.getMessage().setValue(msg.toString());
		return input;
	}
}
