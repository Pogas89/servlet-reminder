package com.dzmitry.servlets;

import java.util.List;

public class NameServiceImpl implements NameService {
    private NameDao dao = new DummyNameDao();

    @Override
    public Boolean add(String s) {
        return dao.add(s);
    }

    @Override
    public List<String> getAll() {
        return dao.getAll();
    }
}
