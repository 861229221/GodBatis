package org.god.core;

import java.io.InputStream;

/**
 * Created 12-03-2022  4:00 PM
 * Author  Dino
 */
public class Resources {
    public static InputStream getResourcesAsStream(String config){
        return Thread.currentThread().getContextClassLoader().getResourceAsStream(config);
    }
}
