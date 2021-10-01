import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sample {

	public static void main(String[] args) {

	}

	public List<Response> copy(List<String> filePath, String destination) {

		List<Response> output = new ArrayList<Response>();
		ExecutorService fileExecutorService = Executors.newFixedThreadPool(getThredCount());

		for (String path : filePath) {

			FileMover f = new FileMover(path, destination);

			Future<Response> future = fileExecutorService.submit(f);

			try {
				output.add(future.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		return output;
	}

	private int getThredCount() {
		// TODO Auto-generated method stub
		return 10;
	}

}
