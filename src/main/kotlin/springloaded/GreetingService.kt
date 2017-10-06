package springloaded

import org.springframework.stereotype.Component

@Component
class GreetingService {
    fun greeting(): String {
        return "Hi, ${name()}"
    }

    private fun name(): String {
        return "Amanda"
    }

}
