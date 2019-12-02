package com.dzmitry.servlets;

import java.util.ArrayList;
import java.util.List;

public class DummyNameDao implements NameDao {
    private List<String> storage = new ArrayList<>();

    @Override
    public Boolean add(String name) {
        return storage.add(name);
    }

    @Override
    public List<String> getAll() {
        return storage;
    }
}
