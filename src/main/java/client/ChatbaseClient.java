package client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.base.Throwables;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import exceptions.ChatBaseException;
import generic.GenericMessage;
import http.ChatBaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Chasebase java client, supports {@link GenericMessage} generic message
 */
public class ChatbaseClient {

    private static final Logger logger = LoggerFactory.getLogger(ChatbaseClient.class);

    private final static String GENERIC_MESSAGE_BASE_URL = "https://chatbase.com/api/message";

    public ChatbaseClient() {
        Unirest.setObjectMapper(new ObjectMapper() {
            private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper = new com.fasterxml.jackson.databind.ObjectMapper();

            public <T> T readValue(String value, Class<T> valueType) {
                try {
                    return jacksonObjectMapper.readValue(value, valueType);
                } catch (IOException e) {
                    throw new ChatBaseException(String.format("Failed to deserialize value: %s of type: %s", value, valueType));
                }
            }

            public String writeValue(Object value) {
                try {
                    return jacksonObjectMapper.writeValueAsString(value);
                } catch (JsonProcessingException e) {
                    throw new ChatBaseException(String.format("failed to serialize object: ", value));
                }
            }
        });
    }


    public ChatBaseResponse sendGenericMessage(GenericMessage message) {
        HttpResponse<ChatBaseResponse> response;
        try {
            response = Unirest.post(GENERIC_MESSAGE_BASE_URL)
                              .body(message)
                              .asObject(ChatBaseResponse.class);
        } catch (UnirestException e) {
            throw new ChatBaseException(String.format("failed to send generic message to chatbase, with resulting error: %s", Throwables.getStackTraceAsString(e)));

        }

        ChatBaseResponse res = response.getBody();
        return res;
    }
    
}
