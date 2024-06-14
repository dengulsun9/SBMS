package in.dengulsun9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class Application {
	
	static String url="http://localhost:8080/ticket/{ticketNum}";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		WebClient webClient = WebClient.create();
		
		System.out.println("REQUEST SENDING START....");
		
							webClient.get()
									.uri(url,1)
									.retrieve()
									.bodyToMono(String.class)
									.subscribe(Application::handleResponse);
		System.out.println("REQUEST SENDING END......");
		
	}
	
	public static void handleResponse(String response)
	{
		System.out.println(response);
	}

}
