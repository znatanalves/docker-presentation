import spark.Spark.get;

public class HelloDocker {
	public static void main(String args[]) {
		get("/", (request, response) {
			return "Hello Docker";
		});
	}
}