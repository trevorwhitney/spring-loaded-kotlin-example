package springloaded

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class OverflowHeapController(val greetingService: GreetingService) {
    private final val logger = LoggerFactory.getLogger(OverflowHeapController::class.java)

    @RequestMapping("/greeting")
    fun kaboom(): String {
        return greetingService.greeting()
    }
}
