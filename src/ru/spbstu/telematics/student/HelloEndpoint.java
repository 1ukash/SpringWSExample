package ru.spbstu.telematics.student;

import java.util.Date;

import org.springframework.oxm.Marshaller;
import org.springframework.ws.server.endpoint.AbstractMarshallingPayloadEndpoint;

public class HelloEndpoint extends AbstractMarshallingPayloadEndpoint {
    
	public HelloEndpoint() {
        super();
    }

    public HelloEndpoint(Marshaller marshaller) {
        super(marshaller);
    }
    
	@Override
	protected Object invokeInternal(Object request) throws Exception {
		HelloRequest r = (HelloRequest) request;
		
		HelloResponse resp = new HelloResponse();
		resp.setData(r.getData() + " " + new Date());
		
		return resp;
	}

}
