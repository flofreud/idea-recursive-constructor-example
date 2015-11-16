import idea.example.User

class BootStrap {

    def init = { servletContext ->
        new User('user','password').save(failOnError: true)
    }
    def destroy = {
    }
}
