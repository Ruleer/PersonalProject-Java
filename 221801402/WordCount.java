import java.io.PrintWriter;

public class WordCount {

    public static void  main(String args[]) {
        if (args.length != 2) {
            System.out.println("参数不对，请重新运行");
            return;
        }

        String inFile = args[0];
        String outFile = args[1];

        try{
            int charNum,lineNum;
            PrintWriter pw=new PrintWriter(outFile);//每次用新input.txt内容时将原output.txt的内容清除
            pw.write("");
            pw.flush();
            pw.close();
            Lib a=new Lib();
            charNum=a.CountChar(inFile);
            System.out.println(charNum);
            lineNum=a.CountLine(inFile);
            System.out.println(lineNum);
            a.CountWord(inFile,outFile,charNum,lineNum);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
