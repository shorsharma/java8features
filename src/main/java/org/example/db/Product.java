package org.example.db;

public record Product(int id, String name, double price) implements MyFI {
}
