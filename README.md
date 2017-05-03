# Resulting log entries

On the console

    2017-46-03T19:46:37.326+0200 [main] INFO com.example.App [v:1.2, b:2017-05-03T18:32:27] - country=[null], destination=[https://service.eid.gov.it/ColleagueRequest], msg_id=[_hJ1.U4Xk_vwBbwZwWcr7maiGnJEUjU3oqYEW5b74hshKHE1GFhvbd1oqm49WtU], op_type=[eIDAS Connector generates request to eIDAS Service], origin=[https://ec.europa.eu/eid-integration-test/EidasNode/showSamlConnector], provider_name=[TEST-Node], qaa_level=[1], saml_hash=[yjWi/7RYNfYW3ZBypwGy8iC42/mG5mjQwaefS0NBJP51sJo27qJ65UCDlvFNVSseskdj7z4cV83S+NK+FBlj5Q==], sp_application=[null], sp_msg_id=[_hJ1.U4Xk_vwBbwZwWcr7maiGnJEUjU3oqYEW5b74hshKHE1GFhvbd1oqm49WtU]
    2017-46-03T19:46:37.340+0200 [main] INFO com.example.App [v:1.2, b:2017-05-03T18:32:27] - in_response_to_sp_req=[_hJ1.U4Xk_vwBbwZwWcr7maiGnJEUjU3oqYEW5b74hshKHE1GFhvbd1oqm49WtU], message=[Success/Get Citizen Consent], msg_id=[_hJ1.U4Xk_vwBbwZwWcr7maiGnJEUjU3oqYEW5b74hshKHE1GFhvbd1oqm49WtU], op_type=[eIDAS Connector receives response from eIDAS Service]

Within the JSON file (here parsed with `jq`)
    
    {
      "@timestamp": "2017-05-03T19:46:37.326+02:00",
      "@version": 1,
      "country": "null",
      "destination": "https://service.eid.gov.it/ColleagueRequest",
      "msg_id": "_hJ1.U4Xk_vwBbwZwWcr7maiGnJEUjU3oqYEW5b74hshKHE1GFhvbd1oqm49WtU",
      "op_type": "eIDAS Connector generates request to eIDAS Service",
      "origin": "https://ec.europa.eu/eid-integration-test/EidasNode/showSamlConnector",
      "provider_name": "TEST-Node",
      "qaa_level": "1",
      "saml_hash": "yjWi/7RYNfYW3ZBypwGy8iC42/mG5mjQwaefS0NBJP51sJo27qJ65UCDlvFNVSseskdj7z4cV83S+NK+FBlj5Q==",
      "sp_application": "null",
      "sp_msg_id": "_hJ1.U4Xk_vwBbwZwWcr7maiGnJEUjU3oqYEW5b74hshKHE1GFhvbd1oqm49WtU",
      "eidas_version": "1.2",
      "eidas_build": "2017-05-03T18:32:27"
    }

    {
      "@timestamp": "2017-05-03T19:46:37.340+02:00",
      "@version": 1,
      "in_response_to_sp_req": "_hJ1.U4Xk_vwBbwZwWcr7maiGnJEUjU3oqYEW5b74hshKHE1GFhvbd1oqm49WtU",
      "message": "Success/Get Citizen Consent",
      "msg_id": "_hJ1.U4Xk_vwBbwZwWcr7maiGnJEUjU3oqYEW5b74hshKHE1GFhvbd1oqm49WtU",
      "op_type": "eIDAS Connector receives response from eIDAS Service",
      "saml_hash": "yjWi/7RYNfYW3ZBypwGy8iC42/mG5mjQwaefS0NBJP51sJo27qJ65UCDlvFNVSseskdj7z4cV83S+NK+FBlj5Q==",
      "eidas_version": "1.2",
      "eidas_build": "2017-05-03T18:32:27"
    }
