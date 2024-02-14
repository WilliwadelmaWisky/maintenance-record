package core.database;

import java.util.LinkedList;

public class RecordProvider implements Provider<Table> {

    public RecordProvider() {

    }


    @Override
    public void store(Storage storage, Iterable<Table> tables) {
        Object obj = tables;
        storage.set(obj);
    }

    @Override
    public Iterable<Table> load(Storage storage) {
        LinkedList<Table> tables = new LinkedList<Table>();
        Object obj = storage.get();
        return tables;
    }
}
