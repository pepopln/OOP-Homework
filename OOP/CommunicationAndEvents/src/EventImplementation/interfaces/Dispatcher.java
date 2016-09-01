package EventImplementation.interfaces;

import javax.naming.event.NamespaceChangeListener;

public interface Dispatcher {

    void addNameChangeListener(NameChangeListener listener);

    void removeNameChangeListener(NameChangeListener listener);

    void fireNameChangeEvent();

    void setName(String name);
}
