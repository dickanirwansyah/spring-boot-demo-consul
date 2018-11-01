package com.consul.democonsul;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("my")
/** --> my.name = "", my.email = "" **/
public class MyConfiguration {

    private String name;
    private String email;
}
