package EventImplementation.models;



import EventImplementation.interfaces.NameChangeListener;

import javax.naming.event.NamespaceChangeListener;
import javax.naming.event.NamingEvent;
import javax.naming.event.NamingExceptionEvent;

public class HandlerImpl implements NameChangeListener {
private DispatcherImpl dispatcher;
    private NameChangeEvent event;


    @Override
    public void handleChangeName(NameChangeEvent event) {
        System.out.printf("Dispatcher's name changed to %s.\n",event.getName());
    }
}
