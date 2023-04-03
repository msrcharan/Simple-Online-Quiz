import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class quesbank {
	int n;
	List<String> list = new ArrayList<String>();

	public quesbank() {
		StringBuilder sb = new StringBuilder();
        String strLine = "";
        
        try {
             BufferedReader br = new BufferedReader(new FileReader(
            		 "/Users/sricharan/Desktop/index.txt"));
              while (strLine != null)
               {
                strLine = br.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if (strLine==null)
                   break;
                list.add(strLine);
            }
              
           
         
         System.out.println(list.get(2)); 
              
             br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }
		
		 
	}
	public static void main(String[] args) {
		quesbank f = new quesbank();
		
	}

}
