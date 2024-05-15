package pl.wat.backend.services;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class TokenService {

    private Set<String> invalidatedTokens = new HashSet<>();

    public void invalidateToken(String token) {
        invalidatedTokens.add(token);
        System.out.println(invalidatedTokens);
    }

    public boolean isTokenInvalid(String token) {
        return invalidatedTokens.contains(token);
    }
}

