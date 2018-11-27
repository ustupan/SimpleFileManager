package com.homework;

public class Main {

    public static void main(String[] args) {

        DirectoryComposite root = new DirectoryComposite("root");
        File file1 = new File("kowal");
        File file2 = new File("walcaw");
        File file3 = new File("maciek");
        File file4 = new File("maciek");
        File file5 = new File("maciek");
        DirectoryComposite dir1 = new DirectoryComposite("dir1");
        DirectoryComposite dir2 = new DirectoryComposite("dir2");
        DirectoryComposite dir3 = new DirectoryComposite("dir3");
        try {
            root.addNode(dir2);
            root.addNode(file1);
            dir1.addNode(file2);
            dir1.addNode(file3);
            dir1.addNode(dir3);
            root.addNode(dir1);
            dir2.addNode(file4);
            dir2.addNode(file5);
        }
        catch (Exception e){
            //e.printStackTrace();
            System.out.println(e);
        }

        DirectoryListing dr = new DirectoryListing();
        dr.tree(root,0);

    }
}
