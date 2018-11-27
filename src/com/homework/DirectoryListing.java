package com.homework;

public class DirectoryListing extends DirectoryComposite{


    public void tree(DirectoryComposite directoryComposite, int i){
        System.out.println(directoryComposite.getName());
        for (Node object: directoryComposite._children){
            if(object instanceof File) {
                for (int j = 0; j <= i; j++)
                    System.out.print("\t");
                System.out.print(object.getName());
                System.out.print('\n');
            }
            else{
                for (int j = 0; j <= i; j++)
                    System.out.print("\t");
                tree((DirectoryComposite) object,i+1);
            }
        }
    }

    public void ls(DirectoryComposite directory){
        for (Node object: directory._children){
            System.out.print(object.getName());
            System.out.print("\t");
        }
    }
}
