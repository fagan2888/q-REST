package uk.co.aquaq.kdb.request;

import com.kx.c;
import lombok.Data;

@Data
public class KdbRequest {

    private String functionName;
    private String arguments;
    private String gatewayFunction;
    private c.Dict credentialDictionary;
}
