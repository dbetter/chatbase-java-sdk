package generic;


public class GenericMessageBuilder {

    private String apiKey;
    private String type;
    private String userId;
    private long timestamp;
    private String platform;
    private String message;
    private String intent;
    private String version;
    private boolean notHandled;

    public GenericMessage build() {
        return new GenericMessage(apiKey, type, userId, timestamp, platform, message, intent, version, notHandled);
    }

    public GenericMessageBuilder withKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    public GenericMessageBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public GenericMessageBuilder withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public GenericMessageBuilder withTimestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public GenericMessageBuilder withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    public GenericMessageBuilder withMessage(String message) {
        this.message = message;
        return this;
    }

    public GenericMessageBuilder withIntent(String intent) {
        this.intent = intent;
        return this;
    }

    public GenericMessageBuilder withVersion(String version) {
        this.version = version;
        return this;
    }

    public GenericMessageBuilder withNotHandled(boolean notHandled) {
        this.notHandled = notHandled;
        return this;
    }



}