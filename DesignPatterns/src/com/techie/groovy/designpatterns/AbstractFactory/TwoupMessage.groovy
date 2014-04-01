package com.techie.groovy.designpatterns.AbstractFactory
/**
 *   Copyright (C) 2011 Techie DB Inc. All rights reserved.
 *
 * Software Development Division,
 * Digital Media & Communications Business, Techie DB Inc.
 *
 * This software and its documentation are confidential and proprietary information of Techie DB Inc. No part of the software and documents may be
 * copied, reproduced, transmitted, translated, or reduced to any electronic medium or machine-readable form without the prior written consent of 
 * Techie DB. Techie DB makes no representations with respect to the contents, and assumes no responsibility for any errors that might appear in the
 * software and documents. This publication and the contents hereof are subject to change without notice.
 *
 * History
 * 		2014.01/04/2014.01      larry.pham          Initialize version
 **/
class TwoupMessage {
    def welcome = 'Welcome to the twoup game, you start with $10000'
    def done = 'Sorry, you have no money left, goodBye'
}

class TwoupInputConverter {
    /**
     * Method convert() used to cast the input string to the integer number
     * @param input Input String
     * @return Integer Type.
     */
    def convert(input) {
        input.toInteger()
    }

}

class TwoupControl {
    private money = 10000
    private random = new Random()

    /**
     * Method tossWasHead() represents how to generate the Randome number
     * @return Random Number
     */
    private tossWasHead() {
        def next = random.nextInt()
        return next % 2 == 0
    }

    def moreTurns() {
        if (money > 0) {
            println "You have $money, how much would you like to bet?"
            return true
        }
        return false
    }
    /**
     * Method play() represent how to generate 2 coin and then checking the 2 coin
     * @param amount Amount of User's Expenses
     * @return Void
     */
    def play(amount) {
        def coin1 = tossWasHead()
        def coin2 = tossWasHead()
        if (coin1 && coin2) {
            money += amount
            println "You won!"
        } else if (!coin1 && !coin2) {
            money -= amount
            println("You losed")
        } else {
            println("Drawn")
        }
    }

}
