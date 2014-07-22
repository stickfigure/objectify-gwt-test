package test.client;

import com.google.appengine.api.datastore.Text;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void greetServer(Text input, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
