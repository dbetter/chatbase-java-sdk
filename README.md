# chatbase-java-sdk
Java SDK implementation for chatbase service.

Currently supports **generic message API**

> **Usage example:** 

    GenericMessage message = new GenericMessageBuilder()
            .withKey(AUTH_KEY)
            .withType(Type.BOT.getType())
            .withUserId(USER_ID)
            .withTimestamp(Instant.now().toEpochMilli())
            .withPlatform(Platform.WEB.getPlatform())           
            .withIntent("greeting")                       // optional
            .withMessage("How dare you talk to me?")      // optional 
            .withNotHandled(true)                         // optional
            .withVersion("1.0")                           // optional
            .build();

    ChatbaseClient chatbaseClient = new ChatbaseClient();
    ChatBaseResponse res = chatbaseClient.sendGenericMessage(message);
    
    System.out.println("Chatbase response: %s", res.toString());
