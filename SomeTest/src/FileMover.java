import java.util.List;
import java.util.concurrent.Callable;


public class FileMover  implements Callable<Response>{

	private String filepath;
	private String destination;
	
	
	
	public FileMover(String filepath,String destination) {
		this.filepath = filepath;
		this.destination = destination;
	}

	@Override
	public Response call() throws Exception {
		
		
	Response r = new Response();
	
		return r;
	
	}
	
	

	
}
