package grails

/**
 * HotSwap не работает в пакете "grails"
 * В подпакете "test.grails" работает
 */
class HotSwapController {

    def index() {
        render('OK')
    }

}
