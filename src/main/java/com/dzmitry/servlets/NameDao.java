package com.dzmitry.servlets;

import java.util.List;

public interface NameDao {
    Boolean add(String name);

    List<String> getAll();
}
