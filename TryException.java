import java.io.FileReader;
import java.io.IOException;


class TryException{
	public static void main(String[] args) throws Exception{
			try{
				FileReader fr=new FileReader("table.txt");
			
			
			}
			catch(IOException ie){
			System.out.println("IOEXCEPTION");
			
			}
			
			catch(Exception e)
			{
			System.out.println("Parent Exception");
			
			}
	}

}