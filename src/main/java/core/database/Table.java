package core.database;

import core.util.Predicate;
import java.util.LinkedList;

/**
 *
 */
public class Table {
    private final String _name;
    private final LinkedList<Model> _modelList;


    public Table(String name) {
        _name = name;
        _modelList = new LinkedList<Model>();
    }


    public String getName() { return _name; }


    public void insert(Model model) {

    }

    public void delete(String key) {

    }

    public void select(Predicate<Model> match) {

    }
}
