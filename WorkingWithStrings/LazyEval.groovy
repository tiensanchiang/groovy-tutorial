#!/usr/bin/env groovy

price = 684.71
company = "Google"

priceClosure = {->price}
companyClosure = {->company}
quote = "Today ${companyClosure} stock closed at ${priceClosure}"
println quote

stocks = [Apple: 663.01, Microsoft: 30.95]

stocks.each{ key, value ->
    company = key
    price = value
    println quote
}
