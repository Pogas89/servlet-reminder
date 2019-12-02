package com.dzmitry.servlets;

import java.util.List;

public interface NameService {
    Boolean add(String s);

    List<String> getAll();
}
