package hellodocker;

import static spark.Spark.get;

public class Hello {

    public static void main(String[] args) {
        get("/", (req, res) -> {
            return "Hello Docker";
        });

        get("/hello/:name", (req, res) -> {
        	return "Hello " + req.params(":name");
        });
    }
}