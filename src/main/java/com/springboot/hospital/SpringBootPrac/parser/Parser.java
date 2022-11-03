package com.springboot.hospital.SpringBootPrac.parser;

public interface Parser<T> {
    T parse(String str);
}
