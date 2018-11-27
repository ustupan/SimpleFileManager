package com.homework;

public interface Node {
    String getName();

    void setParent(Node parent);

    Node getParent();

    void setName(String name);
}
