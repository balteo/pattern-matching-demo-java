package pack.model;

import java.time.Instant;

public record Email(String to, String from, String subject, String message, Instant date) implements Sendable {
}
