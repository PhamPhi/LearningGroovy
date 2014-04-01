import com.techie.groovy.designpatterns.AbstractFactory.TwoupMessage

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
class TwoupMessageTest extends GroovyTestCase {
    def message = new TwoupMessage()
    void testIncludingMethods(){
        assert message.welcome != null
        assert message.done != null
    }

    void testMessageContaines(){
        // Checking the welcome and done message then notify the result of testing
        assert message.welcome.contains('Welcome')
        assert message.done.contains('goodBye')
    }
}
