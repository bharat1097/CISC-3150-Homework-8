import java.io.*;

public class PrintDirectoryTree{
	
     static void RecursivePrint(File[] arr,int index,int level){
         
    	 if(index == arr.length)
             return;
          
         for (int i = 0; i < level; i++)
             System.out.print("\t");
          
         if(arr[index].isFile())
             System.out.println(arr[index].getName());
          
         else if(arr[index].isDirectory()){
             System.out.println("[" + arr[index].getName() + "]");
             RecursivePrint(arr[index].listFiles(), 0, level + 1);
         }
           
         RecursivePrint(arr,++index, level);
    }
     
    public static void main(String[] args){
        String dir_Path = "C:\\Users\\Bharat's PC\\OneDrive\\CISC 3150 OOP";
        File main_Dir = new File(dir_Path);
          
        if(main_Dir.exists() && main_Dir.isDirectory()){

            File fileArr[] = main_Dir.listFiles();
             
            System.out.println("*********************************************************");
            System.out.println("Files from: " + main_Dir + " *");
            System.out.println("*********************************************************\n");
            
            RecursivePrint(fileArr,0,0); 
       } 
    }
}