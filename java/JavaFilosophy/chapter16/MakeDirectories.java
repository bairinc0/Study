import java.io.*;
public class MakeDirectories {
    private static void usage(){
        System.err.println("Use: MakeDirectories way 1 ... \n"+
                "Creates all ways \n"+
                "Use: MakeDirectories -d way1 ... \n"+
                "Delete all ways\n"+
                "Use: MakeDirectories -r way1 way2 \n"+
                "Rename way1 in way2"
        );
        System.exit(1);
    }
    private static void fileData(File f){
        System.out.println(
               "Full name:" +f.getAbsolutePath()+
               "\n availiable for read:"+f.canRead()+
               "\n availiable for write:"+f.canWrite()+
               "\n getName():"+f.getName()+
                "\n Parent catalogue:"+f.getParent()+
               "\n getPath():"+f.getPath()+ 
               "\n size:"+f.length()+ 
                "\n Last modified:"+f.lastModified()
                );
        if (f.isFile()){
            System.out.println("This is file");
        }
        else{
            System.out.println("This is directory");
        }
    }
    public static void main(String [] args){
        if (args.length<1) usage();
        if (args[0].equals("-r")){
            if (args.length!=3)usage();
            File old=new File(args[1]);
            File rname=new File(args[2]);
            old.renameTo(rname);
            fileData(old);
            fileData(rname);
            return;
        }
        int count=0;
        boolean del=false;
        if (args[0].equals("-d")){
            count++;
            del=true;
        }
        count--;
        while(++count<args.length){
            File f=new File(args[count]);
            if (f.exists()){
                System.out.println(f+"are real!");
                if (del){
                    System.out.println("Deleting ... "+f);
                    f.delete();
                }
            }
            else{
                if (!del){
                    f.mkdirs();
                    System.out.println("created:"+f);
                }
            }
            fileData(f);
        }
    }
} 
