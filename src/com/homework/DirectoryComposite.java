package com.homework;
import java.util.ArrayList;

public class DirectoryComposite implements Node {
    private String name;

    public DirectoryComposite() { }

    public DirectoryComposite(String name) {
        this.name = name;
    }

    private Node parent = null;
    protected ArrayList<Node> _children = new ArrayList<>();

    public Node getChild(String name){
        for (Node object: _children){
            if(name.equals(object.getName())) return object;
        }
        return null;
    }

    public ArrayList getChildren(){
        return _children;
    }

    public void addNode(Node component) throws Exception {
        if (getChild(component.getName()) == null) {
            component.setParent(this);
            _children.add(component);
        }
        else throw new Exception ("Wrong name!");
    }


    @Override
    public Node getParent(){
        return parent;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setParent(Node parent){
        this.parent = parent;
    }

    @Override
    public String getName() {
        return name;
    }
}