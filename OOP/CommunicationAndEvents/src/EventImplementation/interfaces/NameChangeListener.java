package EventImplementation.interfaces;


import EventImplementation.models.NameChangeEvent;

public interface NameChangeListener {

    void handleChangeName(NameChangeEvent event);
}
