package core.database;

import core.util.FileUtil;

public class LocalStorage implements Storage {

    private final String _filePath;


    public LocalStorage(String filePath) {
        _filePath = filePath;
    }


    @Override
    public void set(Object obj) {

    }

    @Override
    public Object get() {
        String contents = FileUtil.readAll(_filePath);
        return null;
    }
}
