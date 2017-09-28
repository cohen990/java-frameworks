package com.codurance;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello, World!");
        get("/goodbye", (req, res) -> "Goodbye, World!");
    }
}