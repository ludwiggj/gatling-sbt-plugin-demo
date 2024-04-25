package runners

import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder
import simulations.computerdatabase.ComputerDatabaseSimulation

object GatlingRunner {

  def main(args: Array[String]): Unit = {
    // this is where you specify the class you want to run
    val simulationClass = classOf[ComputerDatabaseSimulation].getName

    val props = new GatlingPropertiesBuilder
    props.simulationClass(simulationClass)

    Gatling.fromMap(props.build)
  }
}