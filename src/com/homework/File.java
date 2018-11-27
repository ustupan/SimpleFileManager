package com.homework;

public class File implements Node{
    private String content;
    private Node parent = null;

    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    @Override
    public Node getParent() {
        return parent;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void setParent(Node parent) {
        this.parent = parent;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() { return name; }
}
