package com.example;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static net.logstash.logback.argument.StructuredArguments.*;

public class App 
{
    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger(App.class.getName());
        String fmt = new String("{0}=[{1}]");

        // SAML request
        logger.info(
            "{}, {}, {}, {}, {}, {}, {}, {}, {}, {}",
            kv("country", "null", fmt),
            kv("destination", "https://service.eid.gov.it/ColleagueRequest", fmt),
            kv("msg_id", "_hJ1.U4Xk_vwBbwZwWcr7maiGnJEUjU3oqYEW5b74hshKHE1GFhvbd1oqm49WtU", fmt),
            kv("op_type", "eIDAS Connector generates request to eIDAS Service", fmt),
            kv("origin", "https://ec.europa.eu/eid-integration-test/EidasNode/showSamlConnector", fmt),
            kv("provider_name", "TEST-Node", fmt),
            kv("qaa_level", "1", fmt),
            kv("saml_hash", "yjWi/7RYNfYW3ZBypwGy8iC42/mG5mjQwaefS0NBJP51sJo27qJ65UCDlvFNVSseskdj7z4cV83S+NK+FBlj5Q==", fmt),
            kv("sp_application", "null", fmt),
            kv("sp_msg_id", "_hJ1.U4Xk_vwBbwZwWcr7maiGnJEUjU3oqYEW5b74hshKHE1GFhvbd1oqm49WtU", fmt)
        );

        // SAML response
        logger.info(
            "{}, {}, {}, {}",
            kv("in_response_to_sp_req", "_hJ1.U4Xk_vwBbwZwWcr7maiGnJEUjU3oqYEW5b74hshKHE1GFhvbd1oqm49WtU", fmt),
            kv("message", "Success/Get Citizen Consent", fmt),
            kv("msg_id", "_hJ1.U4Xk_vwBbwZwWcr7maiGnJEUjU3oqYEW5b74hshKHE1GFhvbd1oqm49WtU", fmt),
            kv("op_type", "eIDAS Connector receives response from eIDAS Service", fmt),
            kv("saml_hash", "yjWi/7RYNfYW3ZBypwGy8iC42/mG5mjQwaefS0NBJP51sJo27qJ65UCDlvFNVSseskdj7z4cV83S+NK+FBlj5Q==", fmt)
        );
    }
}
