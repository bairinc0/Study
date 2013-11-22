import java.util.*;
import java.util.zip.*;
import java.io.*;

public class ZipCompress{
    
    public static void main(String [] args) throws IOException{
        FileOutputStream f=new FileOutputStream("test.zip");
        CheckedOutputStream csum=new CheckedOutputStream(f,new Adler32());
        ZipOutputStream zos=new ZipOutputStream(csum);
        BufferedOutputStream out=new BufferedOutputStream(zos);
        zos.setComment("Test for ZIP-compress JAVA");
        for (String arg:args){
            System.out.println("Write file "+arg);
            BufferedReader in=new BufferedReader(new FileReader(arg));
            zos.putNextEntry(new ZipEntry(arg));
            int c;
            while ((c=in.read())!=-1){
                out.write(c);
            }
            in.close();
            out.flush();
        }
        out.close();
        
        System.out.println("CheckSum: "+csum.getChecksum().getValue());
        System.out.println("Reading ZIP");
        FileInputStream fi=new FileInputStream("test.zip");
        CheckedInputStream csumi=new CheckedInputStream(fi,new Adler32());
        ZipInputStream in2=new ZipInputStream(csumi);
        BufferedInputStream bis=new BufferedInputStream(in2);
        ZipEntry ze;
        while ((ze=in2.getNextEntry())!=null){
            System.out.println("reading file "+ze);
            int x;
            while ((x=bis.read())!=-1){
                System.out.write(x);
            }
        }
        if (args.length==1){
            System.out.println("CheckSum "+csumi.getChecksum().getValue());
        }
        bis.close();
        //
        ZipFile zf=new ZipFile("test.zip");
        Enumeration e=zf.entries();
        while (e.hasMoreElements()){
            ZipEntry ze2=(ZipEntry)e.nextElement();
            System.out.println("File:"+ze2);
        }
    }
    
}