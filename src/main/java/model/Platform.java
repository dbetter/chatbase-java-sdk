package model;

public enum Platform {
    FACEBOOK("Facebook"), SMS("SMS"), WEB("Web"), ANDROID("Android"), IOS("iOS"), ACTIONS("Actions"),
    ALEXA("Alexa"), CORTANA("Cortana"), KIK("Kik"), SKYPE("Skype"),
    TWITTER("Twitter"), VIBER("Viber"), TELEGRAM("Telegram"), SLACK("Slack"), WHATSAPP("WhatsApp"),
    WECHAT("WeChat"), LINE("Line"), KAKAO("Kakao");

    Platform(String platform) {
        this.platform = platform;
    }

    String platform;

    public String getPlatform() {
        return this.platform;
    }
}
