package simulations.videogame

// These imports are both required for all Gatling scripts.
import io.gatling.core.Predef.*
import io.gatling.http.Predef.*

class MyFirstTest extends Simulation {
  // 1 Http Conf
  val httpConf = http
    .baseUrl("http://localhost:8080/app/")
    .acceptHeader("application/json")

  // 2 Scenario definition
  val scn = scenario("My First Test")
    .exec(http("Get All Games").get("videogames"))

  // 3 Load scenario
  setUp(scn.inject(atOnceUsers(1)).protocols(httpConf))
}
