package org.sun.gallery.backend.service;

public interface JwtService {
    String getToken(String key, Object value);
}
