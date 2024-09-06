package application.dto;

public class ServiceRequest {

    private String id;
    private String requestId;

    public ServiceRequest(String id, String requestId) {
        this.id = id;
        this.requestId = requestId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
