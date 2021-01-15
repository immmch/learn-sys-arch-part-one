package test.rainyday;

import spock.lang.Specification;

/**
 * @author: RenChenHao* @date: 2021.1.15 10:07
 */
class QuickStartGroovyTest extends Specification {
    def setup() {
        print 'hello world'
    }         // run before every feature method
    def cleanup() {
        print 'hello world'
    }       // run after every feature method
    def setupSpec() {
        print 'hello world'
    }     // run before the first feature method
    def cleanupSpec() {
        print 'hello world1'
    }   // run after the last feature method
}
