package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        Stream<Integer> iterate = Stream.iterate(0, i->i+2);
        List<Integer> collect = iterate.limit(10).collect(Collectors.toList());
        collect.forEach(System.out::println);

    }

}
