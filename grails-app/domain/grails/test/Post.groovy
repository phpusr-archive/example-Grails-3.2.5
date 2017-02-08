package grails.test

class Post {

    static constraints = {
        title()
        body()
    }

    String title
    String body

    static hibernateFilters = {
        enabledFilter(condition:'title="Hello"', default: true)
    }

}
