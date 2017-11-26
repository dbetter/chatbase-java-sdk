package generic;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Chatbase generic message pojo
 */
public class GenericMessage {

    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("time_stamp")
    private long timestamp;

    @JsonProperty("not_handled")
    private boolean notHandled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String intent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String version;


    GenericMessage(String apiKey, String type, String userId, long timestamp, String platform,
                   String message, String intent, String version, boolean notHandled) {
        this.apiKey = apiKey;
        this.type = type;
        this.userId = userId;
        this.timestamp = timestamp;
        this.platform = platform;
        this.message = message;
        this.intent = intent;
        this.version = version;
        this.notHandled = notHandled;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isNotHandled() {
        return notHandled;
    }

    public void setNotHandled(boolean notHandled) {
        this.notHandled = notHandled;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "GenericMessage{" +
                "apiKey='" + apiKey + '\'' +
                ", userId='" + userId + '\'' +
                ", timestamp=" + timestamp +
                ", notHandled=" + notHandled +
                ", type='" + type + '\'' +
                ", platform='" + platform + '\'' +
                ", message='" + message + '\'' +
                ", intent='" + intent + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
