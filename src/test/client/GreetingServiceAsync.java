package test.client;

import test.shared.Thing;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void greetServer(Thing input, AsyncCallback<Thing> callback)
			throws IllegalArgumentException;
}
