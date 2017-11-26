package http;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChatBaseResponse {

    @JsonProperty("message_id")
    String messageId;

    int status;

    String reason;

    public String getMessageId() { return messageId; }

    public void setMessageId(String messageId) { this.messageId = messageId; }

    public int getStatus() { return status; }

    public void setStatus(int status) { this.status = status; }

    public String getReason() { return reason; }

    public void setReason(String reason) { this.reason = reason; }

    @Override
    public String toString() {
        return "ChatBaseResponse{" +
                "messageId='" + messageId + '\'' +
                ", status=" + status +
                ", reason='" + reason + '\'' +
                '}';
    }
}
