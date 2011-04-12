package ru.spbstu.telematics.student.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ws.client.core.WebServiceTemplate;

import ru.spbstu.telematics.student.HelloRequest;
import ru.spbstu.telematics.student.HelloResponse;

public class HelloClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ru/spbstu/telematics/student/client/spring-client.xml");
		WebServiceTemplate webServiceTemplate = (WebServiceTemplate)context.getBean("webServiceTemplate");
		
		HelloRequest req = new HelloRequest();
		req.setData("What can you say?");
		HelloResponse resp = (HelloResponse) webServiceTemplate.marshalSendAndReceive(req);
		
		System.out.println("Service response: " + resp.getData());
	}
}
