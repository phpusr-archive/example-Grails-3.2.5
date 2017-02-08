package grails.test

import graphicandtabel.auth.Role
import graphicandtabel.auth.User
import graphicandtabel.auth.UserRole

class BootStrap {

    def init = { servletContext ->
        if (!Role.count) {
            final role = new Role(authority: 'ROLE_ADMIN').save(flush: true)
            final user = new User(username: 'admin', password: '123', enabled: true, accountExpired: false, accountLocked: false, passwordExpired: false).save(flush: true)
            new UserRole(user: user, role: role).save(flush: true)
        }
    }
    def destroy = {
    }
}
