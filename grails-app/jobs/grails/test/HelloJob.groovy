package grails.test

class HelloJob {
    static triggers = {
      simple repeatInterval: 5000l // execute job once in 5 seconds
    }

    def execute() {
        log.debug '>> Hello user!'
    }
}
