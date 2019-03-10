package com.abekoh.samplecrawler

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleCrawlerApplication

fun main(args: Array<String>) {
    runApplication<SampleCrawlerApplication>(*args)
}
