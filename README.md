Gatling plugin for SBT - Scala demo project
===========================================

A simple showcase of an SBT project using the Gatling plugin for SBT. Refer to the plugin documentation
[on the Gatling website](https://gatling.io/docs/current/extensions/sbt_plugin/) for usage.

This project is written in Scala. For other languages, consider using
[our other supported build plugins](https://gatling.io/docs/gatling/reference/current/extensions/).

It includes:

* minimal `build.sbt`, requiring [SBT 1](https://www.scala-sbt.org/download.html)
* latest version of the `io.gatling:gatling-sbt` plugin applied
* sample [Simulation](https://gatling.io/docs/gatling/reference/current/general/concepts/#simulation) class,
  demonstrating sufficient Gatling functionality
* proper source file layout
  * both the `test` and `it` (integration test) configurations are shown

======

Graeme's Section :)
===================

How to Run Simulations
----------------------

__NOTE:__ Don't update the version of Gatling from 3.10.5, as it breaks the `GatlingRunner` and `Engine` classes due to
the removal of the `Gatling.fromMap` method.

See the [Gatling sbt plugin page](https://docs.gatling.io/reference/extensions/build-tools/sbt-plugin/) for more details
about the sbt plugin.

To execute a specific test from sbt:

* ```sbt 'Gatling/testOnly simulations.computerdatabase.ComputerDatabaseSimulation'```
* ```sbt 'GatlingIt/testOnly simulations.computerdatabase.BasicItSimulation'```

To run a specific test from IntelliJ:

* Update the following line in the `GatlingRunner` to point to the test class you want to run:\
```val simulationClass = classOf[ComputerDatabaseSimulation].getName```
* Run the `GatlingRunner` class.
* The Gatling test will run in the Run window of IntelliJ.
* When it's finished you'll see a line like:\
  ```Reports generated, please open the following file: file:///Users/graeludw/GJALWorkspace/gatling-sbt-plugin-demo/results/computerdatabasesimulation-20240425183726340/index.html```
* Click on the link to view the Gatling report in your browser.

To run any test from IntelliJ:

* Run the `Engine` class.
* You'll be prompted to enter a number to pick the test to be run (followed by the return key).
* You'll be prompted for an optional description. Just press return if you don't want a description.
* The selected Gatling test will then run in the Run window of IntelliJ.
* When it's finished you'll see a line like:\
  ```Reports generated, please open the following file: file:///Users/graeludw/GJALWorkspace/gatling-sbt-plugin-demo/results/computerdatabasesimulation-20240425183726340/index.html```
* Click on the link to view the Gatling report in your browser.

Using with "Load Testing with Gatling, The COMPLETE Guide"
----------------------------------------------------------

This project can be used to write and run the simulation examples given in the excellent online Gatling tutorial,
[Load Testing with Gatling, The COMPLETE Guide](https://www.james-willett.com/gatling-load-testing-complete-guide).

Once you've downloaded the [application under test](https://www.james-willett.com/gatling-load-testing-complete-guide/#4-the-application-under-test---the-video-game-db),
and started the video game db app, you should be able to run the `simulations.videogame.MyFirstTest` simulation in this
project and see it pass. Once that's working, you're in good shape to start working through the rest of James' tutorial.

END.