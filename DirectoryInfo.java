
package directoryinfo;

import java.io.File;

public class DirectoryInfo {

    public static void main(String[] args) {
        System.out.println("Create folder....");
        String fileName="temp";
        File fn = new File(fileName);
        fn.mkdir();
        System.out.println(fn.getName()+":"+(fn.exists()?"exists":"doesn't exist"));
        File subdir1=new File(fn,"subdir");
        subdir1.mkdir();
        System.out.println(subdir1.getName()+":"+(subdir1.exists()?"exists":"doesn't exist"));
        File subdir2=new File(fn,"subdir");
        subdir2.mkdir();
        System.out.println(subdir2.getName()+":"+(subdir2.exists()?"exists":"doesn't exist"));
        System.out.println(fn.getName()+":"+(fn.isDirectory()?" is a folder.":" is a file"));

        if(fn.isDirectory())
        {
            String contents[]=fn.list();
            System.out.println("The contents of the file are: "+ fn.getName()+":");
            for(int i=0; i<contents.length; i++){
                System.out.println(contents[i]);
            }
        } 
    }
    
}
